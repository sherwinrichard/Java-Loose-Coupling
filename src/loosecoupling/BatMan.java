package loosecoupling;
public class BatMan implements GameConsole {
	public void up() {
		System.out.println("BatMan move up");
	}
	public void down() {
		System.out.println("BatMan move down");
	}
	public void right() {
		System.out.println("BatMan move right");
	}
	public void left() {
		System.out.println("BatMan move left");
	}
}