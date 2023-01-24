package com.cg.fms.service;

import java.util.List;

import com.cg.fms.dto.Land;

public interface LandService {
	public Land getLand(int surveyNumber) throws Exception;

	public String addLand(Land land);

	public String updateLand(Land land) throws Exception;

	public String removeLandDetails(int landId) throws Exception;
	
	public List<Land> getAllLands();
}
