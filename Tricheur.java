package allumettes;

public class Tricheur extends Joueur {

	Tricheur(String n) {
		 this.nom = n;
	}

	/* Le tricheur enlève les allumettes du jeu discrétos de sorte à ne rester qu'uniquement 
	   2 allumettes sur le tapis (s'il le peut) pour ensuite prendre 1 allumette de façon
	   officielle. Il ne prend dans tous les cas qu'1 allumette.
	*/
	
	int getPrise(Jeu jeu) throws OperationInterditeException {
		int nb = jeu.getNombreAllumettes();
		if (nb > 2) {
			try {
				int i = (nb - 2) % 3;
				int q = (nb - 2) / 3;
				while (q > 0) {
					jeu.retirer(3);
				}
				jeu.retirer(i);
			}
			catch (CoupInvalideException e) {
				//Cela n'arrive jamais puisque JeuProcuration.retirer() 
				//ne génère pas l'exception CoupInvalideException
				//Elle doit quand meme etre catch puisque l'exception 
				//est controlé (probleme de compilation sinon).
			}
		}	
		return 1;
	}
}
