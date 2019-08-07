/**
 * 
 * @author Steve Lévesque
 * GitHub/GitLab : steve-levesque
 *
 * All rights reserved - Tous droits réservés
 * 
 */

package Inheritance;

public class Phone {
	public Boolean call;
	public Boolean text;
	public Boolean music;
	public Boolean apps;
	
	public Phone() {
		this.call = true;
		this.text = true;
		this.music = false;
		this.apps = false;
	}
	
	public void call() {
		if(call)
			System.out.println("Calling...");
		else
			this.unavailable();
	}
	
	public void text() {
		if(text)
			System.out.println("Texting...");
		else
			this.unavailable();
	}
	
	public void music() {
		if(music)
			System.out.println("Starting music...");
		else
			this.unavailable();
	}
	
	public void apps() {
		if(apps)
			System.out.println("Starting application...");
		else
			this.unavailable();
	}
	
	public void unavailable() {
		System.out.println("This function is unavailable...");
	}
}
