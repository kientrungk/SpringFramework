package reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.NhanVienEntity;
@Repository
public interface Reponsitory extends JpaRepository<NhanVienEntity, Long>{

}
