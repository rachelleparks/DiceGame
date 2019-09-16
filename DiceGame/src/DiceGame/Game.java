package DiceGame;
import java.util.*;
public class Game {
	   private Scanner scnr;
	private int enteredBet;
	private int enteredNum;

	public void play() {
		   
		      scnr = new Scanner(System.in);
		      System.out.print("How much do you want to bet? ");                                                 
		      setEnteredBet(scnr.nextInt()); 
		      System.out.print("What number do you choose ? ");
		      setEnteredNum(scnr.nextInt()); 
		   
		      // generate the die roll 
		      Random randGen = new Random();
		      int dieNum  =  randGen.nextInt(6) + 1;
		      System.out.println("The die is a " + dieNum);
		   
		      // write the rest of your code below
		        
		   }

	public int getEnteredNum() {
		return enteredNum;
	}

	public void setEnteredNum(int enteredNum) {
		this.enteredNum = enteredNum;
	}

	public int getEnteredBet() {
		return enteredBet;
	}

	public void setEnteredBet(int enteredBet) {
		this.enteredBet = enteredBet;
	}

}
