package model.interpreter;

/**
 * Content used during the analysis process
 * 
 * @author beto
 *
 */
public class InterpreterContext {

	private String vehiclePlate;
	private boolean isValid;

	public String getVehiclePlate() {
		return vehiclePlate;
	}

	public void setVehiclePlate(String vehiclePlate) {
		this.vehiclePlate = vehiclePlate;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

}
