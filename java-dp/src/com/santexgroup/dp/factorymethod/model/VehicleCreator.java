package com.santexgroup.dp.factorymethod.model;

public class VehicleCreator implements Creator {

	@Override
	public Vehicle create(String type) {

		if (type.equals("bike")) {
			return new Bike();
		}

		if (type.equals("car")) {
			return new Car();
		}
		if (type.equals("pickup")) {
			return new PickUp();
		}

		return null;

	}

}
