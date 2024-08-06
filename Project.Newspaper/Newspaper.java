package com.springcore.project.newspaper;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class Newspaper {

	private int Langchoice;
	@Autowired
	private Lang l1;

	public Lang getL1() {
		return l1;
	}

	public void setL1(Lang l1) {
		this.l1 = l1;
	}

	public void NewsData() {
		System.out.println("Which language newspaper would you like to read?");
		System.out.println("\n1. English  \n2. Hindi \n3. Marathi \n4. Other");
		System.out.println("\nEnter your choice (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		Langchoice = ch.nextInt();

		if (Langchoice >= 1 && Langchoice <= 4) {
			switch (Langchoice) {
			case 1:
				System.out.println("Moving into English Section");
				l1.EnglishData();
				break;
			case 2:
				System.out.println("Moving into Hindi Section");
				l1.HindiData();
				break;
			case 3:
				System.out.println("Moving into Marathi Section");
				l1.MarathiData();
				break;
			case 4:
				System.out.println("Moving into Other Section");
				l1.OtherData();
				break;
			}
		} else {
			System.out.println("Sorry! Wrong Choice!");
		}

	}

}
