package abstractClasses;
public abstract class GameCalculator {

	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	//final : override edilmemesi için kulllanılan bir koddur.
}
