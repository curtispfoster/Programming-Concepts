import java.util.Objects;
import java.lang.Math;
public class Circle {
	int x;
	int y;
	double radius;
	
	Circle(){
		this.x = 0;
		this.y = 0;
		this.radius = 0;
	}
	Circle(int x, int y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}


	@Override
	public int hashCode() {
		return Objects.hash(radius, x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return Double.doubleToLongBits(radius) == Double.doubleToLongBits(other.radius)
				&& Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}

	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea(double radius) {
		return Math.PI * (radius * radius);
	}
	
	public double getPerimeter(double radius) {
		return 2 * Math.PI * radius;
	}
	public boolean containsPoint(double x, double y) {
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return distance <= radius;	
	}
	
	public boolean containsCircle(Circle circle) {
		double distance = Math.sqrt(Math.pow(circle.getRadius(), 2) + Math.pow(this.radius - circle.getRadius(), 2));
		return distance < this.radius;
	}
	
	public boolean overlapsCircle(Circle circle) {
		double distance = Math.sqrt(Math.pow(circle.getRadius(), 2) + Math.pow(this.radius, 2));
		return distance < this.radius + circle.getRadius();
	}
}
