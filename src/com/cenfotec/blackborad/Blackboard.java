package com.cenfotec.blackborad;

import java.util.ArrayList;
import java.util.List;

import com.cenfotec.resource.Resource;

public class Blackboard {
	List<Resource> listaRecurso;
	public Blackboard() {
		listaRecurso = new ArrayList<Resource>();
	}
	public List<Resource> getListaRecurso() {
		return listaRecurso;
	}
	
	
	
}
