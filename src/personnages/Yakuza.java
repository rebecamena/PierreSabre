package personnages;

public class Yakuza extends Humain {

    private String clan;
    private int reputation;

    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
        this.reputation = 0;
    }
    @Override
    public void direBonjour() {
        parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getBoisson());
        parler("Je viens du clan "+ clan);
    }
    
    public void perdre() {
    	
        perdreArgent(getArgent());
        reputation--;
        parler("J'ai perdu ! Je suis déshonoré !");
    }

    public void gagner(int gain) {
    	setArgent(getArgent()+gain);
        reputation++;
        parler("J'ai gagné ! Je suis le plus fort !");
    }
    
    
    public int getReputation() {
        return reputation;
    }
    public void extorquer(Commercant victime) {
    	parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
        int argentExtorque = victime.seFaireExtorquer();
        gagnerArgent(argentExtorque);
        reputation++;
        parler("J'ai piqué les " + argentExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }

}
