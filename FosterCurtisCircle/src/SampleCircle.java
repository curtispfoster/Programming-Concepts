public class SampleCircle {

	public static void main(String[] args) {
		
		//Testing hard code
		int pointX = 3, pointY = 3;
		
		Circle c1 = new Circle(2, 2, 5.5);
		
		System.out.println("Area of the Circle is: " + c1.getArea(c1.getRadius()));
		System.out.println("Perimeter of the Circle is: " + c1.getPerimeter(c1.getRadius())+ "\n");
		
		System.out.println("The Circle contains a point inside of circle: " + c1.containsPoint(pointX, pointY));
		System.out.println("The Circle contains another circle inside: " + c1.containsCircle(new Circle(4, 5, 10.5)));
		System.out.println("The Circle overlaps the circle: " + c1.overlapsCircle(new Circle(3, 4, 2.3)));

	}

}
