/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
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