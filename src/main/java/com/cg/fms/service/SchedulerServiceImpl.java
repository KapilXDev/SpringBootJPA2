package com.cg.fms.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.advices.ResourceNotFoundException;
import com.cg.fms.dao.ISchedulerDao;
import com.cg.fms.dto.Scheduler;

@Service
public class SchedulerServiceImpl implements SchedulerService{
	
	@Autowired
	ISchedulerDao repo;

	@Override
	public Scheduler getScheduler(int schedulerId) throws Exception {
		// TODO Auto-generated method stub
		Supplier<Exception> s1 = ()->new ResourceNotFoundException("Scheduler id is not present in the database");
		return repo.findById(schedulerId).orElseThrow(s1);
	}

	@Override
	public String addScheduler(Scheduler scheduler) {
		// TODO Auto-generated method stub
			repo.save(scheduler);
			return "added";
	}

	@Override
	public String updateScheduler(Scheduler scheduler) throws Exception {
		// TODO Auto-generated method stub
		Supplier<Exception> s1 = ()->new ResourceNotFoundException("Scheduler id is not present in the database");
			Scheduler s=repo.findById(scheduler.getSchedulerId()).orElseThrow(s1);
			repo.save(scheduler);
			return "updated";
	}

	@Override
	public String deleteScheduler(int schedulerId) throws Exception {
		// TODO Auto-generated method stub
		Supplier<Exception> s1 = ()->new ResourceNotFoundException("Scheduler id is not present in the database");
		Scheduler s=repo.findById(schedulerId).orElseThrow(s1);
			repo.delete(s);
			return "deleted";
	}

	@Override
	public List<Scheduler> getAllSchedulers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
