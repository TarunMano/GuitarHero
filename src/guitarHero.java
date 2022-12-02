
public class guitarHero {
	public static void main(String[] args) {
		 GuitarString[] list = new GuitarString[37];
		 for (int i = 1; i <= list.length; i++) {
			 list[i-1] = new GuitarString(440.0*(Math.pow(1.05956, i - 25)));
		 }
	}
}
