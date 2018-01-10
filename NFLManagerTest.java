/**Program:NFLPlayerTest
 * File:NFLPlayerTest.java
 * Summary:Tests the UML of NFL Manager Class
 * Author:Lorenzo Quintana
 * Date:Jan 04, 2018
 */

/*Note: I have gotten stuck as to what to do next in this program.  I have a general idea that the NFLManager class should be able to create players
 * based on criteria in the NFLPlayer class.  Then those players are saved into an array that is then displayed in the main class.  I have not figured
 * out how I am supposed to have the NFLManager class create a player other than inputings the player info myself, or having the user input each parameter
 * one at a time per player which I feel wouldn't be sufficent.  Also what kind of array holds the players information.  From what I can tell the string array
 * only holds the word player1 not the info associated with player1.  I know it's incomplete and incorrect, I just don't know how to go further than this,
 * and what parts are even remotely correct.
 */
import java.util.Scanner;

public class NFLManagerTest {
	public static void main (String[]args) {	
				
	}
public static class NFLManager{
	private String name = "Jason";
	private String team = "The Eagles";
	
	public void createPlayer(String player) {
		String [] playerMatrix = new String [6];
		playerMatrix[0] = "player1";
		playerMatrix[1] = "player2";
		playerMatrix[2] = "player3";
		playerMatrix[3] = "player4";
		playerMatrix[4] = "player5";
		playerMatrix[5] = "player6";
		for (int i = 0; i < playerMatrix.length; i++) {
			System.out.println(playerMatrix[i]);
		}
	}	
}
	NFLPlayer player1 = new NFLPlayer("John Doe", 27, "The Eagles", "Linebacker", "Active", 4, 1, 17, 70, 169); {
	}
	NFLPlayer player2 = new NFLPlayer("Jack Doe", 24, "49ners", "Linebacker", "Active", 2, 2, 76, 72, 186);{	
	}
	
public static class NFLPlayer {
	private String Name; //Players Name
	private int Age; //Players Age
	private String Team; //Players current team
	private String Position; //Players current position
	private String Status; //Whether player is currently in active roster
	private int yearsNFLActive; //Number of years player has played for the nfl
	private int yearsTeamActive; //Number of years in current team
	private int playerNumber; //Players uniform number
	private int height; //Players height in inches
	private int weight; //Players weight in pounds
	/**All private categories are converted to public ones under different yet similar names in order to prevent
	 * other classes from editing the actual values.*/ 
	
	public NFLPlayer(String Name, int Age, String Team, String Position, String Status, int yearsNFLActive, int yearsTeamActive, int playerNumber, int height, int weight) {
		this.Name = Name;
		this.Age = Age;
		this.Team = Team;
		this.Position = Position;
		this.Status = Status;
		this.yearsNFLActive = yearsNFLActive;
		this.yearsTeamActive = yearsTeamActive;
		this.playerNumber = playerNumber;
		this.height = height;
		this.weight = weight;
		}
	}
}