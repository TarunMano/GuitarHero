
public class AutoGuitar {
	public static void main(String[] args) {
		//Mariah carey
//		String Keys = "uo[dcdz[vccdcdz[pzcvbvczbmbcvc=cvdczd=bvcdzd=[zcmnbvcz=vbcaa";
		//Mary had a little lamb
//		String Keys = "iuyuaiiiauuuippaiuyuiiiauuiuy";
		//jingle bells
		String Keys = "tttttttuertyyyyytttttrrtrutttttttuertyyyyytttttrrtrutttttttuertyyyyytttttrrtru";
		 GuitarString[] list = new GuitarString[37];
		 for (int i = 1; i <= list.length; i++) {
			 list[i-1] = new GuitarString(440.0*(Math.pow(1.05956, i - 25)));
			 
		 }
		 
	        
	   
		 play(list, Keys);


	}
	
	private static void play(GuitarString[]list, String Key) {
		char[]KeyBo = Key.toCharArray();
		Stopwatch stop = new Stopwatch();
		int n = 0;
		double x = 0.0;
		double y = 1;
       while (true) {
    	   double stop1 = stop.elapsedTime();
//    	   System.out.println(stop.elapsedTime());
       	if (stop1>x&&stop1<y) {
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
       		x+=.5;
       		y+=.5;
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
