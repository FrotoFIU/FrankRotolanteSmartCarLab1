package lab1SmartCar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Computer implements SelfCheckCapable{ // used in selfCheckCapable to find if the computer is working.

	private static String AI;
	
	public static void compute() {
		AI = "Computing Simulation from point A to point B";
		System.out.println(AI);
	}
	
	public String simulate() {
		return "Simulating travel from starting point to destination ";
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Computer AI";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.3);
	}
}
