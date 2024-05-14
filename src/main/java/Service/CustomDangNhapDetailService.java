package Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.GrantedAuthoritiesContainer;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;

import Model.CHUCVU;
import Model.CustomUserDetails;
import Model.NHANVIEN;
import jakarta.transaction.Transactional;

@Service
public class CustomDangNhapDetailService implements UserDetailsService {
    @Autowired
    private DangNhapService dnService;

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        NHANVIEN nv = dnService.findByTenTaiKhoan(username);
        if (nv == null) {
            throw new UsernameNotFoundException("Sai tên tài khoản");
        }

        CHUCVU chucVu = nv.getChucVu(); // Truy cập đối tượng CHUCVU
        if (chucVu == null) {
            throw new UsernameNotFoundException("Nhân viên không có chức vụ được chỉ định");
        }

        Collection<GrantedAuthority> grantedAuthoritySet = new HashSet<>();
        grantedAuthoritySet.add(new SimpleGrantedAuthority(chucVu.getTenChucVu()));

        return new CustomUserDetails(nv, grantedAuthoritySet);
    }
}
