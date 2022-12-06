
public class KeyboardHero {
	public static void main(String[]args) {
		String Keys = "iuyuiiiuuuippiuyuiiiuuiuy";
		 GuitarString[] list = new GuitarString[37];
		 String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
		 for (int i = 1; i <= list.length; i++) {
			 list[i-1] = new GuitarString(440.0*(Math.pow(1.05956, i - 25)));
			 
		 }
		
		
		 play(list, keyboard, Keys);
	}
	
	private static void play(GuitarString[]list, String keyboard, String letters) { 
		char[]keyb = keyboard.toCharArray();
		String [] keyBo = letters.split("");
		int n = 0;
        while (true) {
        	
        	final double TEXT_POS_X = .5;
	        final double TEXT_POS_Y = .5;
	       
        	if (StdDraw.hasNextKeyTyped()) {
        		StdDraw.text(TEXT_POS_X,TEXT_POS_Y, keyBo[n]);
        		char key = StdDraw.nextKeyTyped();
        		int count = 0;
        		for(char c:keyb) {
        			if(key==c) {
        				list[count].pluck();
        				System.out.println(count);
        			}
        			count++;
        		}
        	}
        	double sample = 0.0;
        	for(int i = 0; i < 37;i++) {
        		 
        		sample += list[i].sample();
        	}
        	 StdAudio.play(sample);
        	 
        	 for(int i = 0; i < 37;i++) {
         		list[i].tic();
        	 }
        	 n++;
        }
	}

	
}

