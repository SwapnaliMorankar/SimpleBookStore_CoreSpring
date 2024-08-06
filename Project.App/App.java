package com.springcore.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.project.Home.Home;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to our Online Book Store!" );
        System.out.println( "Hope you have a good day" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml"); 
        Home h1 = (Home) context.getBean("myhome");
        h1.HomeData();
    }
}
