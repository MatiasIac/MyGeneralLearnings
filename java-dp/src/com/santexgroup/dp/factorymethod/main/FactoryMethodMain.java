package com.santexgroup.dp.factorymethod.main;

import com.santexgroup.dp.factorymethod.model.Creator;
import com.santexgroup.dp.factorymethod.model.Vehicle;
import com.santexgroup.dp.factorymethod.model.VehicleCreator;

public class FactoryMethodMain {
	public static void main(String[] args) {
		Creator creator = new VehicleCreator();
		
		Vehicle vehicle = creator.create("bike");
		System.out.println(vehicle.getDescription());
		
		vehicle = creator.create("car");
		System.out.println(vehicle.getDescription());
		
		vehicle = creator.create("pickup");
		System.out.println(vehicle.getDescription());
	}
}
