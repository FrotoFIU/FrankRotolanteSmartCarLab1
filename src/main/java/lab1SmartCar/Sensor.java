/**
 * 
 */
package lab1SmartCar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author Frank
 *
 */
public class Sensor implements SelfCheckCapable{ //used in selfCheck to find if the sensors are working

	private String LidarSensor;
	private String CameraSensor;
	private String RadarSensor;
	
	public void ScanArea() {
		LidarSensor = "Scanning area with lasers!";
		CameraSensor = "Scanning area with camera!";
		RadarSensor = "Scanning area with radar!";
		System.out.println(LidarSensor + CameraSensor + RadarSensor);
		
		
	}
	
	public void CapturePhoto() {
		System.out.println("Photo Taken");
	}
	
	public void RecordVideo() {
		System.out.println("Video recording!");
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Sensors";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.2);
	}
}

