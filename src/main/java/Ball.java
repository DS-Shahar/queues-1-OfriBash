package test;

public class Ball {
	private String color;
	private boolean big;
	
	public Ball(String color, boolean big) {
		this.color = color;
		this.big = big;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isBig() {
		return big;
	}
	public void setBig(boolean big) {
		this.big = big;
	}
	
	public String toString() {
		char c = color.charAt(0);
		if(big)
			c =(char) (c - ('a' - 'A'));
		return "" +c;
	}
}
