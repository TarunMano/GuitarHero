//Tarun Manoharan, Jacob Grady, Joaquin Olivo
//cs3
//ring buffe
import java.util.*;
public class RingBuffer {
		double[] list;
		int size;

		int tail;
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
		if(size >= list.length) {
			throw new IllegalStateException("Cannot add to full");
			}
		
		else 
		if(size == 0) {
			list[0] = x;
			first = 0;
			last = 1;
			size++;
		}
		else {
			list[last] = x;
			last++;
			size++;
			if(last == list.length) {
				last = 0;
			}
		}
//		System.out.println("size: " + size);
//		System.out.println("length: " + list.length);
	}
	public double peek() {
		if(size == 0){
			throw new NoSuchElementException("buffer is empty");	
			}
		return list[first];
	}
	public String toString() {
		String a = "[";
		if (size != 0) {
		if (last == 0) {
			for (int i = first; i < list.length; i++) {
				if(i == list.length - 1) {
					a = a + list[i];
				}
				else {
					a = a + list[i] + ", ";
				}
			}
		}
		else if (last < first||last==first) {
			for (int i = first; i < list.length; i++) {
				a = a + list[i] + ", ";
			}
			for (int i = 0; i < last; i++) {
				if(i == last-1) {
					a = a + list[i];
				}
				else {
					a = a + list[i] + ", ";
				}
			}
		}
		else {
			for (int i = first; i < last; i++) {
				if(i == last-1) {
					a = a + list[i];
				}
				else {
					a = a + list[i] + ", ";
				}
			}
		}
		a = a+"]";
		return a;
		}
		else {
			a = a+"]";
			return a;
		}
	}

}
