import java.util.ArrayList;

public class Trainer {
	
	String playerName;
	
	ArrayList<Pokemon> PlayerParty = new ArrayList();
	
	public void setPlayerName(String newName) {
		playerName = newName;
	}
	
	public void addPokemonToParty(Pokemon poke) {
		PlayerParty.add(poke);
	}
	
	public Pokemon getPokemon(int num) {
		return PlayerParty.get(num);
	}
}
