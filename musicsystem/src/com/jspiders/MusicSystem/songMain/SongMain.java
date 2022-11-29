package com.jspiders.MusicSystem.songMain;

import java.util.Scanner;

import com.jspiders.MusicSystem.SongAction.MusicPlayer;

public class SongMain {
	static boolean loop = true;
	static Scanner scanner = new Scanner(System.in);
	static MusicPlayer musicPlayer= new MusicPlayer();
	SongMain songMain= new SongMain();

	public static void main(String[] args) {
		while (loop) {
			try {
				songMenu();
			} catch (NullPointerException e) {
				System.out.println("No Option selected");
			}
			catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			
		}
	}

	public static void songMenu() {
		System.out.println("Select a Action for Song :- \n" 
				+ "1. Play a Song \n" 
				+ "2. Add or Remove a Song \n"
				+ "3. Edit the Song \n" 
				+ "4. Exit");

		
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
				System.out.println("Select the Actions \n" 
						+ "1. Select a song to play \n" 
						+ "2. Play Random Song \n"
						+ "3. Play all Song \n"
						+ "4. back" );
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					musicPlayer.playSpecificSong();
					String songName = scanner.nextLine();
					System.out.println(" \n"
							+ "Now Playing " + songName);
					System.out.println();
					songMenu();
					break;
				case 2:
					musicPlayer.playRandomSong();
					songMenu();
					break;
				case 3:
					musicPlayer.playAllSong();
					songMenu();
					break;
				case 4:
					songMenu();
					break;
				default:
					System.out.println("Invalid Choice");
					break;
				}
				loop = false;
				break;

		case 2:
			System.out.println("Choose the Option \n"
						+ "1. Adding the Song \n"
						+ "2. Remove a Song \n"
						+ "3. Back");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("How many Songs do you want to add");
				int choice1 = scanner.nextInt();
				for (int i = 1; i <= choice1; i++) {
					musicPlayer.addSong();
				}
				songMenu();
				break;
			case 2:
				musicPlayer.deleteSong();
				break;
			case 3:
				songMenu();
				break;
			default:
				System.out.println("Please Choose Vaild Option");
				break;		
			}
			
			loop=false;
			break;
			
		case 3:
			musicPlayer.editSong();
			
			loop = false;
			break;
			
		case 4:
			System.out.println("Exit Sucessfully");
			loop = false;
			break;

		default:
			System.out.println("Invalid Choice, Please Enter Valid Choices");
			loop = false;
			break;
		}
		scanner.close();
	}
}
