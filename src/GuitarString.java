import java.util.Random;

public class GuitarString {
	public RingBuffer ringBuff;
	public int counter; 
	public double N;
    public int sampleRate = 44100; 
    
    
	public GuitarString(double frequency) {
		N = sampleRate/frequency;
		int n = (int)Math.ceil(N);
		ringBuff = new RingBuffer(n);
		for(int i = 0;i < n; i++) {
			ringBuff.enqueue(0);
		}
	}
	public GuitarString(double[] init) {
		ringBuff = new RingBuffer(init.length);
		for(int i = 0; i < init.length;i++) {
			ringBuff.enqueue(init[i]);
		}
	}


	public void pluck() {
		for(int i = 0; i < N; i++) {
			Random rand = new Random();
			double r = rand.nextDouble(0.5 - -0.5) + -0.5;
			ringBuff.enqueue(r);
		}
	}

	public double sample() {		
		
		return ringBuff.peek();
	}

	public void tic() {
		double x = ringBuff.dequeue();
		double y = ringBuff.peek();
		ringBuff.enqueue(0.994*((x+y)/2));
		counter++;
	}
	public int time() {
		return counter;
		
	}
}
