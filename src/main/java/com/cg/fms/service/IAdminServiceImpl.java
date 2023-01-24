package com.cg.fms.service;


import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.advices.ResourceNotFoundException;
import com.cg.fms.dao.AdminDao;
import com.cg.fms.dto.Admin;



@Service
public class IAdminServiceImpl implements IAdminService {
	
	@Autowired
	AdminDao repo;
	

	@Override
	public Admin getAdmin(int id) throws Exception{
		// TODO Auto-generated method stub
		Supplier<Exception> s1 = ()->new ResourceNotFoundException("Admin id is not present in the database");
		Admin am=repo.findById(id).orElseThrow(s1);
		return am;
	}
	
	


	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Admin getAdminByName(String name) {
		// TODO Auto-generated method stub
		//Supplier<Exception> s1 = ()->new ResourceNotFoundException("Admin name is not present in the database");
		Admin a=repo.findByAdminName(name);
		return a;
	}




	@Override
	public String deleteAdmin(int id) throws Exception{
		// TODO Auto-generated method stub
		Supplier<Exception> s1 = ()->new ResourceNotFoundException("Admin id is not present in the database");
		Admin admin=repo.findById(id).orElseThrow(s1);
		if(repo.findById(id) != null) {
		repo.delete(admin);
			return "deleted";
		}else {
			return "entity doesnot exist";
		}
	}




	@Override
	public String updateAdmin(Admin admin) throws Exception{
		// TODO Auto-generated method stub
		Supplier<Exception> s1 = ()->new ResourceNotFoundException("Admin not present in the database");
		Admin a=repo.findById(admin.getAdminid()).orElseThrow(s1);
		repo.save(admin);
		return "updated";
	}




	@Override
	public String addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		repo.save(admin);
		return "added";
	}

}