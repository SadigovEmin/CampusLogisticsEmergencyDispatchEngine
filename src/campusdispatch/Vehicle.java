package campusdispatch;

public class Vehicle {
	private String vehicleId;
	private String currentLocation;
	private boolean canHandleRoutine;
	private boolean canHandleEmergency;
	private VehicleStatus status;
	
	public Vehicle(String vehicleId, String currentLocation, boolean canHandleRoutine, boolean canHandleEmergency) {
		this.vehicleId = vehicleId;
		this.currentLocation = currentLocation;
		this.canHandleRoutine = canHandleRoutine;
		this.canHandleEmergency = canHandleEmergency;
		this.status = VehicleStatus.AVAILABLE;
	}
	
	public String getVehicleId() {
		return vehicleId;
	}
	
	public String getCurrentLocation() {
		return currentLocation;
	}
	
	public boolean canHandleRoutine() {
		return canHandleRoutine;
	}
	
	public boolean canHandleEmergency() {
		return canHandleEmergency;
	}
	
	public VehicleStatus getStatus() {
		return status;
	}
	
	public void setStatus(VehicleStatus status) {
		this.status = status;
	}
	
	public void setLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	
	@Override
	public String toString() {
		return "Vehicle ID: " + vehicleId
				+ ",\nLocation: " + currentLocation
				+",\nRoutine: " + canHandleRoutine
				+",\nEmergency: " + canHandleEmergency
				+",\nStatus: " + status;
	}
}
