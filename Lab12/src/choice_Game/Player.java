package choice_Game;

public abstract class Player {
   private String name;
   private String roshamboValue;
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRoshamboValue() {
	return roshamboValue;
}
public void setRoshamboValue(String roshamboValue) {
	this.roshamboValue = roshamboValue;
}

public Player(String name, String roshamboValue) {
	setName(name);
	setRoshamboValue(roshamboValue);
	
}
public abstract String generateRoshambo();
}
