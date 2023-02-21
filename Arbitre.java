package allumettes;

/* L'arbitre sert d'intermédiaire entre le jeu et les deux joueurs.
   C'est lui qui interprète les règles du jeu et s'occupe des conséquences
   des manquements aux règles.
   Il s'occupe de plus de commenter les actions des joueurs, de l'état du jeu et du résultat
*/

public class Arbitre {
	Joueur j1;
	Joueur j2;	

	Arbitre(Joueur pj1, Joueur pj2) {
		this.j1 = pj1;
		this.j2 = pj2;
	}
	
	// Méthode principale qui lance la partie
	void arbitrer(Jeu jeu) {
		int b = 0;
		int q = 1;
		while (jeu.getNombreAllumettes() >= 1 && q == 1) {
			try {
				System.out.println("Tapis :" + jeu.toString()); 
				
				Jeu copie = new JeuProcuration(jeu.getNombreAllumettes());

				if (b == 0) {
					System.out.println("Au tour de " + this.j1.nom);
					int prise = j1.getPrise(copie);
					jeu.retirer(prise);
					System.out.println(this.j1.nom + " prend " + 
					prise + " allumette(s)."); 
				}
				else {
					System.out.println("Au tour de " + this.j2.nom);
					int prise = j2.getPrise(copie);
					jeu.retirer(prise);
					System.out.println(this.j2.nom + " prend " + 
					prise + " allumette(s)."); 
				}
				b = 1-b;
				System.out.println("");
			}
			catch (CoupInvalideException e) {
				System.out.println("Erreur : " + e.getMessage());
				System.out.println("Recommencez !");
				System.out.println("");
			}
			catch (OperationInterditeException e) {
			System.out.println("Erreur : " + e.getMessage());
			System.out.println("Arret immediat du programme");
			q = 0;
			b = 2;
			}
		}
		if (b == 1) {
			System.out.println(j1.nom + " a perdu !");
		}
		else if (b == 0) {
			System.out.println(j2.nom + " a perdu !");
		}
	}
}

