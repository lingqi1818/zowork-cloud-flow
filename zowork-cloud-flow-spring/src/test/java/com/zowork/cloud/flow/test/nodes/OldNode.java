package com.zowork.cloud.flow.test.nodes;

import com.zowork.cloud.flow.test.model.PersonModel;

public class OldNode {
	PersonModel execute() {
		System.out.println("execute====================="+this.getClass());
		PersonModel model = new PersonModel();
		model.setName("old");
		return model;
	}
}
