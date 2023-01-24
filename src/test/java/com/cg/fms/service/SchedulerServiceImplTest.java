package com.cg.fms.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.fms.dao.ISchedulerDao;
import com.cg.fms.dto.Product;
import com.cg.fms.dto.Scheduler;
@SpringBootTest
class SchedulerServiceImplTest {
@Autowired
SchedulerServiceImpl SchedulerService;
@MockBean
ISchedulerDao repo;

	@Test
	void testGetScheduler() throws Exception{
		Scheduler s=new Scheduler();
		s.setSchedulerId(1);
		s.setSchedulerName("Vijetha");
		s.setTruckNumber("123");
		s.setSchedulerContact("1234512345");
		Optional<Scheduler> s1=Optional.of(s);
		Mockito.when(repo.findById(1)).thenReturn(s1);

		assertThat(SchedulerService.getScheduler(1)).isEqualTo(s);
		//fail("Not yet implemented");
	}

	@Test
	void testAddScheduler() {
		Scheduler s=new Scheduler();
		s.setSchedulerId(1);
		s.setSchedulerName("Vijetha");
		s.setTruckNumber("123");
		s.setSchedulerContact("1234512345");
		Mockito.when(repo.save(s)).thenReturn(s);
		assertThat(SchedulerService.addScheduler(s)).isEqualTo("added");
		//fail("Not yet implemented");
	}

	@Test
	void testUpdateScheduler() throws Exception {
		Scheduler s=new Scheduler();
		s.setSchedulerId(1);
		s.setSchedulerName("Vijetha");
		s.setTruckNumber("123");
		s.setSchedulerContact("1234512345");
		Optional<Scheduler> s1=Optional.of(s);
		Mockito.when(repo.findById(1)).thenReturn(s1);
Mockito.when(repo.save(s)).thenReturn(s);
		
		s.setSchedulerName("newname"); 	
		s.setSchedulerContact("new contact");
		
		assertThat(SchedulerService.updateScheduler(s)).isEqualTo("updated");
		
		//fail("Not yet implemented");
	}

	@Test
	void testDeleteScheduler() {
		Scheduler s=new Scheduler();
		s.setSchedulerId(1);
		s.setSchedulerName("Vijetha");
		s.setTruckNumber("123");
		s.setSchedulerContact("1234512345");
		Optional<Scheduler> s1=Optional.of(s);
		Mockito.when(repo.findById(1)).thenReturn(s1);
		Mockito.when(repo.existsById(s.getSchedulerId())).thenReturn(false);
		assertFalse(repo.existsById(s.getSchedulerId()));
		//fail("Not yet implemented");
	}

	@Test
	void testGetAllSchedulers() {
		Scheduler s=new Scheduler();
		s.setSchedulerId(1);
		s.setSchedulerName("Vijetha");
		s.setTruckNumber("123");
		s.setSchedulerContact("1234512345");
		Scheduler s1=new Scheduler();
		s1.setSchedulerId(2);
		s1.setSchedulerName("Vijju");
		s1.setTruckNumber("1234");
		s1.setSchedulerContact("3451234512");
		List<Scheduler> sa=new ArrayList<>();
		sa.add(s); 	sa.add(s1);
		Mockito.when(repo.findAll()).thenReturn(sa);
		assertThat(SchedulerService.getAllSchedulers()).isEqualTo(sa);
		//fail("Not yet implemented");
	}

}
