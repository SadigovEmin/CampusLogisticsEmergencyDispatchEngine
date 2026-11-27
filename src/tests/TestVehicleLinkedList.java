package tests;
import campusdispatch.VehicleLinkedList;
import campusdispatch.Vehicle;
import campusdispatch.VehicleStatus;

public class TestVehicleLinkedList {

	public static void main(String[] args) {
		
		VehicleLinkedList vehicles = new VehicleLinkedList();
		
		Vehicle v1 = new Vehicle(
                "V1", "A", true, true);

        Vehicle v2 = new Vehicle(
                "V2", "B", true, false);

        Vehicle v3 = new Vehicle(
                "V3", "C", false, true);

        System.out.println("=== ADD VEHICLES ===");

        System.out.println(vehicles.addVehicle(v1));
        System.out.println(vehicles.addVehicle(v2));
        System.out.println(vehicles.addVehicle(v3));

        System.out.println("\n=== DUPLICATE TEST ===");

        System.out.println(vehicles.addVehicle(
                new Vehicle("V1", "D", true, true)));

        System.out.println("\n=== DISPLAY VEHICLES ===");

        vehicles.displayVehicles();

        System.out.println("\n=== SEARCH TEST ===");

        System.out.println(vehicles.findVehicle("V2"));

        System.out.println("\n=== UPDATE STATUS ===");

        vehicles.updateVehicleStatus("V2", VehicleStatus.BUSY);

        System.out.println(vehicles.findVehicle("V2"));

        System.out.println("\n=== REMOVE VEHICLE ===");

        System.out.println(vehicles.removeVehicle("V1"));

        vehicles.displayVehicles();

	}

}
