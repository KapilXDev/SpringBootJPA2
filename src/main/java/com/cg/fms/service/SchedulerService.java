package com.cg.fms.service;

import java.util.List;

import com.cg.fms.dto.Scheduler;

public interface SchedulerService {
	public Scheduler getScheduler(int schedulerId) throws Exception;

	public String addScheduler(Scheduler scheduler);

	public String updateScheduler(Scheduler scheduler) throws Exception;

	public String deleteScheduler(int schedulerId) throws Exception;

	public List<Scheduler> getAllSchedulers();
}
