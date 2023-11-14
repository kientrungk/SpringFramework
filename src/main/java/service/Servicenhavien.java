package service;

import java.util.List;

import org.springframework.stereotype.Service;

import set.setNhanvIen;
@Service
public interface Servicenhavien {
	List<setNhanvIen> findAll();
	setNhanvIen save(setNhanvIen dto);
	

}
