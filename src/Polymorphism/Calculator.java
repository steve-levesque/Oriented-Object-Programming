/**
 * 
 * @author Steve Lévesque
 * GitHub/GitLab : steve-levesque
 *
 * All rights reserved - Tous droits réservés
 * 
 */

package Polymorphism;

public class Calculator {
	
	public int operation(int num1, int num2) {
		return (num1 - num2);
	}
	
	public double operation(double num1, double num2) {
		return (num1 - num2);
	}
	
	public int operation(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}
}
