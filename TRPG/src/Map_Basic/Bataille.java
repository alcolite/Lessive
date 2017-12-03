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
    	
    	
    	
    	
    	System.out.println(this.champDeBataille);
    	
    	System.out.println(this.nomDeLaBataille);
    
    	
    	
	}
    
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		String str;
		str = in.nextLine();
		
		Bataille nouvelleBataille=new Bataille(str);
		
		
		Bataille nouvelleBataille2=new Bataille(str);
		
		
		nouvelleBataille.aficherBataille();
		
	in.nextLine();
		
		nouvelleBataille2.aficherBataille();
		
	in.nextLine();
		
		in.close();
	}
	

}
