package practice2;

public class Super1 extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Super can fastrun");
	}

	@Override
	public void jump() {
		System.out.println("Super can highjump");
	}

	@Override
	public void turn() {
		System.out.println("Super can turn more faster");
	}

	@Override
	public void showInfo() {
		System.out.println("Super lv is 3");
	}
}
