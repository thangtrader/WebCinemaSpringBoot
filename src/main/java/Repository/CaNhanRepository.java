package Repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Model.NHANVIEN;

@Repository
public interface CaNhanRepository extends JpaRepository<NHANVIEN, String> {
    @Query(value = "SELECT * FROM NHAN_VIEN WHERE TenTaiKhoan = :tenTaiKhoan", nativeQuery = true)
    NHANVIEN findByTenTaiKhoan(@Param("tenTaiKhoan") String tenTaiKhoan);

}
