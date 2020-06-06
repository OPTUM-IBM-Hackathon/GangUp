package com.hackathon.teamthenos.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.teamthenos.model.Story;

public interface StoryService extends JpaRepository<Story, Integer>{
	
	 List<Story> findByEmailId(String emailId);
}
