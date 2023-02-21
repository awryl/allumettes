package allumettes;

public interface Jeu {

	/** Nombre maximal d'allumettes pouvant Ãªtre prises. */
	int PRISE_MAX = 3;

	/** Obtenir le nombre d'allumettes encore en jeu.
	 * @return nombre d'allumettes encore en jeu
	 */
	public int getNombreAllumettes();

	/** Retirer des allumettes.
	 * @param nbPrises nombre d'allumettes prises.  Le nombre d'allumettes
	 * prises doit Ãªtre compris entre 1 et PRISE_MAX, dans la limite du nombre
	 * d'allumettes encore en jeu.	XXX
	 * @throws CoupInvalideException tentative de prendre un nombre invalide d'alumettes
	 */
	public void retirer(int nbPrises) throws CoupInvalideException;

}

