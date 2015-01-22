package com.test.app;
import java.util.Scanner; //imports the scanner function
public class App 
{
    public static void main( String[] args )
	{
	    System.out.println("Voer jouw hele naam in:"); //imput
	    Scanner voornaam = new Scanner(System.in); //variable voornaam gets the input
	    System.out.println("Welkom, " + voornaam.nextLine() + ", dit is mijn Maven applicatie."); //print the variable and the text
	}
}
