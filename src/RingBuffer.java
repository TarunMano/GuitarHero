import java.util.*;
public class RingBuffer {
		double[] list;
		int size;
		int first;
		int last;
	public RingBuffer(int capacity) {
		list = new double[capacity];
		size = 0;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}

	public double dequeue() {
		if(size == 0){
		throw new NoSuchElementException("buffer is empty");	
		}
		else if(size > 0) {
			double a = list[first];
			list[first] = 0;
			size--;
			first++;
			if(first == list.length) {
				first = 0;
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
		if(size == list.length) {
			throw new IllegalStateException("Cannot add to full");
			}
		else if(size == 0) {
			list[0] = x;
			first = 0;
			last = 1;
			size++;
		}
		else {
			size++;
			list[last] = x;
			last++;
			if(last == list.length) {
				last = 0;
			}
		}

	}
	public double peek() {
		return 0;
		
	}
	public String toString() {
		return "hi";
		
	}

}
