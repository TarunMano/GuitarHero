import java.util.Arrays;

public class KeyboardHero {
	public static void main(String[]args) {
		String Keys = "iuyuiiiuuuippiuyuiiiuuiuya";
		 GuitarString[] list = new GuitarString[37];
		 String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
		 for (int i = 1; i <= list.length; i++) {
			 list[i-1] = new GuitarString(440.0*(Math.pow(1.05956, i - 25)));
			 
		 }
		
		
		 play(list, keyboard, Keys);
	}
	
	private static void play(GuitarString[]list, String keyboard, String letters) { 
		char[]keyb = keyboard.toCharArray();
		String[] keyBo = letters.split("");
		char[] keyB = letters.toCharArray();
		final double TEXT_POS_X = .5;
        final double TEXT_POS_Y = .5;
        int keyCount = 0;
		int n = 0;
		StdDraw.text(TEXT_POS_X,TEXT_POS_Y, keyBo[n]);
		n++;
        while (true) {
        	
        	
	      

        	if (StdDraw.hasNextKeyTyped()) {
        		
        		char key = StdDraw.nextKeyTyped();
        		int count = 0;
        		
        		for(char c:keyb) {
        			if(key==c) {
        				System.out.println(keyB[keyCount]);
        				System.out.println(keyCount);
        				
        				if(keyB[keyCount]==c) {
        					if(keyCount == 25) {
        						StdDraw.clear();
        					}
        					else {
        					StdDraw.clear();
        					
                    		StdDraw.text(TEXT_POS_X,TEXT_POS_Y, keyBo[n]);
                    		keyCount++;
        					}
        				}
        				
        				
        				list[count].pluck();
        				System.out.println(count);
        			}
        			count++;
        		}
        		n++;
           		
        	}

        	double sample = 0.0;
        	for(int i = 0; i < 37;i++) {
        		 
        		sample += list[i].sample();
        	}
        	 StdAudio.play(sample);
        	 
        	 for(int i = 0; i < 37;i++) {
         		list[i].tic();
        	 }
        	

        	 
        
        }
	}

	
}

