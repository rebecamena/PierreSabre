package personnages;

public class Samourai extends Ronin {
	
	private String seigneur; 
	
	public 	Samourai(String seigneur, String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		this.seigneur = seigneur;
		
	}
	
	@Override
    public void direBonjour() {
        parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getBoisson());
        parler("Je suis fier de servir le seigneur "+ seigneur + ".");
    }
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du"+ boisson +".");	
	}
}
