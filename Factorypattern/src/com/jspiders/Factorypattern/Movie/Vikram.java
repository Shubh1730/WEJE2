package com.jspiders.Factorypattern.Movie;

import com.jspiders.Factorypattern.interpace.Movie;

public class Vikram implements Movie{

	@Override
	public void nowPlaying() {
		System.out.println("Now Playing Vikram");
	}
}
