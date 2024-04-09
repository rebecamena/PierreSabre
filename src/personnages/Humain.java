package personnages;

public class Humain {
	  private String nom;
	  private String boissonFavorite;
	  private int argent;
	  protected Humain[] memoire = new Humain[30];
	  protected int nbConnaissance = 0;
	  
	  public Humain(String nom, String boissonFavorite, int argent) {
	        this.nom = nom;
	        this.boissonFavorite = boissonFavorite;
	        this.argent = argent;
	      
	    }

	    public String getNom() {
	        return nom;
	    }
	    
	    public int getConnaissances() {
	    	return this.nbConnaissance;
	    }
	    
	    private void memoriser(Humain autreHumain) {
	    	if (nbConnaissance >= memoire.length ) {
	            for (int i = 0 ; i < (nbConnaissance-1); i++) {
	            	memoire[i] = memoire[i+1];
	            }
	            memoire[memoire.length-1] = autreHumain; 
	        }else {
	    	memoire[nbConnaissance] = autreHumain;
	    	nbConnaissance++;
	        }
	    }
	    public String getBoisson() {
	    	return this.boissonFavorite;
	    }
	    
	    public void direBonjour() {
	        parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite);
	    }
	    
	    private void repondre(Humain Humain ) {
	    	direBonjour();
	    	memoriser(Humain);
	    	
	    }
	    
	    public void faireConnaissanceAvec(Humain autreHumain) {
	    	  this.direBonjour();
	    	  autreHumain.repondre(this);
	    	  this.memoriser(autreHumain);	
	    }
	    
	    
	    public void listerConnaissance() {
	    	if(nbConnaissance > 0) {
	    		String texte = "Je connais bcp de monde dont : ";
	    		for(int i = 0; i< nbConnaissance ; i++ ) {
	    			texte+=memoire[i].getNom();
	    			if(i < nbConnaissance-1) {
	    				texte+=",";
	    			}
	    		}
	    		parler(texte);
	    	}
	    }

	    public int getArgent() {
	        return argent;
	    }
	    
	    public void setArgent(int argent) {
	        this.argent = argent;
	    }
	    
	    
	    

	    public void boire() {
	        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	    }

	    public void acheter(String boisson, int prix) {
	        if (argent >= prix) {
	            argent -= prix;
	            parler("J'ai acheté " + boisson + " pour " + prix + " euros.");
	        } else {
	            parler("Je n'ai pas assez d'argent pour acheter " + boisson + ".");
	        }
	    }

	    protected void gagnerArgent(int gain) {
	        argent += gain;
	
	    }

	    protected void perdreArgent(int perte) {
	        argent -= perte;
	    }

	    public void parler(String texte) {
	        System.out.println("(" + nom + ") " + texte);
	    }
	}


      




