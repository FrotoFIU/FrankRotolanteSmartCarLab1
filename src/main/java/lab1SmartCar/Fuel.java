/**
 * 
 */
package lab1SmartCar;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author FrankRotolante
 *
 */
public class Fuel implements SelfCheckCapable{ // used in the selfCheckCapable to find if the fuel levels respond properly. 

	private static int BatteryLevel;
	private static int Gasoline;
	
	public static void Refuel() {
		if (Gasoline < 25) {
			System.out.println("Gas level low. Please Refuel!");
		}
		
		else {
			System.out.println("Gasoline level at " + Gasoline + " Percent");
		}
		
	}
	
	public static void Recharge() {
		if(BatteryLevel <= 20) {
			System.out.println("Battery level low. Please recharge at neareset charging area!");
		}
		
		else {
			System.out.println("Battery Level at " +BatteryLevel + "percent");
		}
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Fuel levels";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

}
