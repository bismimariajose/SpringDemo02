package org.studyeasy.car;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;
@Component
public class Corola implements Car{

	public void spec() {
		// TODO Auto-generated method stub
		System.out.println("Sedan by toyota");
	}

}
