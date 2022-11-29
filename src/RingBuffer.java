
public class RingBuffer {
		double[] list;
		int size;
	public RingBuffer(int i) {
		list = new double[i];
		size = 0;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return false;
		}
		return true;
	}

	public int size() {
		return size;
	}

	public double dequeue() {
		
		
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	public void enqueue(double d) {
		// TODO Auto-generated method stub
		
	}

}
