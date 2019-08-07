/**
 * 
 * @author Steve L�vesque
 * GitHub/GitLab : steve-levesque
 *
 * All rights reserved - Tous droits r�serv�s
 * 
 */

package Abstraction;

public abstract class Motherboard implements Component {
	private String name;
	
	Motherboard() {
		this.name = "Motherboard 1234";
	}

	public String getMotherboardName() {
		return name;
	}
}