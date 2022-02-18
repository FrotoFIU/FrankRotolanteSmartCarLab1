/**
 * 
 */
package lab1SmartCar;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Frank
 *
 */
public class SelfDiagnostic implements SelfCheckCapable { // used in selfCheckCapable to find if it can perform a self diagnostic on itself.

	private int Battery;
	private int Gas;
	private int TirePressure;
	private String Surrounding;
	
	public  String Diagnostic() {
		System.out.println("Battery Level at" + Battery + " Percent");
		System.out.println("Gas Level at" + Gas + " Percent");
		System.out.println("Tire Pressure at" + TirePressure + " PSI");
		System.out.println("There are " + Surrounding + "in front and behind the vehicle");
		return "Self Diagnostic checks are complete";
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Starting self diagnostic";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
}
