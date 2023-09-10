package c;


/*
 * https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 */

public class Square implements Shape {
	
	double side;
	
	public Square() { }
	
	public Square(double s) {
		side = s;
	}
	
	@Override
	public double area() {
		return side*side;
	}
	
	public void setSide(double s) {
		side = s;
	}
	
	public double getSide() {
		return side;
	}
}
