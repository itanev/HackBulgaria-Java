package ex3Pairs;

public class Pair {
	private int first;
	private int second;
	
	public Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	public int getFirst() {
		return this.first;
	}
	
	public void setFirst(int val) {
		this.first = val;
	}
	
	public void setSecond(int val) {
		this.second = val;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d)", this.first, this.second);
	}
	
	public boolean equals(Pair pair) {
		return this.first == pair.getFirst() &&
			   this.second == pair.getSecond();
	}
}
