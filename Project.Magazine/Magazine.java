package com.springcore.project.Magazine;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class Magazine {

	private int Typechoice;
	@Autowired
	private Type t1;

	public void MagData() {
		System.out.println("What type of magazine would you like to read?");
		System.out.println("\n1. Fashion  \n2. Social Cause \n3. Sports \n4. Business");
		System.out.println("\nEnter your choice (1,2,3,4) - ");
		Scanner ch = new Scanner(System.in);
		Typechoice = ch.nextInt();

		if (Typechoice >= 1 && Typechoice <= 4) {
			switch (Typechoice) {
			case 1:
				System.out.println("Moving into Fashion Section");
				t1.FashionData();
				break;
			case 2:
				System.out.println("Moving into Social Cause Section");
				t1.SocialData();
				break;
			case 3:
				System.out.println("Moving into Sports Section");
				t1.SportsData();
				break;
			case 4:
				System.out.println("Moving into Business Section");
				t1.BusinessData();
				break;
			}
		}
		else {
			System.out.println("Sorry! Wrong Choice!");
		}

	}

}
