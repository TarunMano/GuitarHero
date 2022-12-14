//Tarun Manoharan, Jacob Grady, Joaquin Olivo
//CS3
//GuitarHero
public class guitarHero {
	
	public static void main(String[] args) {
		 GuitarString[] list = new GuitarString[37];
		 for (int i = 1; i <= list.length; i++) {
			 list[i-1] = new GuitarString(440.0*(Math.pow(1.05956, i - 25)));
			 
		 }
		 final double TEXT_POS_X = .5;
	     final double TEXT_POS_Y = .5;
	        
	     StdDraw.text(TEXT_POS_X, TEXT_POS_Y, "Type q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/'  to play a note!");
		 play(list);


	}
	
	private static void play(GuitarString[]list) { 
        while (true) {
        	if (StdDraw.hasNextKeyTyped()) {
        		char key = StdDraw.nextKeyTyped();
        		String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
        		int count = 0;
        		for (char c : keyboard.toCharArray()) {
        			if (key == c) {
        				list[count].pluck();
        			}
        			count++;
        		}
        	}
        	double sample = 0;
        	for (int i = 0; i < list.length; i++) {
        		sample += list[i].sample();
        	}
        	StdAudio.play(sample);
        	
        	for(int i = 0; i < list.length; i++) {
        		list[i].tic();

        	}
        	
        }
  
        
	}
}