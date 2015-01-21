package com.test.app;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
	{
	    System.out.println("Voer jouw hele naam in:");
	    Scanner voornaam = new Scanner(System.in);
	    System.out.println("Welkom, " + voornaam.nextLine() + ", dit is mijn Maven applicatie.");
	}
}
