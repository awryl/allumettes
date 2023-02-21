package allumettes;

/* Classe hérité de Jeu, uniquement destiné être une copie du vrai jeu pour être envoyée aux joueurs
   De cette façon là, les joueurs n'ont aucun contrôle sur le vrai jeu et s'ils tentent quoi que ce
   soit, une surprise les attend.
*/

public class JeuProcuration extends JeuReel implements Jeu {
	
	JeuProcuration(int n) {
		super(n);
	}
	
	@Override
	public void retirer(int nb) throws OperationInterditeException {
		throw new OperationInterditeException("triche !!");
	}
}
