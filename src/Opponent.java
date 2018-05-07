import java.util.ArrayList;

public class Opponent {

	String opponentName;
	
	ArrayList<Pokemon> EnemyParty = new ArrayList();
	
	public void setOpponentName(String newName) {
		opponentName = newName;
	}
	
	public void addPokemonToParty(Pokemon poke) {
		EnemyParty.add(poke);
	}
	
	public Pokemon getPokemon(int num) {
		return EnemyParty.get(num);
	}
}
