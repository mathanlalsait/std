package com.springboot.studentProject.service;

import java.util.List;

import com.springboot.studentProject.model.State;

public interface StateService {

public void saveState(State state);
public List<State> getSateList();
	
}
