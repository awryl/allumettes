package allumettes;

public class Humain extends Joueur {

	Humain(String n) {
		 this.nom = n;
	}

	/* On demande simplement à l'humain un nombre qu'il entre par le terminal.
	   Un système d'exception est conçu pour empêcher l'utilisateur de mettre n'importe quoi
	*/

	int getPrise(Jeu jeu) {
		int n = 0;
		int b = 0;
		while (b == 0) {
			try {	
				System.out.print("Combien d'allumettes prenez-vous ? ");
				java.util.Scanner s = new java.util.Scanner(System.in);
				n = s.nextInt();
				b = 1;
			}
			catch (java.util.InputMismatchException e) {
				System.out.println("l'entier doit etre valide");
			}
		}
		return n;
	}
}
