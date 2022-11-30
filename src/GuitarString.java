
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
		//
	}


	public void pluck() {
		
	}

	public double sample() {		
	return 0;
	}

	public void tic() {
		
	}
	public int time() {
		return 0;
		
	}
}
