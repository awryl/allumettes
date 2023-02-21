package allumettes;

/** Levée quand un coup invalide est détecté.
 * @author	Xavier Crégut
 * @version	$Revision: 1.3 $
 */
public class CoupInvalideException extends Exception {

	/** Initialiser CoupInvalideException à partir du nombre d'allumettes
	 * prises.
	 * @param nb le nombre d'allumettes prises
	 */
	public CoupInvalideException(int nb) {
		super("Prise invalide : " + nb);
	}

}
