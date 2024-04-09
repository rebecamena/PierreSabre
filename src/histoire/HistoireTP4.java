package histoire;

import personnages.*;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
        prof.direBonjour();
        prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'acheter une boisson à 12 sous");
        prof.acheter("boisson", 12);
        prof.boire();
        prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'acheter un jeu à 2 sous");
        prof.acheter("jeu", 2);
        prof.parler("Je n'ai plus que " + prof.getArgent() + " sous en poche. Je ne peux même pas m'acheter un kimono à 50 sous.");
    
        
        
        
        Commercant marco = new Commercant("Marco",20);
        
        marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();
        
         Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
         yaku.direBonjour();
         yaku.extorquer(marco);
         
         Ronin roro = new Ronin("Roro", "shochu", 60);

         roro.direBonjour();
         roro.donner(marco);
         marco.recevoir(15);
         
         
         roro.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
         roro.provoquer(yaku);
         

         System.out.println("[ " + roro.getNom() + " ] " + "J'ai vaincu " + yaku.getNom() + " ! Mon honneur est maintenant de " + roro.getHonneur() + ".");
         System.out.println("[ " + yaku.getNom() + " ] " + "J'ai perdu mon duel et mes " + yaku.getArgent() + " sous, snif... J'ai déshonoré le clan de Warsong.");
	}
}
		
	


