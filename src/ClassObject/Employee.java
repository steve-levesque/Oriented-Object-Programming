/**
 * 
 * @author Steve Lévesque
 * GitHub/GitLab : steve-levesque
 *
 * All rights reserved - Tous droits réservés
 * 
 */

package ClassObject;

public class Employee {
	String name;
	String type;
	
	public Employee(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public void work() {
		if (type == "Manager")
			System.out.println("Go back to work.");
		else
			System.out.println("I am going back to work.");
	}
	
	public void talk() {
		System.out.println("Hi, my name is " +name);
	}
}
