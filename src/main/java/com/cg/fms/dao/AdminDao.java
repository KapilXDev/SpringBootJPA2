package com.cg.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.dto.Admin;



@Repository
public interface AdminDao extends JpaRepository<Admin, Integer>{
	
	//@Query("Select a from Admin a where a.adminName=adminName")
	Admin findByAdminName(String adminName);

	/*@Query("Delete from Admin a where a.adminName=admin.getAdminName()")
	boolean deleteAdmin(Admin admin);
	
	//@Query("Select a from Admin a")
	List<Admin> findAll();*/
}
