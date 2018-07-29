package com.cenfotec.cliente;

import com.cenfotec.blackborad.Blackboard;
import com.cenfotec.controller.BlackboardController;
import com.cenfotec.resource.DictionaryResource;
import com.cenfotec.resource.MathResource;

public class Main {

	public static void main(String[] args) {
		Blackboard pizarra = new Blackboard();
		pizarra.getListaRecurso().add(new DictionaryResource());
		pizarra.getListaRecurso().add(new MathResource());
		BlackboardController controller = new BlackboardController(pizarra);
		
		controller.executeProcesses();
		
	}

}
