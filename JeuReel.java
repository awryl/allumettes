package allumettes;

/* Cette classe est l'interpretation concrète du jeu : le nombre d'allumettes et les règles
*/

public class JeuReel implements Jeu {
	int nb_allumettes;
	
	/* @invariant nb_allumettes>=0 */
	JeuReel(int n) {
		if (n<0) 
			this.nb_allumettes = 0;
		else
			this.nb_allumettes = n;	
	}

	public int getNombreAllumettes() {
		return nb_allumettes;			
	}

	/* On ne peut retirer du jeu qu'entre 1 et PRISE_MAX allumettes
	   même si physiquement, on pourrait retirer de 0 allumettes à nb_allumettes
	   On pourrait d'ailleurs créer une classe correspondant au jeu physique et
	   une autre correspondant aux règles
	*/
	public void retirer(int nb) throws CoupInvalideException {
		if (nb > PRISE_MAX) {
			throw new CoupInvalideException(nb);
		}
		else if (nb < 1) {
			throw new CoupInvalideException(nb);
		}
		else if (nb_allumettes-nb < 0) {
			throw new CoupInvalideException(nb);
		}
		else {
			this.nb_allumettes = this.nb_allumettes - nb;
		}
		
	}
	
	//Cette méthode est utile pour afficher le nombre d'allumettes
	public String toString() {
		String s = "";
		for (int i=0;i<nb_allumettes;i++) {
			s = s + " |" ;
		}
		return s;
	}
}
