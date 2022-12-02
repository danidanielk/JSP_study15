package com.kim.sep222.main;

import java.util.Random;

public class Game_java {
int aa;
int bb;
int cc;
	public void com() {
		Random ran = new Random();

		Game_java GG = new Game_java();

		int a = ran.nextInt(9) + 1;
		int b = ran.nextInt(9) + 1;
		int c = ran.nextInt(9) + 1;
		System.out.println(a);

		while (true) {

			if (a != b) {
				System.out.println(b);
				bb=b;
				break;
			} else {
				b = ran.nextInt(9) + 1;
			}
		}

		while (true) {

			if (c != a && c != b) {
				cc=c;
				System.out.println(c);
				break;
			} else {
				c = ran.nextInt(9) + 1;
			}

		}
	}
	
	
	public void me() {
		
		
	}
	
	

	public static void main(String[] args) {
		Game_java G = new Game_java();
		G.com();
	}
}
