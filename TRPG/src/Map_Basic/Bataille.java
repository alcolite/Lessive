package Map_Basic;

import java.util.Scanner;

public class Bataille{
	
	
	private String nomDeLaBataille;
	private Carte champDeBataille;
	
	public Bataille(String nom) {
		this.champDeBataille=new Carte();
		
		this.nomDeLaBataille=nom;
		
		
	
	}
	
	
    public void aficherBataille() {
    	
    	Scanner in=new Scanner(System.in);
    	
    	System.out.println(this.nomDeLaBataille);
    	System.out.println(this.champDeBataille);
    	
    	in.nextLine();
    	
    	
	}
    
	public static void main(String[] args) {

		
		
		Bataille nouvelleBataille=new Bataille("Le goufre de helm");
		
		Bataille nouvelleBataille2=new Bataille("waterloo");
		
		System.out.println("maBataille : "+nouvelleBataille);
		
		nouvelleBataille.aficherBataille();
		
		System.out.println("maBataille");
		

	}
	

}
