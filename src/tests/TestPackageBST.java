package tests;
import campusdispatch.PackageBST;
import campusdispatch.Package;

public class TestPackageBST {

	public static void main(String[] args) {
		
		PackageBST packageBST = new PackageBST();
		
		System.out.println(packageBST.insert(new Package("P50", "Building A")));
		System.out.println(packageBST.insert(new Package("P30", "Building D")));
		System.out.println(packageBST.insert(new Package("P70","Bulding B")));
		System.out.println(packageBST.insert(new Package("P10", "Building C")));
		System.out.println(packageBST.insert(new Package("P40", "Building F")));
		System.out.println(packageBST.insert(new Package("P40", "Building F")));
		
		
		Package searchResult = packageBST.search("P70");
		
		System.out.println("\nAdding existing package (P30): ");
		System.out.println(packageBST.insert(new Package("P30", "Building D")));
		
		if(searchResult != null ) {
			System.out.println("Package found! ");
			System.out.println(searchResult);
		}else {
			System.out.println("Package not found. ");
		}
		
		System.out.println("Display all Packages in sorted order: ");
		packageBST.displayPackages();
		
		System.out.println("\nRemoving P30.....");
		packageBST.delete("P30");
		packageBST.displayPackages();
		
		System.out.println("\nUsing contains for P40: ");
		System.out.println( packageBST.contains("P40"));
		

	}

}
