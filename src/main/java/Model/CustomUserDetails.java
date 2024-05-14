package Model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {
	
	private NHANVIEN nv;
	private Collection<? extends GrantedAuthority> authorities;
	
	
	
	public CustomUserDetails(NHANVIEN nv, Collection<? extends GrantedAuthority> authorities) {
		super();
		this.nv = nv;
		this.authorities = authorities;
	}
	
	public CustomUserDetails() {

	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return nv.getMatKhau();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return nv.getTenTaiKhoan();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
