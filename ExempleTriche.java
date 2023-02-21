package allumettes;

/** Vérifier que l'arbitre détecte la tricherie d'un joueur.
  * @author	Xavier Crégut
  * @version	$Revision: 1.5 $
  */
public class ExempleTriche {

	public static void main(String[] args) {
			System.out.println("");
			Joueur j1,j2;
			j1 = new Tricheur("tricheur");	
			j2 = new Naif("naif"); 
			Jeu jeu = new JeuReel(13);
			Arbitre a = new Arbitre(j1,j2);			
			a.arbitrer(jeu);
	}

}
