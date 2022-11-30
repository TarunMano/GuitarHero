import java.util.Random;

public class GuitarString {
	public RingBuffer buffer;
	public int counter; 
	public double frequency;
    public double N;
    public int sampleRate = 44100; 
    
    
	public GuitarString(double frequency) {
		N = sampleRate/frequency;
		N = Math.ceil(N);
		buffer = new RingBuffer((int) N);
		for(int i = 0;i < N; i++) {
			buffer.enqueue(0);
		}
	}
	public GuitarString(double[] init) {
		buffer = new RingBuffer(init.length);
		for(int i = 0; i < init.length;i++) {
			buffer.enqueue(init[i]);
		}
	}


	public void pluck() {
		for(int i = 0; i < N; i++) {
			Random rand = new Random();
			double r = rand.nextDouble(0.5 - -0.5) + -0.5;
			buffer.enqueue(r);
		}
	}

	public double sample() {		
		
		return buffer.peek();
	}

	public void tic() {
		double x = buffer.dequeue();
		double y = buffer.dequeue();
		buffer.enqueue(0.994*((x+y)/2));
		counter++;
	}
	public int time() {
		return counter;
		
	}
}
