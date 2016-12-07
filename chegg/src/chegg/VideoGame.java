package chegg;

public class VideoGame {
	// instance variables
	private String gameName;
	private String gameConsole;

	// Default constructor
	public VideoGame() {

	}

	// parameterized constructor
	public VideoGame(String gameName, String gameConsole) {
		this.gameName = gameName;
		this.gameConsole = gameConsole;
	}

	/* getters and setters */
	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameConsole() {
		return gameConsole;
	}

	public void setGameConsole(String gameConsole) {
		this.gameConsole = gameConsole;
	}

}
