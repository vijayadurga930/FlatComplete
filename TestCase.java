package com.cg.frs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.frs.dto.FlatOwner;
import com.cg.frs.exception.OwnerException;
import com.cg.frs.service.FlatRegistrationServiceImpl;

public  class TestCase {
	static FlatRegistrationServiceImpl service;
      FlatOwner flatowner;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	service=new FlatRegistrationServiceImpl();	
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		service=null;
	}

	@BeforeEach
	void setUp() throws Exception {
		flatowner=new FlatOwner(100,"vaishali",968790);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		flatowner=null;
	}

	@Test
	public void testisValidateName() {
		try {
			assertNotNull(service.isNamevalid("vaishali"));
		}catch(OwnerException e) {
			
		}
	}
	
	@Test
	public void testisValidatePhone() {
		try {
			assertNotNull(service.isPhonevalid("908367"));
		}catch(OwnerException e) {
			
		}

	}
}
