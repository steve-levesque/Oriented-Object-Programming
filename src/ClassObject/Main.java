/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package ClassObject;
// Not defined in most definitions of OOP as a main pillar, but the classes and objects
// are the bases of programming.

// The class is a plan used when instantiating an object. It contains all the specifications like
// it's name, possible modifiers (public or private), interfaces and/or super classes and the most
// important, a body where lies all the methods and wanted interactions.

// The object is a result of instantiation from a class (with or without an interface) and
// it can use all the specifications of the class in a program.

public class Main {
	public static void main(String[] args) {
		// Instantiation of an object from a class. 
		Employee e1 = new Employee("Toto", "Manager");
		Employee e2 = new Employee("Tata", "Clerk");
		
		// After, the methods inside the class can be used by the object in "real-life" situations.
		e1.talk();
		e2.talk();
		
		e1.work();
		e2.work();
	}
}
