/**Program:NFLPlayerTest
 * File:NFLPlayerTest.java
 * Summary:Tests the UML of NFL Player Class
 * Author:Lorenzo Quintana
 * Date:Jan 04, 2018
 */
/**Main Method which displays created player's information*/
public class NFLPlayerTest {
	public static void main (String[]args) {
		NFLPlayer player = new NFLPlayer("John Doe", 27, "The Eagles", "Linebacker", true, 4, 1, 17, 70, 169);
		System.out.println("Info on: " + player.getName);
		System.out.println(player.getName + " is " + player.getAge + " years old");
		System.out.println(player.getName + "'s Current Team is: " + player.getTeam);
		System.out.println(player.getName + "'s Team Position is: " + player.getPosition);
		System.out.println(player.getName + " is currently: " + player.getActive);
		System.out.println(player.getName + " has played: " + player.getNFLYears + " years in the NFL");
		System.out.println(player.getName + " has played: " + player.getTeamYears + " years on current team");
		System.out.println(player.getName + "'s uniform number is: " + player.getNumber);
		System.out.println(player.getName + "'s height is: " + player.getFeet + " Ft "+ player.getInches + " In");
		System.out.println(player.getName + "'s weight is: " + player.getWeight + " pounds");
		
	}
	/**Class that stores player's data*/
public static class NFLPlayer {
	private String Name = "John Doe"; //Players Name
	private int Age = 27; //Players Age
	private String Team = "The Eagles"; //Players current team
	private String Position = "Linebacker"; //Players current position
	private boolean Active = true; //Whether player is currently in active roster
	private int yearsNFLActive = 4; //Number of years player has played for the nfl
	private int yearsTeamActive = 1; //Number of years in current team
	private int playerNumber = 17; //Players uniform number
	private int height = 70; //Players height in inches
	private int weight = 169; //Players weight in pounds

	/**Player creation constructor*/
	public NFLPlayer(String Name, int Age, String Team, String Position, boolean Active, int yearsNFLActive, int yearsTeamActive, int playerNumber, int height, int weight) {
		this.Name = Name;
		this.Age = Age;
		this.Team = Team;
		this.Position = Position;
		this.Active = Active;
		this.yearsNFLActive = yearsNFLActive;
		this.yearsTeamActive = yearsTeamActive;
		this.playerNumber = playerNumber;
		this.height = height;
		this.weight = weight;
	}

	/**Name variable getter*/
	public String getName; {
		getName = Name;
	}
	/**Age variable getter*/
	public int getAge; {
		getAge = Age;
	}
	public String toString( ) { //I cannot get the to string to work.  I have looked at online examples and followed but it still will not work.
		return "He is " + getAge + " years old"; //If you could let me know which part of the to string process is incorrect for reference.
	}
	public String getTeam; {
		getTeam = Team;
	}
	public String getPosition; {
		getPosition = Position;
	}
	public String getActive; {
		if (Active == true)
			getActive = "Playing";
		else 
			getActive = "Not Playing";
	}
	public int getNFLYears; {
		getNFLYears = yearsNFLActive;
	}
	public int getTeamYears; {
		getTeamYears = yearsTeamActive;
	}
	public int getNumber; {
		getNumber = playerNumber;
	}
	public int getFeet; {
		getFeet = height / 12;
	}
	public int getInches; {
		getInches = height % 12;
	}
	public int getWeight; {
		getWeight = weight;
		}
	
	}
public static class NFLPlayerList2 {
	public NFLPlayerList2() {
		}
	}
}