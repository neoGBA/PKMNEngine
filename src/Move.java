import java.util.ArrayList;

public class Move {
	
	String name;
	String type;
	String moveType;
	int baseDamage;
	int accuracy;
	int MaxPP;
	int PP;
	
	ArrayList<Move> MoveList = new ArrayList();
	
	public Move() {
		Move Absorb = new Move("Absorb", "Grass", "Special", 20, 100, 25);//User recovers half the HP inflicted on opponent.
		Move Acid = new Move("Acid", "Poison", "Special", 40, 100, 30); //May lower opponent's Special Defense 
		Move AcidArmor = new Move("Acid Armor", "Poison", "Other", 0, 100, 20);//Sharply raises user's Defense.
		Move Agility = new Move("Agility", "Psychic", "Other", 0, 100, 30);//Sharply raises user's Speed.
		Move Amnesia = new Move("Amnesia", "Psychic", "Other", 0, 100, 20);//Sharply raises user's Special Defense.
		Move AuroraBeam = new Move("Aurora Beam", "Ice", "Special", 65, 100, 20);//May lower opponent's Attack.
		Move Barrage = new Move("Barrage", "Normal", "Physical", 15, 85, 20);//Hits 2-5 times in one turn.
		Move Barrier = new Move("Barrier", "Psychic", "Other", 0, 100, 20);//Sharply raises user's Defense.
		Move Bide = new Move("Bide", "Normal", "Physical", 0, 100, 10);//User takes damage for two turns then strikes back double.
		Move Bind = new Move("Bind", "Normal", "Physical", 15, 85, 20);//Traps opponent, damaging them for 4-5 turns.
		Move Bite = new Move("Bite", "Dark", "Physical", 60, 100, 25);//	May cause flinching.
		Move Blizzard = new Move("Blizzard", "Ice", "Special", 110, 70, 5);//May freeze opponent.
		Move BodySlam = new Move("Body Slam", "Normal", "Physical", 85, 100, 15);//May paralyze opponent.
		Move BoneClub = new Move("Bone Club", "Ground", "Physical", 65, 85, 20);//May cause flinching.
		Move Bonemerang = new Move("Bonemerang", "Ground", "Physical", 50, 90, 10);//Hits twice in one turn.
		Move Bubble = new Move("Bubble", "Water", "Special", 40, 100, 30);//May lower opponent's Speed.
		Move Bubblebeam = new Move("Bubblebeam", "Water", "Special", 65, 100, 20);//May lower opponent's Speed.
		Move Clamp = new Move("Clamp", "Water", "Physical", 35, 85, 10);//Traps opponent, damaging them for 4-5 turns.
		Move CometPunch = new Move("Comet Punch", "Normal", "Physical", 10, 85, 15);//Hits 2-5 times in one turn.
		Move ConfuseRay = new Move("Confuse Ray", "Ghost", "Other", 0, 100, 10);//Confuses opponent
		Move Confusion = new Move("Confusion", "Psychic", "Special", 50, 100, 25);//May confuse opponent		
		Move Constrict = new Move("Constrict", "Normal", "Physical", 10, 100, 35);//May lower opponent's speed by one stage
		Move Conversion = new Move("Conversion", "Normal", "Other", 0, 100, 30);//Changes user's type to that of first move
		Move Counter = new Move("Counter", "Fighting", "Physical", 0, 100, 20);//When hit by a Physical Attack, user strikes back with 2x power.
		Move Crabhammer = new Move("Crabhammer", "Water", "Physical", 100, 90, 10);//High critical hit ratio
		Move Cut = new Move("Cut", "Normal","Physical", 50, 95, 30);
		Move DefenseCurl = new Move("Defense Curl", "Normal", "Other", 0, 100, 40);//Raises users defense
		Move Dig = new Move("Dig", "Ground", "Physical", 80, 100, 10);//Digs underground on first turn, attacks on second. Can also escape from caves.
		Move Disable = new Move("Disable", "Normal", "Other", 0, 100, 20);//Opponent can't use its last attack for a few turns.
		Move DizzyPunch = new Move("Dizzy Punch", "Normal", "Physical", 70, 100, 10);//May confuse opponent.
		Move DoubleKick = new Move("Double Kick", "Fighting", "Physical", 30, 100, 30);//Hits twice in one turn
		Move DoubleSlap = new Move("Double Slap", "Normal", "Physical", 15, 85, 10);//Hits 2-5 times in one turn.
		Move DoubleTeam = new Move("Double Team", "Normal", "Other", 0, 100, 15);//Raises user's evasiveness
		Move DoubleEdge = new Move("Double Edge", "Normal", "Physical", 120, 100, 15);//User receives recoil damage
		Move DragonRage = new Move("Dragon Rage", "Dragon", "Special", 0, 100, 10);//Always does 40 damage
		Move DreamEater = new Move("Dream Eater", "Psychic", "Special", 100, 100, 15);//User recovers half the HP inflicted on a sleeping opponent.
		Move DrillPeck = new Move("Drill Peck", "Flying", "Physical", 80, 100, 20);
		Move Earthquake = new Move("Earthquake", "Ground", "Physical", 100, 100, 10);//Power is doubled if opponent is underground from using Dig.
		Move EggBomb = new Move("Egg Move", "Normal", "Physical", 100, 75, 10);
		Move Ember = new Move("Ember", "Fire", "Special", 40, 100, 25);//May burn opponent
		Move Explosion = new Move("Explosion", "Normal", "Physical", 250, 100, 5);//User Faints
		Move FireBlast = new Move("Fire Blast", "Fire", "Special", 110, 85, 5);//May Burn opponent
		Move FirePunch = new Move("Fire Punch", "Fire", "Physical", 75, 100, 15);//May burn opponent
		Move FireSpin = new Move("Fire Spin", "Fire", "Special", 35, 85, 15);//Traps opponent, damaging them for 4-5 turns
		Move Fissure = new Move("Fissure", "Ground", "Physical", 0, 30, 5);//One hit KO if it hits
		Move Flamethrower = new Move("Flamethrower", "Fire", "Special", 90, 100, 15);//May Burn opponent
		Move Flash = new Move("Flash", "Noraml", "Other", 0, 100, 20);//Lowers opponent's accuracy
		Move Fly = new Move("Fly", "Flying", "Physical", 90, 95, 15);//Flies up on first turn, attacks on second turn.
		Move FocusEnergy = new Move("Focus Enery", "Normal", "Other", 0, 100, 30);//Increases critical hit ratio
		Move FuryAttack = new Move("Fury Attack", "Normal", "Physical", 15, 85, 20);//Hits 2-5 times in one turn.
		Move FurySwipes = new Move("Fury Swipes", "Normal", "Physical", 18, 80, 15);//Hits 2-5 times in one turn.
		Move Glare = new Move("Glare", "Normal", "Other", 0, 100, 30);//Paralyze Opponent
		Move Growl = new Move("Growl", "Normal", "Other", 0, 100, 40);//Lowers opponent's attack
		Move Growth = new Move("Growth", "Normal", "Other", 0, 100, 40);//Raises User's Attack & Special Attack
		Move Guillotine = new Move("Guillotne", "Normal", "Physical", 0, 30, 5);//One hit KO if it hits
		Move Gust = new Move("Gust", "Flying", "Special", 40, 100, 35);//Hits pokemon using FLy/Bounce with double power
		Move Harden = new Move("Harden", "Normal", "Other", 0, 100, 30);//Raises user's defense
		Move Haze = new Move("Haze", "Ice", "Other", 0, 100, 30);//Resets all stat changes
		Move Headbutt = new Move("Headbutt", "Normal", "Physical", 70, 100, 15);//May Cause Flinching
		Move HighJumpKick = new Move("High Jump Kick", "Fighting", "Physical", 130, 90, 10);//If it misses it halfs the users HP
		Move HornAttack = new Move("Horn Attack", "Normal", "Physical", 65, 100, 25);
		Move HornDrill = new Move("Horn Drill", "Normal", "Physical", 0, 30, 5);//One Hit KO if it hits
		Move HydroPump = new Move("Hydro Pump", "Water", "Special", 110, 80, 5);
		Move HyperBeam = new Move("Hyper Beam", "Normal", "Specail", 150, 90, 5);//User must recharge next turn
		Move HyperFang = new Move("Hyper Fang", "Normal", "Physical", 80, 90, 15);//May cause Flinching
		Move Hypnosis = new Move("Hypnosis", "Psychic", "Other", 0, 60, 20);//Puts opponent to sleep
		Move IceBeam = new Move("Ice Beam", "Ice", "Special", 90, 100, 10);//May freeze opponent
		Move IcePunch = new Move("Ice Punch", "Ice", "Physical", 75, 100, 15);//May freeze opponent
		Move JumpKick = new Move("Jump Kick", "Fighting", "Physical", 100, 95, 10);//If it misses it halfes the users HP
		Move KarateChop = new Move("Karate Chop", "Fighting", "Physical", 50, 100, 25);//High Crit Ratio
		Move Kinesis = new Move("Kinesis", "Psychic", "Other", 0, 80, 15);//Lowers opponents accuracy
		
		Move Tackle = new Move("Tackle", "Normal", "Physical", 40, 100, 35);
		
		MoveList.add(Absorb);
	}
	
	public Move(String name, String type, String moveType, int baseDamage, int accuracy, int PP) {
		name = this.name;
		type = this.type;
		moveType = this.moveType;
		baseDamage = this.baseDamage;
		accuracy = this.accuracy;
		PP = this.PP;
		MaxPP = PP;
	}
	
	public String  getName() {
		return name;
	}
	
	public int getAccuracy() {
		return accuracy;
	}
	
	public Move getMove(int num) {
		return MoveList.get(num);
	}
	
	public int getPP() {
		return PP;
	}
	
	public int getMaxPP() {
		return MaxPP;
	}
	
	public void setPP(int newPP) {
		PP = newPP;
	}
	
}
