package allumettes;

import org.junit.*;
import static org.junit.Assert.*;

public class Test {

	//Test du nom d'un joueur Rapide
	@Test
	public void testerNom() {
		Joueur j = new Rapide("Roger");
		assertEquals(j.nom,"Roger");
	}
	
	//Test du comportement d'un joueur Rapide
	// On suppose que PRISE_MAX = 3
	@Test 
	public void testerGetPrise() {
		Jeu jeu1 = new JeuReel(50);
		Jeu jeu2 = new JeuReel(5);
		Jeu jeu3 = new JeuReel(2);
		Jeu jeu4 = new JeuReel(1);
		Jeu jeu5 = new JeuReel(0);
		Joueur j = new Rapide("Roger");
		
		assertEquals(j.getPrise(jeu1),3);
		assertEquals(j.getPrise(jeu2),3);
		assertEquals(j.getPrise(jeu3),2);
		assertEquals(j.getPrise(jeu4),1);
		assertEquals(j.getPrise(jeu5),0);
	}

	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main(Test.class.getName());
	}
}
