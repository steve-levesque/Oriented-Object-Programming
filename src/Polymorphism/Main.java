/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Polymorphism;
// Polymorphism is a principle used to execute a method from it's possible copies with
// the same name which contains different parameters input (Overloading). This can be applied too
// when a method with the same name and same parameters is being implemented by a sub class on top of it's
// super class (Overriding).

public class Main {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		System.out.println(c.operation(1, 2));
		System.out.println(c.operation(1.1, 2.12313));
		System.out.println(c.operation(1, 2, 3));
	}
}
