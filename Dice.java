public class Dice {
	private final int[] validSides={4,6,8,10,12,20,100};
	private Die[] dice;
	public Dice(){
		dice=new Die[2];
		for(int i=0; i<2; i++)
			dice[i]=new Die(6);
	}
	public Dice(int number, int sides){
		validNumber(sides);
		dice=new Die[number];
		for(int i=0; i<number; i++){
			dice[i]=new Die(sides);
		}
	}
	public Dice(int number, int sides, int number2, int sides2){
		validNumber(sides); validNumber(sides2);
		dice=new Die[number+number2];
		int i=0;
		while(i<number){
			dice[i]=new Die(sides);
			i++;
		}
		while(i<number+number2){
			dice[i]=new Die(sides2);
			i++;
		}
	}
	public Dice(int number, int sides, int number2, int sides2, int number3, int sides3){
		validNumber(sides); validNumber(sides2); validNumber(sides3);
		dice=new Die[number+number2+number3];
		int i=0;
		while(i<number){
			dice[i]=new Die(sides);
			i++;
		}
		while(i<number+number2){
			dice[i]=new Die(sides2);
			i++;
		}
		while(i<number+number2+number3){
			dice[i]=new Die(sides3);
			i++;
		}
	}
	public Dice(int number, int sides, int number2, int sides2, int number3, int sides3, int number4, int sides4){
		validNumber(sides); validNumber(sides2); validNumber(sides3); validNumber(sides4);
		dice=new Die[number+number2+number3+number4];
		int i=0;
		while(i<number){
			dice[i]=new Die(sides);
			i++;
		}
		while(i<number+number2){
			dice[i]=new Die(sides2);
			i++;
		}
		while(i<number+number2+number3){
			dice[i]=new Die(sides3);
			i++;
		}
		while(i<number+number2+number3+number4){
			dice[i]=new Die(sides4);
			i++;
		}
	}
	public Dice(int number, int sides, int number2, int sides2, int number3, int sides3, int number4, int sides4,
			int number5, int sides5){
		validNumber(sides); validNumber(sides2); validNumber(sides3); validNumber(sides4); validNumber(sides5);
		dice=new Die[number+number2+number3+number4+number5];
		int i=0;
		while(i<number){
			dice[i]=new Die(sides);
			i++;
		}
		while(i<number+number2){
			dice[i]=new Die(sides2);
			i++;
		}
		while(i<number+number2+number3){
			dice[i]=new Die(sides3);
			i++;
		}
		while(i<number+number2+number3+number4){
			dice[i]=new Die(sides4);
			i++;
		}
		while(i<number+number2+number3+number4+number5){
			dice[i]=new Die(sides5);
			i++;
		}
	}
	public Dice(int number, int sides, int number2, int sides2, int number3, int sides3, int number4, int sides4,
			int number5, int sides5, int number6, int sides6){
		validNumber(sides); validNumber(sides2); validNumber(sides3); validNumber(sides4); validNumber(sides5);
		validNumber(sides6);
		dice=new Die[number+number2+number3+number4+number5+number6];
		int i=0;
		while(i<number){
			dice[i]=new Die(sides);
			i++;
		}
		while(i<number+number2){
			dice[i]=new Die(sides2);
			i++;
		}
		while(i<number+number2+number3){
			dice[i]=new Die(sides3);
			i++;
		}
		while(i<number+number2+number3+number4){
			dice[i]=new Die(sides4);
			i++;
		}
		while(i<number+number2+number3+number4+number5){
			dice[i]=new Die(sides5);
			i++;
		}
		while(i<number+number2+number3+number4+number5+number6){
			dice[i]=new Die(sides6);
			i++;
		}
	}
	public Dice(int number, int sides, int number2, int sides2, int number3, int sides3, int number4, int sides4,
			int number5, int sides5, int number6, int sides6, int number7, int sides7){
		validNumber(sides); validNumber(sides2); validNumber(sides3); validNumber(sides4); validNumber(sides5);
		validNumber(sides6); validNumber(sides7);
		dice=new Die[number+number2+number3+number4+number5+number6+number7];
		int i=0;
		while(i<number){
			dice[i]=new Die(sides);
			i++;
		}
		while(i<number+number2){
			dice[i]=new Die(sides2);
			i++;
		}
		while(i<number+number2+number3){
			dice[i]=new Die(sides3);
			i++;
		}
		while(i<number+number2+number3+number4){
			dice[i]=new Die(sides4);
			i++;
		}
		while(i<number+number2+number3+number4+number5){
			dice[i]=new Die(sides5);
			i++;
		}
		while(i<number+number2+number3+number4+number5+number6){
			dice[i]=new Die(sides6);
			i++;
		}
		while(i<number+number2+number3+number4+number5+number6+number7){
			dice[i]=new Die(sides7);
			i++;
		}
	}
	public void roll(){
		for(Die d: dice)
			d.roll();
	}
	public Die[] getDice(){
		return dice;
	}
	public void total(){
		int total=0;
		for(int i=0; i<dice.length; i++){
			println(1+"d"+dice[i].getSides()+":\t"+dice[i].getValue());
			total+=dice[i].getValue();
		}
		println("Total:\t"+total+"\n");
	}
	private void println(Object obj){
		System.out.println(obj);
	}
	private void validNumber(int sides){
		if(sides<4 || sides>100 || sides%2==1 || (sides>20 && sides<100))
			throw new NumberFormatException("There is no "+sides+"-sided die in dungeons and dragons.");
		for(int i=0; i<validSides.length; i++){
			if(sides==validSides[i])
				return;
		}
		throw new NumberFormatException("There is no "+sides+"-sided die in dungeons and dragons.");
	}
}