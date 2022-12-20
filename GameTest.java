package practice2;

public class GameTest {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		System.out.println("=====================");
		
		Advance advance = new Advance();
		player.upupLevel(advance);
		player.play(2);
		
		System.out.println("=====================");
		
		Super1 super1 = new Super1();
		player.upupLevel(super1);
		player.play(3);
		
		
		
	}

}
