package com.exampleinterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainExample {

	public static void main(String[] args) throws IOException {

		System.out.println("ChooseStall Type");
		System.out.println("1)Gold Stall" + "\n" + "2)Premium Stall" + "\n" + "3)Executive Stall" + "\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice=Integer.parseInt(br.readLine());
		if(choice==1) {
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
			String str=br.readLine();
			String words[]=str.split(",");
			GoldStall gs=new GoldStall(words[0], Integer.parseInt(words[1]), words[2],Integer.parseInt(words[3]));
			gs.display();
		}
		else if(choice==2) {
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
			String str=br.readLine();
			String words[]=str.split(",");
			PremiumStall ps=new PremiumStall(words[0], Integer.parseInt(words[1]), words[2],Integer.parseInt(words[3]));
			ps.display();
		}
		else if(choice==3) {
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
			String str=br.readLine();
			String words[]=str.split(",");
			ExecutiveStall es=new ExecutiveStall(words[0], Integer.parseInt(words[1]), words[2],Integer.parseInt(words[3]));
			es.display();
		}
		else {
			System.out.println("Wrong choice..");
		}
		
		
		
	}

}
