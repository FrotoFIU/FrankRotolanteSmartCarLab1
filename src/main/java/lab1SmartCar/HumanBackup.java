/**
 * 
 */
package lab1SmartCar;

/**
 * @author Frank
 *
 */
public class HumanBackup { //A human support driver can take over the smartCar if anything wrong happens to the Sensors and drive it when low on fuel. 

	/**
	 * @param args
	 */
	private static String Support;
	
	
	public void Talk() {
		Support = "Do you have any questions?";
		System.out.println(Support);
	}
	
	public void Help() {
		Support ="What problems are you having?";
		System.out.println(Support);
	}

}
