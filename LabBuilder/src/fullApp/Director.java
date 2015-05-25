package fullApp;

public class Director {

	public void construct (CharacterBuilderInterface character){
		character.createHead();
		character.createBody();
		character.createLegs();
	}
	
}
