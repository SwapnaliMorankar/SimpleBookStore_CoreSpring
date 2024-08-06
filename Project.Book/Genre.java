package com.springcore.project.Book;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class Genre {
	 
	@Autowired
	private Genre g;
	private int Book;

	public Genre getG() {
		return g;
	}

	public void setG(Genre g) {
		this.g = g;
	}

	public void HorrorData() {
		System.out.println("\nThese are the available books in horror section");
		System.out.println("\n1. Stree  \n2. Conjuring \n3. Haveli \n4. Aatma");
		System.out.println("\nWhich book do you want to read? (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		Book = ch.nextInt();
		if (Book >= 1 && Book <= 4) {
			g.EndBook();
		} else {
			System.out.println("Sorry! Wrong Choice!");
		}
	}

	public void RomanticData() {
		System.out.println("\nThese are the available books in Romantic section");
		System.out.println("\n1. 2 States  \n2. Love Aaj Kal \n3. Vivah \n4. Main Hoon Na");
		System.out.println("\nWhich book do you want to read? (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		Book = ch.nextInt();
		if (Book >= 1 && Book <= 4) {
			g.EndBook();
		} else {
			System.out.println("Sorry! Wrong Choice!");
		}
	}

	public void ComedyData() {
		System.out.println("\nThese are the available books in Comedy section");
		System.out.println("\n1. Hera Pheri  \n2. De Dana Dan \n3. Dhamaal \n4. Welcome");
		System.out.println("\nWhich book do you want to read? (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		Book = ch.nextInt();
		if (Book >= 1 && Book <= 4) {
			g.EndBook();
		} else {
			System.out.println("Sorry! Wrong Choice!");
		}
	}

	public void SuspenseThrillerData() {
		System.out.println("\nThese are the available books in Suspense Thriller section");
		System.out.println("\n1. Kalki  \n2. Don \n3. Raaz \n4. Race");
		System.out.println("\nWhich book do you want to read? (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		Book = ch.nextInt();
		if (Book >= 1 && Book <= 4) {
			g.EndBook();
		} else {
			System.out.println("Sorry! Wrong Choice!");
		}
	}
	
	public void EndBook() {
		System.out.println("\nBook Number " + Book + " has been booked under your name for next 3 days");
		System.out.println("\nEnjoy Reading!");
		System.out.println("\nVisit Again!");
	}

}
