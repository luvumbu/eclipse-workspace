package exercice1;

import java.util.Scanner;

public class Exercice5a {
	public void info() 
	{
		System.out.println("Ecrire un algorithme qui demande � l�utilisateur "
				+ "un nombre compris entre 1 et 3 jusqu�� ce que"
				+ " la r�ponse convienne.");
		
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Entrer un nombre");
		String str = sc.nextLine();		
		int verificateur = 0 ; 
		
		 int nombre ;
		for(int  i = 0 ; i<str.length() ; i++)
		{
			//1System.out.println(str.substring(i,i+1));			
				try 
				{
					  nombre = Integer.parseInt(str) ; 
				}
				catch(Exception e)
				{
					verificateur++ ; 
				}			
		}	
			if(verificateur==0)
			{
				System.out.println("sa marche tout va bien");
			}
			else 
			{
				System.out.println("La valeur n'ets pas bonne ");
			}
		
		
	
		// String mon = "1y1" ; 
		 
		
		
		
		
		
		
		/*
		
		try 
		{
			 int nombre = Integer.parseInt(mon) ; 
		 
			System.out.println("ce bon");
		}
		catch(Exception e)
		{
			System.out.println("ce pas bon");
		}
		 
		 */
	}
	
	

}
