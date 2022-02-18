/**
 * 
 */
package edu.fiu.jit.appexample;

import edu.fiu.jit.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A simple example main component. You can add a main method to
 * your main component class if you want to execute your app with it.
 * 
 * @author Frank Rotolante
 *
 */
public class MainComponent implements GenericComponent {
	private String name;
	private CompositeComponent mycompositecomponent;
	private BasicPart[] mysubcomponents;
	
	/**
	 * Basic constructor that creates this component and 5 subcomponents
	 */
	public MainComponent() {
		this.name = "My main component";
		mycompositecomponent = new CompositeComponent();
		mysubcomponents = new BasicPart[5]; 
		
		for(int i = 0; i < mysubcomponents.length; i++) {
			mysubcomponents[i] = new BasicPart("Component " + i);
		}
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		// TODO Auto-generated method stub
		List<SelfCheckCapable> internals = new ArrayList<SelfCheckCapable>();
		Collections.addAll(internals, mycompositecomponent);
		Collections.addAll(internals, mysubcomponents);
		return internals;
	}
	
	@Override
	public String toString() {
		String text = this.name + "\n";
		text += "Internal parts: ";
		for(int i = 0; i < mysubcomponents.length; i++) {
			if (i > 0) text += ", ";
			text +=mysubcomponents[i].getComponentName();
		} 
		text += "\nOther items: " + mycompositecomponent;
		return text;
	}
	
	/**
	 * Main method to run the main component
	 * @param args command line arguments (unused)
	 */
	public static void main(String[] args) {
		MainComponent mymaincomponent = new MainComponent();
		System.out.println("My component is: " + mymaincomponent);
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.05);
	}

}
