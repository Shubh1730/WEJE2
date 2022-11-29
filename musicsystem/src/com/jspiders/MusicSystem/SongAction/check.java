package com.jspiders.MusicSystem.SongAction;

import java.util.ArrayList;

public class check {
	static ArrayList <String> a1 = new ArrayList<>();
	
	public static void main(String[] args) {
				a1.add("Kesariya");
				a1.add("Rangeela");
				a1.add("Pasoori");
				a1.add("Bhootnike");
			for (int i = 0; i < a1.size(); i++) {
				System.out.println("Now playing "+ a1.get(i)+"...");
				try {
					Thread.sleep(1800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Playlist is over");
//				
//			int j= (int)(Math.random()*a1.size());
//			System.out.println("Playing Random Song "+ a1.get(j));
//			String s1="kurshna";
//			String s2=" ";
//			for (int i = s1.length()-1;i>=0;i--) {
//				s2=s2+s1.charAt(i);
//			}
//			System.out.println(s2);
		}
	}