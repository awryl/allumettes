package allumettes;

/* La classe Joueur est une classe abstraite puisqu'elle n'est destiné qu'à être hérité par des
   stratégies.
   Elle pourrait très bien être une interface mais nécessiterait de recopier le nom dans chaque
   sous-classe
*/

public abstract class Joueur {
	String nom;

	abstract int getPrise(Jeu jeu);
};
