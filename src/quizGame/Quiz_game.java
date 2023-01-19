package quizGame;
import java.util.Scanner;
public class Quiz_game {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Welcome to Quiz Game");
		System.out.println("Answer 5 Questions to win Prizes!");
		System.out.print("What is your name? ");
		String name = x.nextLine();
		System.out.println("Welcome " + name + ", Goodluck!");
		System.out.println("Let our game begin!");
		System.out.print("1. What is the Center of the Earth? ");
		String answer1 = x.nextLine();
		
		if(answer1 .equalsIgnoreCase("core")){
			System.out.println("The answer is correct!");
		} else{
			System.out.println("Wrong!");
		}
		System.out.print("2. Who wrote Noli me Tangere? ");
		String answer2 = x.nextLine();
		
		if(answer2 .equalsIgnoreCase("Jose Rizal")) {
			System.out.println("The answer is correct!");
		}else {
			System.out.println("Wrong!");
		}
		System.out.print("3. 20 + 21 = ? ");
		int answer3 = x.nextInt();
		if(answer3 == 41) {
			System.out.println("The answer is correct!");
		}else {
			System.out.println("Wrong!");
		}
		System.out.print("4. How many internal organs do humans have? ");
		int answer4 = x.nextInt();
		if(answer4 == 78) {
			System.out.println("The answer is correct!");
		}else {
			System.out.println("Wrong!");
		}
		System.out.print("5. How many seconds have in a day? ");
		int answer5 = x.nextInt();
		if(answer5 == 86400) {
			System.out.println("The answer is correct!");
		}else {
			System.out.println("Wrong!");
		}
	}

}
