import java.util.Random;
public class Die {
	private int sides;
	private int value;
	private Random random=new Random();
	public Die(){
		sides=6;
		value=1;
	}
	public Die(int sides){
		this.sides=sides;
		value=1;
	}
	public Die(int sides, int def){
		this.sides=sides;
		if(def<1)
			def=1;
		else if(def>sides)
			def=sides;
		value=def;
	}
	public void roll(){
		value=random.nextInt(sides)+1;
	}
	public void setValue(int value){
		this.value=value;
	}
	public int getValue(){
		return value;
	}
	public int getSides(){
		return sides;
	}
}