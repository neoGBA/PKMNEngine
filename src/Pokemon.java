import java.util.ArrayList;
import java.util.Random;

public class Pokemon {
	int level;
	
	
	String name = "";
	String type = "";
	String type2 = null;
	
	int HP;
	int MaxHP;
	int Attack;
	int Defense;
	int SpecialAttack;
	int SpecialDefense;
	int Speed;
	
	String status = " ";
	
	ArrayList<Move> PokemonMoves = new ArrayList();
	
	public Pokemon() {		
		
	}
	
	public Pokemon(String name, int level, int baseHP, int baseAttack, int baseDefense, int baseSpecialAttack, int baseSpecialDefense, int baseSpeed, String type) {
		name = this.name;
		type = this.type;
		level = this.level;
		
		HP = calculateHP(baseHP, level);
		MaxHP = HP;
		Attack = calculateOtherStat(baseAttack, level);
		Defense = calculateOtherStat(baseDefense, level);
		SpecialAttack = calculateOtherStat(baseSpecialAttack, level);
		SpecialDefense = calculateOtherStat(baseSpecialDefense, level);
		Speed = calculateOtherStat(baseSpeed, level);
	}
	
	public Pokemon(String name, int level, int baseHP, int baseAttack, int baseDefense, int baseSpecialAttack, int baseSpecialDefense, int baseSpeed, String type, String type2) {
		//if type 2 is used, this constructor is used
		name = this.name;
		type = this.type;
		type2 = this.type2;
		level = this.level;
		
		HP = calculateHP(baseHP, level);
		MaxHP = HP;
		Attack = calculateOtherStat(baseAttack, level);
		Defense = calculateOtherStat(baseDefense, level);
		SpecialAttack = calculateOtherStat(baseSpecialAttack, level);
		SpecialDefense = calculateOtherStat(baseSpecialDefense, level);
		Speed = calculateOtherStat(baseSpeed, level);
	}
	
	public int calculateHP(int baseHP, int level) {
		Random rand = new Random(); 
		int newHP = (((baseHP + rand.nextInt(31)*2)*level)/100)+level+10;
		return newHP;
	}
	
	public int calculateOtherStat(int baseStat, int level) {
		Random rand = new Random();
		int newStat = (((2 * baseStat + rand.nextInt(31))* level)/100) + 5;
		return newStat;
	}
	
	public void setHP(int newHP) {
		HP = newHP;
		if(HP<0) {
			HP = 0;
		}
	}
	
	public void setStatus(String newStatus) {
		status = newStatus;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStatus() {
		return status;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getHP() {
		return HP;
	}
	
	public int getMaxHP() {
		return MaxHP;
	}
	
	public String getTypeOne() {
		return type;
	}
	
	public String getTypeTwo() {
		if(type2==null) {
			type2 = "";
		}
		return type2;
	}
	
	
	public void addMoves(Move move) {
		PokemonMoves.add(move);
	}
	
	public Move getMove(int num) {
		return PokemonMoves.get(num);
	}
	
}
