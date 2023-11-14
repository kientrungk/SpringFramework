package path;

import org.springframework.stereotype.Component;

import entity.NhanVienEntity;
import set.setNhanvIen;
@Component
public class EmployeeConVert {
		
	public setNhanvIen toDTO(NhanVienEntity entity) {
		setNhanvIen dto=new setNhanvIen();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setWage(entity.getWage());
		
		return dto;
		
	}

}
