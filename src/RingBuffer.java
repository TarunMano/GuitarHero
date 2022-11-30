import java.util.*;
public class RingBuffer {
		double[] list;
		int size;
		int head;
		int tail;
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
		if(size > 0) {
			double a = list[head];
			list[head] = 0;
			size--;
			head++;
			if(head == list.length) {
				head = 0;
			}
			return a;
		}
		return 0;
		
	}

	public boolean isFull() {
		if(size == list.length) {
			return true;
		}
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
