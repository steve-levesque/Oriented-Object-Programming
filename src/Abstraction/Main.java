/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Abstraction;
// Abstraction is achieved when instantiating from an interface rather than
// a class to avoid knowing inner details not wanted with the desired implementation.

public class Main {
	public static void main(String[] args) {
		
		// Ram object initialization from different perspectives.
		// From the motherboard class, a global view of the computer is available.
		// From the components interface, the motherboard's info is not useful and the
		// instantiated object focus on the desired implementation only.
		Motherboard ram1 = new Ram1();
		Motherboard ram2 = new Ram2();
		Component cram1 = new Ram1();

		ram1.specs();
		cram1.specs();
		ram2.specs();
		
		System.out.println(ram1.getMotherboardName());
		
		// Cannot know the Motherboard's name from the abstraction, only the specifications as wanted.
		//System.out.println(cram1.getMotherboardName());
		
		System.out.println(ram2.getMotherboardName());
	}
}
