/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Inheritance;
// Inheritance is effective to reuse code from a super class to all classes
// that could have repeatable code or from an interface if there are repeatable methods.

public class Main {
	public static void main(String[] args) {
		Phone p = new Phone();
		Phone sm = new Smartphone();
		
		// Super class.
		System.out.println("Starting Phone...");
		p.call();
		p.text();
		p.music();
		p.apps();
		
		// Sub class.
		System.out.println("Starting Smartphone...");
		// From the super class.
		sm.call();
		sm.text();
		// Overridden methods.
		sm.music();
		sm.apps();
	}
}
