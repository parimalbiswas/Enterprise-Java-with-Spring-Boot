import java.util.Scanner;

class Guesser
{
	int guessNum;

	public int guessNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the Number");
		guessNum = sc.nextInt();
		return guessNum;
	}
}

class Player
{
	int pguessNum; // local Variable || local Scope || Hence No Conflict

	public int pguessNumber()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Player Guess the Number");
		pguessNum = sc1.nextInt();
		return pguessNum;
	}
}

class Umpire
{
	int numFromGusser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	public void collectNumberFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGusser = g.guessNumber();

	}

	public void collectNumberFromPlayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		numFromPlayer1 = p1.pguessNumber();
		numFromPlayer2 = p2.pguessNumber();
		numFromPlayer3 = p3.pguessNumber();
	}

	public void compare()
	{

		if (numFromGusser == numFromPlayer1)
		{
			if (numFromGusser == numFromPlayer2 && numFromGusser == numFromPlayer2)
			{
				System.out.println("GAme tie. All of them answered Correctly");
			}
			else if (numFromGusser == numFromPlayer2)
			{
				System.out.println("Player 1 and player 2 Winer");
			}
			else if (numFromGusser == numFromPlayer3)
			{
				System.out.println("Player 1 and player 3 Winer");
			}
			else
			{
				System.out.println("Player 1 Won the game");
			}

		}
		else if (numFromGusser == numFromPlayer2)
		{
			if (numFromGusser == numFromPlayer3)
			{
				System.out.println("Player 2 and 3 Won the game");
			}
			else
			{
				System.out.println("Player 2 Won the game");
			}

		}
		else if (numFromGusser == numFromPlayer3)
		{
			System.out.println("Player 3 Won the game");
		}
		else
		{
			System.out.println("Game is Lost");
		}
	}

}

public class LaunchGame
{

	public static void main(String[] args)
	{
		Umpire u = new Umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayer();
		u.compare();

	}

}
