package com.cg.fms.service;



import java.util.List;

import com.cg.fms.dto.Admin;



public interface IAdminService {

	Admin getAdmin(int id) throws Exception;
	List<Admin> getAllAdmins();
	Admin getAdminByName(String name);
	String deleteAdmin(int id) throws Exception;
	String updateAdmin(Admin admin) throws Exception;
	String addAdmin(Admin admin);
	
}
