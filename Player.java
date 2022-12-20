package practice2;

public class Player {

	private PlayerLevel level;
	
	public Player() {
		level = new begin();
		level.showInfo();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upupLevel(PlayerLevel level) {
		this.level = level;
		level.showInfo();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
