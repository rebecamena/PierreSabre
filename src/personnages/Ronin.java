package personnages;

public class Ronin extends Humain {

    private int honneur;

    public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
        this.honneur = 1;
    }
    
    public void provoquer(Yakuza adversaire) {
        int forceRonin = honneur * 2;
        if (forceRonin >= adversaire.getReputation()) {
            gagnerArgent(adversaire.getArgent());
            honneur++;
            parler("J'ai eu mon petit Yakusa !");
            adversaire.perdre();
        } else {
            perdreArgent(getArgent());
            honneur--;
            parler("J'ai perdu contre " + adversaire.getNom() + " !");
            adversaire.gagner(getArgent());
        }
    }
    public int getHonneur() {
    	return this.honneur;
    }
    public void donner(Commercant beneficiaire) {
        int argentDonne = (int)(getArgent() * 0.1);
        perdreArgent(argentDonne);
        beneficiaire.gagnerArgent(argentDonne);
        parler("J'ai donné " + argentDonne + " sous à " + beneficiaire.getNom() );
    
            }
       
    }
