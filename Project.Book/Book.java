package com.springcore.project.Book;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {

	private int Genrechoice;
	@Autowired
	private Genre g1;

	public Genre getG1() {
		return g1;
	}

	public void setG1(Genre g1) {
		System.out.println("Setting Genre");
		this.g1 = g1;
	}

	public void BookData() {
		System.out.println("What genre of book would you like to read?");
		System.out.println("\n1. Horror  \n2. Romantic \n3. Comedy \n4. Suspense Thriller");
		System.out.println("\nEnter your choice (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		Genrechoice = ch.nextInt();

		if (Genrechoice >= 1 && Genrechoice <= 4) {
			switch (Genrechoice) {
			case 1:
				System.out.println("Moving into Horror Section");
				g1.HorrorData();
				break;
			case 2:
				System.out.println("Moving into Romantic Section");
				g1.RomanticData();
				break;
			case 3:
				System.out.println("Moving into Comedy Section");
				g1.ComedyData();
				break;
			case 4:
				System.out.println("Moving into Suspense Thriller Section");
				g1.SuspenseThrillerData();
				break;
			}
		} else {
			System.out.println("Sorry! Wrong Choice!");
		}
	}

}