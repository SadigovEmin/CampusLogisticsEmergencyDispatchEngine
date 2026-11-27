package campusdispatch;

public class VehicleLinkedList {
	
	private class Node{
		
		Vehicle data;
		Node next;
		
		Node(Vehicle data){
			this.data = data;
			next = null;
		}
		
	}
	
	private Node head;
	
	public boolean addVehicle(Vehicle vehicle) {
		
		if(findVehicle(vehicle.getVehicleId()) != null ) {
			return false;
		}
		
		Node newVehicle = new Node(vehicle);
		
		if(head == null) {
			head = newVehicle;
			return true;
		}
		
		Node current = head;
		
		while(current.next != null ) {
			current = current.next;
		}
		
		current.next = newVehicle;
		
		return true;
	}
	
	public Vehicle  findVehicle(String vehicleId) {
		
		Node current = head;
		
		while(current != null) {
			if (current.data.getVehicleId().equals(vehicleId)) {
				return current.data;
			}
			
			current = current.next;
		}
		
		return null;
	}
	
	public boolean removeVehicle(String vehicleId) {
		
		if(head == null) {
			return false;
		}
		
		if(head.data.getVehicleId().equals(vehicleId)) {
			head = head.next;
			return true;
		}
		
		Node current = head;
		
		while (current.next != null) {
			
			if(current.next.data.getVehicleId().equals(vehicleId)) {
				current.next = current.next.next;
				return true;
			}
			
			current = current.next;
		}
		
		return false;
	}
	
	public boolean updateVehicleStatus(String vehicleId, VehicleStatus newStatus) {
		
		Vehicle vehicle = findVehicle(vehicleId);
		
		if(vehicle == null ) {
			return false;
		}
		
		vehicle.setStatus(newStatus);
		return true;
	}
	
	public void displayVehicles() {
		
		if(head == null) {
			System.out.println("No vehicles to display.");
			return;
		}
		
		Node current = head;
		
		while(current != null) {
			
			System.out.println(current.data + "\n");
			
			current = current.next;
		}
		System.out.println();
		
		
	}
	
	
}
