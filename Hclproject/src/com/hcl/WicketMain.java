package com.hcl;

import java.util.Scanner;

public class WicketMain {

	public static void main(String[] args) {
		long over, ball;
		String wicketType, playerName, bowlerName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of wickets");
		int no = sc.nextInt();
		sc.nextLine();
		String[] str = new String[no];
		String[] words;
		for (int i = 0; i < no; i++) {
			System.out.println("Enter the details of wicket" + (i + 1));
			str[i] = sc.nextLine();
			sc.nextLine();
		}
		Wicket objs = new Wicket();
		for (int i = 0; i < no; i++) {
			words = str[i].split(",");
			over = Long.parseLong(words[0]);
			ball = Long.parseLong(words[1]);
			wicketType = words[2];
			playerName = words[3];
			bowlerName = words[4];
			objs.setOver(over);
			objs.setBall(ball);
			objs.setWicketType(wicketType);
			objs.setPlayerName(playerName);
			objs.setBowlerName(bowlerName);
			System.out.println("Wicket Details");
			System.out.println("Over :" + objs.getOver());
			System.out.println("Ball :" + objs.getBall());
			System.out.println("Wicket Type :" + objs.getWicketType());
			System.out.println("Player Name :" + objs.getPlayerName());
			System.out.println("Bowler Name :" + objs.getBowlerName());
			sc.close();
		}

	}

}
