package personnages;
import personnages.Humain;

public class Commercant extends Humain{
	 public Commercant(String nom) {
	        super(nom, "thé", 0);
	    }

	 public int seFaireExtorquer() {
		    int argentExtorque = getArgent();
		    perdreArgent(argentExtorque);
		    parler("J’ai tout perdu! Le monde est vraiment trop injuste ! ");
		    return argentExtorque;
		}

	  public void recevoir(int argent) {
	        gagnerArgent(argent); 
	        parler(argent +" sous ! Je te remercie généreux donateur!");
	    } 

}
