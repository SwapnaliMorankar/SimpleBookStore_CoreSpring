package com.springcore.project.Magazine;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class Type {

	private int Mag;
	@Autowired
	private Type t;

	public void FashionData() {
		System.out.println("\nThese are the available magazines in Fashion section");
		System.out.println("\n1. Vogue India  \n2. Elle India \n3. Femina \n4. Harper's Bazaar India");
		System.out.println("\nWhich book do you want to read? (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		Mag = ch.nextInt();
		if (Mag >= 1 && Mag <= 4) {
			t.EndMag();
		} else {
			System.out.println("Sorry! Wrong Choice!");
		}
	}

	public void SocialData() {
		System.out.println("\nThese are the available magazines in Social Cause section");
		System.out.println("\n1. India Today  \n2. Outlook \n3. Tehleka \n4. Frontline");
		System.out.println("\nWhich book do you want to read? (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		Mag = ch.nextInt();
		if (Mag >= 1 && Mag <= 4) {
			t.EndMag();
		} else {
			System.out.println("Sorry! Wrong Choice!");
		}
	}

	public void SportsData() {
		System.out.println("\nThese are the available magazines in Sports section");
		System.out.println("\n1. Sports Star  \n2. Cricket Today \n3. Golf Digest \n4. Sports India");
		System.out.println("\nWhich book do you want to read? (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		Mag = ch.nextInt();
		if (Mag >= 1 && Mag <= 4) {
			t.EndMag();
		} else {
			System.out.println("Sorry! Wrong Choice!");
		}
	}

	public void BusinessData() {
		System.out.println("\nThese are the available magazines in Business section");
		System.out.println("\n1. Forbes India  \n2. Business Today \n3. Fortune India \n4. Economic Times");
		System.out.println("\nWhich book do you want to read? (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		Mag = ch.nextInt();
		if (Mag >= 1 && Mag <= 4) {
			t.EndMag();
		} else {
			System.out.println("Sorry! Wrong Choice!");
		}
	}

	public void EndMag() {
		System.out.println("\nMagazine Number " + Mag + " has been booked under your name for next 24 hours");
		System.out.println("\nEnjoy Reading!");
		System.out.println("\nVisit Again!");
	}

}
