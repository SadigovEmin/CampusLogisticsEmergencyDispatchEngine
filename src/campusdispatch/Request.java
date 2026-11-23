package campusdispatch;

public class Request {
	private String requestId;
	private String destination;
	private int arrivalNumber;
	private RequestType type;
	private RequestStatus status;
	
	private String packageId;
	private int urgency;
	
	private String assignedVehicleId;
	
	public Request (String requestId, String destination, int arrivalNumber, RequestType type, String packageId, int urgency) {
		
		this.requestId = requestId;
		this.destination = destination;
		this.arrivalNumber = arrivalNumber;
		this.type = type;
		this.packageId = packageId;
		this.urgency = urgency;
		this.status = RequestStatus.PENDING;
		this.assignedVehicleId = null;
		
	}
	
	public String getRequestId() {
		return requestId;
	}
	
	public String getDestiantion() {
		return destination;
	}
	
	public int getArrivalNumber() {
		return arrivalNumber;
		
	}
	
	public RequestType getType() {
		return type;
	}
	
	public RequestStatus getStatus() {
		return status;
	}
	
	public String getPackageId() {
		return packageId;
	}
	
	public int getUrgency() {
		return urgency;
	}
	
	public String getAssignedVehicle() {
		return assignedVehicleId;
	}
	
	public void setStatus(RequestStatus status) {
		this.status = status;
	}
	
	public void setAssignedVehicleId(String assignedVehicleId) {
		this.assignedVehicleId = assignedVehicleId;
	}
	
	@Override
	public String toString() {
		return "Request ID: " + requestId
				+"\nType: " + type
				+ "\nDestination: " + destination
				+ "\nArrival: " + arrivalNumber
				+ "\nStatus: " + status
				+ "\nPackage ID: " + packageId
				+ "\nUrgency: " + urgency
				+ "\nVehicle: " + assignedVehicleId;
	}
}
