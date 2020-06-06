package com.hackathon.teamthenos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.teamthenos.model.Gang;
import com.hackathon.teamthenos.model.Story;
import com.hackathon.teamthenos.service.MyGangService;
import com.hackathon.teamthenos.service.StoryService;

import javax.ws.rs.core.Response;

@CrossOrigin
@RestController
public class MyGangController {

    @Autowired
    private MyGangService myGangService;

    @RequestMapping(value = "/gang/{emailId}", method = RequestMethod.GET)
    List<Gang> getStories(@PathVariable String emailId){
        return  myGangService.findByEmailId(emailId);
    }

    @RequestMapping(value = "/gang", method = RequestMethod.POST)
    String addGang(@RequestBody Gang gang){
        Gang savedGang = myGangService.save(gang);
        return "SUCCESS";
    }


    @RequestMapping(value = "/gangs", method = RequestMethod.GET)
    List<Gang> getAllGangs(){
        return myGangService.findAll();
    }

}
