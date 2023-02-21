package allumettes;

/** Lance une partie des 13 allumettes en fonction des arguments fournis
 * sur la ligne de commande.
 * @author	Xavier Crégut
 * @version	$Revision: 1.5 $
 */
public class Partie {

	/** Lancer une partie. En argument sont donnés les deux joueurs sous
	 * la forme nom@stratégie.
	 * @param args la description des deux joueurs
	 */
	public static void main(String[] args) {
		try {
			if (args.length != 2) {
				throw new ConfigurationException("nombre invalide d'arguments : " +
						args.length + " au lieu de 2.");
			}
	
			//Analyse des expressions par rapport aux stratégies connus.
			String[] t1 = args[0].split("@",2);
			String[] t2 = args[1].split("@",2);
			Joueur j1 = null;
			Joueur j2 = null;

			if (t1[1].equals("naif")) {
           			j1 = new Naif(t1[0]);
                   	}

			if (t1[1].equals("rapide")) {
           			j1 = new Rapide(t1[0]);
                   	}

			if (t1[1].equals("expert")) {
           			j1 = new Expert(t1[0]);
                   	}

			if (t1[1].equals("humain")) {
           			j1 = new Humain(t1[0]);
                   	}	       
			
			if (j1 == null) throw new ConfigurationException("strategie inconnue : " + t1[1]);
			
			if (t2[1].equals("naif")) {
           			j2 = new Naif(t2[0]);
                   	}

			if (t2[1].equals("rapide")) {
           			j2 = new Rapide(t2[0]);
                   	}

			if (t2[1].equals("expert")) {
           			j2 = new Expert(t2[0]);
                   	}

			if (t2[1].equals("humain")) {
           			j2 = new Humain(t2[0]);
                   	}	
       
			if (j2 == null) throw new ConfigurationException("strategie inconnue : " + t2[1]);


			Arbitre a = new Arbitre(j1,j2);
			Jeu jeu = new JeuReel(13);
			a.arbitrer(jeu);
		} 

		/* L'exception est levé si il n'y pas exactement 2 armuments dans la ligne de commandes
	           ou si une stratégie est inconnue.
		*/
		catch (ConfigurationException e) {
			System.out.println();
			System.out.println("Erreur : " + e.getMessage());
			afficherUsage();
			System.exit(1);
		}

	}

	/** Afficher des indications sur la manière d'exécuter cette classe. */
	public static void afficherUsage() {
		System.out.println("\n" + "Usage :"
				+ "\n\t" + "java allumettes.Partie joueur1 joueur2"
				+ "\n\t\t" + "joueur est de la forme nom@stratégie"
				+ "\n\t\t" + "strategie = naif | rapide | expert | humain"
				+ "\n"
				+ "\n\t" + "Exemple :"
				+ "\n\t" + "	java allumettes.Partie Xavier@humain "
					   + "Ordinateur@naif"
				+ "\n"
				);
	}

}
