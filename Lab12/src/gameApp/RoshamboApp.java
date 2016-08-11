package gameApp;

import java.util.Random;
import java.util.Scanner;

import choice_Game.*;

public class RoshamboApp {
	
	public static String getRandomValue(){
		String randomValue="";
		Random rand =new Random();
		int randomNum =rand.nextInt(3)+1;
		if(randomNum==1)
			 randomValue="Rock";
		else if(randomNum==2)
			randomValue="Paper";
		else 
			randomValue="Scissor";
		return randomValue;
	}

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String choice = "yes"; 
		
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("please enter your name:");
        String userInput1 =scan1.nextLine();
		
		while (choice.equalsIgnoreCase("yes")) {
			
            System.out.println("would you like to play against Rock_Player or Random_Player(RP1/RP2)?:");
               String userInput2 =scan1.nextLine();
   
            System.out.println("Rock,Paper or Scissors?:");
               String userInput3 =scan1.nextLine();
            	  
          Player player1= new Rock_Player("Rock_Player","Rock");
          Player player2= new Random_player("Random_player", getRandomValue());
          Player player3= new Human_Player(userInput1,userInput3 );
          
              if(userInput2.equalsIgnoreCase("RP1")){
            	System.out.println(player1.getName()+":"+" "+ player1.generateRoshambo());
          		System.out.println(player3.getName()+":"+" "+ player3.generateRoshambo());
            	if(player1.generateRoshambo().equalsIgnoreCase("Rock")) {
            		System.out.println("Draw!");
            	}
            	if (player3.generateRoshambo().equalsIgnoreCase("Paper")){
            		System.out.println("Paper beats rock!");
            		System.out.println(player3.getName()+" wins!");
            	}
            	if (player3.generateRoshambo().equalsIgnoreCase("Scissors")){
            		System.out.println("rock beats Scissors!");
            		System.out.println(player1.getName()+" wins!");
            	}
           }
              
              if(userInput2.equalsIgnoreCase("RP2")){
            	System.out.println(player2.getName()+":"+" "+ player2.generateRoshambo());
          		System.out.println(player3.getName()+":"+" "+ player3.generateRoshambo());
          		if(player2.generateRoshambo().equalsIgnoreCase(player3.generateRoshambo())){
          			System.out.println("Draw!");
          		}
          		if((player2.generateRoshambo().equalsIgnoreCase("Rock"))&&(player3.generateRoshambo().equalsIgnoreCase("Paper"))){
          			System.out.println("Paper beats rock!");
            		System.out.println(player3.getName()+" wins!");
          		}
          		if((player2.generateRoshambo().equalsIgnoreCase("Rock"))&&(player3.generateRoshambo().equalsIgnoreCase("Scissors"))){
          			System.out.println("rock beats Scissors!");
            		System.out.println(player2.getName()+" wins!");
          		}
          		if((player2.generateRoshambo().equalsIgnoreCase("Paper"))&&(player3.generateRoshambo().equalsIgnoreCase("Rock"))){
          			System.out.println("Paper beats rock!");
            		System.out.println(player2.getName()+" wins!");
          		}
          		if((player2.generateRoshambo().equalsIgnoreCase("Paper"))&&(player3.generateRoshambo().equalsIgnoreCase("Scissors"))){
          			System.out.println("Scissors beats Paper!");
            		System.out.println(player3.getName()+" wins!");
          		}
          		if((player2.generateRoshambo().equalsIgnoreCase("Scissors"))&&(player3.generateRoshambo().equalsIgnoreCase("Paper"))){
          			System.out.println("Scissors beats Paper!");
            		System.out.println(player2.getName()+" wins!");
          		}
          		if((player2.generateRoshambo().equalsIgnoreCase("Scissors"))&&(player3.generateRoshambo().equalsIgnoreCase("Rock"))){
          			System.out.println("Rock beats Scissors!");
            		System.out.println(player3.getName()+" wins!");
          		}
              }
			System.out.println("you want to continue?");
			choice = scan1.nextLine();
		}
	}

	}


