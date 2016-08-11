package choice_Game;

public class Rock_Player extends Player {
       
	@Override
	public String generateRoshambo() {
		
		return getRoshamboValue();
	}

	public Rock_Player(String name, String roshamboValue) {
		super(name, roshamboValue);
		
	}
	
	

}
