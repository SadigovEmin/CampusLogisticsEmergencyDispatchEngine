package campusdispatch;

public class Package {
	private String packageId;
	private String destination;
	
	public Package(String packageId, String destination) {
		this.packageId = packageId;
		this.destination = destination;
		
	}
	
	public String getPackageId() {
		return packageId;
	}
	
	public String getDestination() {
		return destination;
	}
	
	@Override
	public String toString() {
		return "Package ID: " + packageId + ", Destiantion: " + destination;
	}
}
