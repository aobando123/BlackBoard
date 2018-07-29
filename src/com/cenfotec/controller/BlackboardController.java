package com.cenfotec.controller;

import com.cenfotec.blackborad.Blackboard;
import com.cenfotec.resource.Resource;

public class BlackboardController {
	private Blackboard pizarra;
	
	public BlackboardController(Blackboard pizarra) {
		this.pizarra = pizarra;
	}
	
	public void executeProcesses() {
		for(Resource resource : pizarra.getListaRecurso()) {
			resource.executeAction();
		}
	}
}
