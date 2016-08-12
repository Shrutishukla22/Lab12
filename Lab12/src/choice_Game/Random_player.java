package choice_Game;

import java.util.Random;

public class Random_player extends Player {

	@Override
	public String generateRoshambo() {
		String randomValue="";
		Random rand =new Random();
		int randomNum =rand.nextInt(3)+1;
		if(randomNum==1)
			 randomValue="Rock";
		else if(randomNum==2)
			randomValue="Paper";
		else 
			randomValue="Scissors";
		return randomValue;
	}

	public Random_player(String name, String roshamboValue) {
		super(name, roshamboValue);
		
	}
	public Random_player(String name) {
		super(name);
		
	}
	
	}

	

