package practice2;

public class Advance extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("Advance can run");
	}

	@Override
	public void jump() {
		System.out.println("Advance can jump");
	}

	@Override
	public void turn() {
		System.out.println("Advance can turn");
	}

	@Override
	public void showInfo() {
		System.out.println("Advance lv is 2");
	}
}
