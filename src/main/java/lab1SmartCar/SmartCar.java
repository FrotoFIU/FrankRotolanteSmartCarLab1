package lab1SmartCar;

import edu.fiu.jit.EmptyComponent;
import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
 * @author FrankRotolante 
 * 
 */

public final class SmartCar extends EmptyComponent implements GenericComponent{

public static Scanner key = new Scanner(System.in);	
	

	private static String WaymoOne; //string is the smart car the user will use and has a choice between two smart cars
	private static String WaymoVia;
	
	private static String myCar; //variables used to create constructor 	
	private SelfDiagnostic myDiagnostic;
	private Computer myComputer;
	private Fuel myFuel;
	private Wheel myWheels;
	private HumanBackup myHumanBackup;
	private Sensor mySensors; 
	
	public SmartCar() { //class used to be the constructor 
		myDiagnostic = new SelfDiagnostic();
		myComputer = new Computer();
		myFuel = new Fuel();
		myWheels = new Wheel();
		myHumanBackup = new HumanBackup();
		mySensors = new Sensor();
	}
		
	public static String Personalize() {
		int userResponse = 1;		//user inputs response here and it is used to pick between the two smart cars.
		
		do {
		System.out.println("What Waymo Smart car do you  want to use? \n 1.WaymoOne \n 2.WaymoVia"); //Asks the user to pick between two cars.
		userResponse = key.nextInt();
		
		if (userResponse == 1) {
			System.out.println("Thanks for picking the Waymo One!");
			WaymoOne = "Waymo One";
			myCar = WaymoOne;
			return WaymoOne;
			
		}
		
		else if (userResponse == 2) {
			System.out.println("Thanks for picking Waymo Via!");
			WaymoVia = "Waymo Via";
			myCar = WaymoVia;
			return WaymoVia;
		}
		
		else {
			System.out.println( "no car selected. Please select one of the two options!");
			
		}
		} while (userResponse != 1 || userResponse != 2 );
		System.out.println(myCar);
		return myCar;
	}
	
	public static String StartRide() { //method used to tell user that the ride to destination has started.
		return "Starting ride to destination";
	}
	
	public String getComponentName() { //having trouble with the static method here because of SelfCheckCapable
		// TODO Auto-generated method stub
		return "Waymo SmartCar";
	}
	
	public boolean selfCheck() {
		return true;
	}
	
	public List<SelfCheckCapable> getSubComponents() {
		List<SelfCheckCapable> internalComponents = new ArrayList<SelfCheckCapable>(); // create an empty list
		Collections.addAll(internalComponents, myDiagnostic, myFuel, myWheels, mySensors, myComputer); // add all your sub components
		return internalComponents;
	}
	
	
	public static void main(String[] args) { //Main class used to run the superClass SmartCar
		// TODO Auto-generated method stub
        Personalize();
        StartRide();        
	}





	

}
