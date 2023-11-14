package implservice;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import entity.NhanVienEntity;
import path.EmployeeConVert;
import reponsitory.Reponsitory;
import service.Servicenhavien;
import set.setNhanvIen;
@Service
public class ServiceImplnv implements Servicenhavien {
    
	@Autowired
	private Reponsitory repon;
	
	   
	@Autowired
	private EmployeeConVert set;

	@Override
	public List<setNhanvIen> findAll() {
		List<setNhanvIen> employee = new ArrayList<>();
		
		List<NhanVienEntity> entites=repon.findAll();
		for (NhanVienEntity item: entites) {
			setNhanvIen DTO= set.toDTO(item);
		
			employee.add( DTO);
		}
		return employee;
	}

	@Override
	public setNhanvIen save(setNhanvIen stentity) {
		// TODO Auto-generated method stub
		NhanVienEntity enti=new NhanVienEntity();
		return set.toDTO(repon.save(enti));
	}



	

}
