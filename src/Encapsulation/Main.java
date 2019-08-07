/**
 * 
 * @author Steve Lévesque
 * GitHub/GitLab : steve-levesque
 *
 * All rights reserved - Tous droits réservés
 * 
 */

package Encapsulation;
// Encapsulation is used to restrict unauthorized access to variables as much as possible.
// The only way to obtain it is with the use of public accessor methods.

public class Main {
	public static void main(String[] args) {
		Secret c = new Secret();
		
		System.out.println(c.available);
		
		// Secret is encapsulated because it is not accessible directly.
		// The only way is by using the public available accessor methods.
		
		//System.out.println(c.secret);
		
		System.out.println(c.getSecret());
		c.setSecret("Changed by setters");
		System.out.println(c.getSecret());
	}
}
