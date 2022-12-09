
public class AutoGuitar {
	public static void main(String[] args) {
		String Keys = "uo[dcdz[vccdcdz[pzcvbvczbmbcvc=cvdczd=bvcdzd=[zcmnbvcz=vbc";
		 GuitarString[] list = new GuitarString[37];
		 for (int i = 1; i <= list.length; i++) {
			 list[i-1] = new GuitarString(440.0*(Math.pow(1.05956, i - 25)));
			 
		 }
		 final double TEXT_POS_X = .5;
	     final double TEXT_POS_Y = .5;
	        
	   
		 play(list, Keys);


	}
	
	private static void play(GuitarString[]list, String Key) {
		char[]KeyBo = Key.toCharArray();
		Stopwatch stop = new Stopwatch();
		int n = 0;
       while (true) {
    	   int stop1 = (int)stop.elapsedTime();
//    	   System.out.println(stop.elapsedTime());
       	if (stop1 % 2 == 0) {
       		System.out.println(stop1);
//       		System.out.println(KeyBo[n]);
       		char key = KeyBo[n];
       		String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
       		int count = 0;
       		for (char c : keyboard.toCharArray()) {
       			if (key == c) {
       				list[count].pluck();
       			}
       			count++;
       			
       		}
       		n++;
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
