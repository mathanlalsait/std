package com.springboot.studentProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studentProject.model.State;
import com.springboot.studentProject.service.StateService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/state")
public class StateController {

	@Autowired
	public StateService stateService;
	
	@PostMapping("/create")
	public ResponseEntity<State> createState(@RequestBody State state){
		String[] states = {"Kerala","Karnataka"};
		
	stateService.saveState(state);
	System.out.println("Created State " + state);
	return new ResponseEntity<State>(state, HttpStatus.CREATED);
}
	@GetMapping("/getAll")
	 public ResponseEntity<List<State>> getAllStates(){
		List<State> stateList = stateService.getSateList();
		System.out.println(stateList);
		return new ResponseEntity<List<State>>(stateList, HttpStatus.OK);
	}
}
