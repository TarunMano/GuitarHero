
public class RingBuffer {
		double[] list;
		int size;

	public RingBuffer(int capacity) {
		list = new double[capacity];
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
		return 0;
		
	}

	public boolean isFull() {
		return false;
	}

	public void enqueue(double x) {
		
	}
	public double peek() {
		return 0;
		
	}
	public String toString() {
		return null;
		
	}

}
