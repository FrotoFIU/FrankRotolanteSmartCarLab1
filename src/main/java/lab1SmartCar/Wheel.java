/**
 * 
 */
package lab1SmartCar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author FrankRotolante 
 *
 */
public class Wheel implements SelfCheckCapable { // used in selfCheckCapable to show if the wheels are working(tire pressure)
 
	private String FrontWheels;
	private String RearWheels;
	
	public String LeftTurn() {
		FrontWheels = "Front wheels are turning left!";
		return FrontWheels;
			
	}
	
	
	public String RightTurn() {
		FrontWheels = "Front wheels are turning right!";
		return FrontWheels;
	}
	
	public String Foward() {
		RearWheels = "Rear wheels are moving foward!";
		return RearWheels;
	}
	
	public String Reverse() {
		RearWheels = "Rear wheels are moving backwards!";
		return RearWheels;
	}
	
	public String Brake() {
		RearWheels = "Rear wheels are Braking!";
		return RearWheels;
	}
	public String SpinLeft() {
		FrontWheels = "Wheels are moving to the left";
		RearWheels = "Wheels are moving Foward";
		return FrontWheels + " and " + RearWheels +" Car is spinning to the left!";
				
	}
	
	public String SpinRight() {
		FrontWheels = "Wheels are moving to the right";
		RearWheels = "Wheels are moving Foward";
		return FrontWheels + " and " + RearWheels +" Car is spinning to the right!";
				
	}


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Wheels";
	}


	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.3);
	}

	
}
