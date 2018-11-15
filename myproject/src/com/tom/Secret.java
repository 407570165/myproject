package com.tom;

import java.util.Random;

public class Secret {
	
	int secret;
	int guess;
	Random random=new Random();
	public Secret() {
		this.guess=guess;
		this.secret=secret;
	}
	public  int diff (int guess) {
		return secret-guess;
	}
}
