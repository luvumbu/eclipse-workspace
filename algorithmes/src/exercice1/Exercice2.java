package exercice1;

import java.util.Scanner;

public class Exercice2 {


public void moi() 
{
	System.out.println("Ecrire un algorithme qui demande � l�utilisateur un nombre compris entre 1 et 3 jusqu�� ce que la r�ponse convienne.");
	
	Scanner source = new Scanner(System.in);
	String valbis = source.nextLine();
	
	int val = Integer.parseInt(valbis) ;
	while (val<3)
	{
	 System.out.println("Entrer un nombre ici");
	    source = new Scanner(System.in);
	    valbis = source.nextLine();  
	    val = Integer.parseInt(valbis) ;
	}
	System.out.println("Fin du programme");
	
 
}
}
