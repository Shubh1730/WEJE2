package com.jspiders.MusicSystem.SongAction;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspiders.MusicSystem.songProperty.Song;

public class MusicPlayer {
	Scanner scanner= new Scanner(System.in);
	
	ArrayList <Song> a1 = new ArrayList<Song>();
	
	public void addSong() {
		Song song= new Song();
		System.out.println("Adding a song..." );
		System.out.println("Enter Song Id");
		song.setId(scanner.nextInt());
		System.out.println("Enter Song Name");
		song.setName(scanner.next());
		System.out.println("Enter Movie / Album Name");
		song.setMovie(scanner.next());
		System.out.println("Enter length of the Song");
		song.setLength(scanner.nextDouble());
		System.out.println("Enter the Singer Name");
		song.setSinger(scanner.next());
		System.out.println("Enter the Composer Name");
		song.setComposer(scanner.next());
		System.out.println("Enter the Lyricist");
		song.setLyricist(scanner.next());
		
		for (int i = 1; i < a1.size(); i++) {
			a1.add(i,song);
		}
		System.out.println(song.getName()+" is added to playlist");
		
	}
	public void deleteSong() {
		if (a1.isEmpty()) {
			System.out.println("Playlist is empty please add first ");
			addSong();
		}else {
			viewAllSong();
		System.out.println("Which Song do you want to remove");
		System.out.println("Enter Song NAME");
		String name=scanner.next();
		
		for (int i = 0; i < a1.size(); i++) {
			if (a1.get(i).getName().equals(name)) {
				Song song=a1.remove(i);
				song=null;
				a1.remove(i);
				System.out.println(song);
				System.out.println("Successfully removed "+ name);
				}
			}
		}
	}
	
	public void playRandomSong() {
		if (a1.isEmpty()) {
			System.out.println("Playlist is empty please add first ");
			addSong();
		}else {
		viewAllSong();
		int random= (int)(Math.random()*a1.size());
		System.out.println("Playing Random Song of id number "+ a1.get(random).getName());
		System.out.println();
		}
	}
	
	public void playSpecificSong() {
		if (a1.isEmpty()) {
			System.out.println("Playlist is empty please add first ");
			addSong();
		}else {
			viewAllSong();
			System.out.println("Enter Id to play the song");
			int num=scanner.nextInt();
			for (int i = 0; i < a1.size(); i++) {
				if (num==(Integer)a1.get(i).getId()) {
					System.out.println("Now Playing "+ a1.get(i).getName()+"...\n"
							+ a1.get(i).toString());
				} else {
					System.out.println("Id not matched");
				}
			}
		}	
	}
	
	public void playAllSong() {
		if (a1.isEmpty()) {
			System.out.println("Playlist is empty please add first ");
			addSong();
		}else {
		viewAllSong();
		for (int i = 0; i < a1.size(); i++) {
			System.out.println("Now playing "+ a1.get(i).getName()+"...");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			System.out.println("Playlist is over");
		}
	}
	
	public void editSong() {
		if (a1.isEmpty()) {
			System.out.println("Playlist is empty please add first ");
			addSong();
		}else {
		viewAllSong();
		
		System.out.println("Enter Song Id");
		int edit=(scanner.nextInt());
		
		System.out.println("Enter Song Id");
		a1.get(edit).setId(scanner.nextInt());
		System.out.println("Enter Song Name");
		a1.get(edit).setName(scanner.nextLine());
		System.out.println("Enter Movie / Album Name");
		a1.get(edit).setMovie(scanner.nextLine());
		System.out.println("Enter length of the Song");
		a1.get(edit).setLength(scanner.nextDouble());
		System.out.println("Enter the Singer Name");
		a1.get(edit).setSinger(scanner.nextLine());
		System.out.println("Enter the Composer Name");
		a1.get(edit).setComposer(scanner.nextLine());
		System.out.println("Enter the Lyricist");
		a1.get(edit).setLyricist(scanner.nextLine());
		
		viewAllSong();
		}
	}
	public void viewAllSong() {
		if (a1.isEmpty()) {
			System.out.println("Playlist is empty please add first ");
			addSong();
		}else {
		for (int i = 1; i < a1.size(); i++) {
			System.out.println(i+". "+a1.get(i-1).getName());
			}
		}
	}
}
