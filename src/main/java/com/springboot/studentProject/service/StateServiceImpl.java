package com.springboot.studentProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.studentProject.model.State;
import com.springboot.studentProject.repository.StateRepository;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	public StateRepository stateRepository;
	

public void saveState(State state) {
	stateRepository.save(state);
	}
		
public List<State> getSateList(){
	return (List<State>) stateRepository.findAll();
	}

}
