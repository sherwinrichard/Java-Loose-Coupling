package loosecoupling;
public class GameRunner {
	GameConsole a;
	public GameRunner(GameConsole a) {
		this.a = a;	
	}
	public static void main(String[] args) {	
		Mario mario = new Mario();
		SuperContra supercontra = new SuperContra();
		BatMan batman = new BatMan();
		
		GameRunner obj = new GameRunner(batman);
		obj.runGame();
	}
	void runGame() {
		a.up();
		a.down();
		a.right();
		a.left();			
	}
}		