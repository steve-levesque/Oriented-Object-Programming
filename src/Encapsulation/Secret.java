/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Encapsulation;

public class Secret {
	public String available;
	private String secret;
	
	Secret() {
		this.available = "This is accessible.";
		this.setSecret("Can't be accessed directly.");
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}
}
