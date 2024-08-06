package com.springcore.project.newspaper;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class Lang {
	
	@Autowired
	private Lang l;
	private int News;
	
	public Lang getL() {
		return l;
	}

	public void setL(Lang l) {
		this.l = l;
	}

	public void EnglishData() {
		System.out.println("\nThese are the available newspapers in English section");
		System.out.println("\n1. Times of India  \n2. Indian Express \n3. Maharashtra Times \n4. Voice of India");
		System.out.println("\nWhich newspaper do you want to read? (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		News = ch.nextInt();
		if (News >= 1 && News <= 4) {
			l.EndNews();
		} else {
			System.out.println("Sorry! Wrong Choice!");
		}
	}
	
	public void HindiData() {
		System.out.println("\nThese are the available newspapers in Hindi section");
		System.out.println("\n1. Dainik Jagran \n2. Amar Ujala \n3. Daiknik Bhaskar \n4. Navbharat");
		System.out.println("\nWhich newspaper do you want to read? (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		News = ch.nextInt();
		if (News >= 1 && News <= 4) {
			l.EndNews();
		} else {
			System.out.println("Sorry! Wrong Choice!");
		}
	}
	
	public void MarathiData() {
		System.out.println("\nThese are the available newspapers in Marathi section");
		System.out.println("\n1. Lokmat  \n2. Divya Marathi \n3. Sakal \n4. Loksatta");
		System.out.println("\nWhich newspaper do you want to read? (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		News = ch.nextInt();
		if (News >= 1 && News <= 4) {
			l.EndNews();
		} else {
			System.out.println("Sorry! Wrong Choice!");
		}
	}
	
	public void OtherData() {
		System.out.println("\nThese are the available newspapers in Other section");
		System.out.println("\n1. Dina Karan  \n2. Vijaya Karnataka \n3. Prajavani \n4. Eenadu");
		System.out.println("\nWhich newspaper do you want to read? (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		News = ch.nextInt();
		if (News >= 1 && News <= 4) {
			l.EndNews();
		} else {
			System.out.println("Sorry! Wrong Choice!");
		}
	}
	
	public void EndNews() {
		System.out.println("\nNewspaper Number " + News + " has been booked under your name for next 3 hours");
		System.out.println("\nEnjoy Reading!");
		System.out.println("\nVisit Again!");
	}

}
