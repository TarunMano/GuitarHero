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
		for(int i = 0; i < ringBuff.size()+1; i++) {
			ringBuff.dequeue();
			ringBuff.enqueue(Math.random()*1 - .5);
		}
		System.out.println("pluck");
	}

	public double sample() {		
		if (ringBuff.size() > 0) {
			return ringBuff.peek();
		}
		else {
			return 0;
		}
	}

	public void tic() {
		if (ringBuff.size() > 0) {
		double x = ringBuff.dequeue();
		double y = ringBuff.peek();
		ringBuff.enqueue(0.994*((x+y)/2));
		counter++;
		}
	}
	public int time() {
		return counter;
		
	}
}
