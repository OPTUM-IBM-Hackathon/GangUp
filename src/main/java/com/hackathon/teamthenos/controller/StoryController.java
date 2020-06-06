package com.hackathon.teamthenos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.teamthenos.model.Story;
import com.hackathon.teamthenos.service.StoryService;

import javax.ws.rs.core.Response;

@CrossOrigin
@RestController
public class StoryController {

    @Autowired
    private StoryService storiesService;

    @RequestMapping(value = "/stories/{emailId}", method = RequestMethod.GET)
    List<Story> getStories(@PathVariable String emailId){
        return  storiesService.findByEmailId(emailId);
    }

    @RequestMapping(value = "/story", method = RequestMethod.POST)
    String addStory(@RequestBody Story story){
        Story savedStory = storiesService.save(story);
        return "SUCCESS";
    }

    @RequestMapping(value = "/stories", method = RequestMethod.GET)
    List<Story> getAllStories(){
        return storiesService.findAll();
    }

}
