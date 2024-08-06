package com.springcore.project.Home;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.springcore.project.Book.Book;
import com.springcore.project.Magazine.Magazine;
import com.springcore.project.newspaper.Newspaper;

public class Home {

	private int Readingchoice;
	@Autowired
	private Book b1;
	@Autowired
	private Newspaper n1;
	@Autowired
	private Magazine m1;

	public void HomeData() {
		System.out.println("What would you like to read today?");
		System.out.println("\n1. Book \n2. Magazine \n3. Newspaper");
		System.out.println("\nEnter your choice (1,2,3) - ");
		Scanner ch = new Scanner(System.in);
		Readingchoice = ch.nextInt();

		if (Readingchoice <= 3 && Readingchoice >= 1) {
			switch (Readingchoice) {
			case 1:
				System.out.println("Moving into Books Section");
				b1.BookData();
				break;
			case 2:
				System.out.println("Moving into Magazine Section");
				m1.MagData();
				break;
			case 3:
				System.out.println("Moving into Newspaper Section");
				n1.NewsData();
				break;
			}
		}
		else {
			System.out.println("Sorry! Wrong Choice!");
		}
	}

}
