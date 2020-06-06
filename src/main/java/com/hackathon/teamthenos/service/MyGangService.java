package com.hackathon.teamthenos.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.teamthenos.model.Gang;


public interface MyGangService extends JpaRepository<Gang, Integer>{
	
	 List<Gang> findByEmailId(String emailId);
}
