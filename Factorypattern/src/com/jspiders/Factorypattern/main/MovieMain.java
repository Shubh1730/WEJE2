package com.jspiders.Factorypattern.main;

import java.util.Scanner;

import com.jspiders.Factorypattern.Movie.KGF2;
import com.jspiders.Factorypattern.Movie.Kantara;
import com.jspiders.Factorypattern.Movie.Pushpa;
import com.jspiders.Factorypattern.Movie.Vikram;
import com.jspiders.Factorypattern.interpace.Movie;

public class MovieMain {
	static boolean loop = true;
	static Movie movie;

	public static void main(String[] args) {
		while (loop) {
			try {
				movieFactory().nowPlaying();
			} catch (NullPointerException e) {
				System.out.println("No movie selected");
			}
		}
	}

	public static Movie movieFactory() {

		System.out.println("Select a movie to watch = \n" 
				+ "1. KGF2\n" 
				+ "2. Vikram\n" 
				+ "3. Pushpa\n" 
				+ "4. Kantara\n");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();

		switch (choice) {
		case 1:
			movie = new KGF2();
			loop = false;
			return movie;
		case 2:
			movie = new Vikram();
			loop = false;
			return movie;
		case 3:
			movie = new Pushpa();
			loop = false;
			return movie;
		case 4:
			movie = new Kantara();
			loop = false;
			return movie;

		default:
			System.out.println("Invalid Choice");
			loop = false;
			return movie;
		}
	}
}
