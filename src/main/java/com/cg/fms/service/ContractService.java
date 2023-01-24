package com.cg.fms.service;

import java.util.List;

import com.cg.fms.dto.Contract;

public interface ContractService {
	
	public Contract getContract(int contractNumber) throws Exception;
	public String addContract(Contract contract);
	public String updateContract(Contract contract) throws Exception;
	public String deleteContract(int contractNumber) throws Exception;
	public List<Contract> getAllContracts();
}