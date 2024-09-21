# Here is a Summary

### Attributes:
* x: The x-coordinate of the circle’s center.
* y: The y-coordinate of the circle’s center.
* radius: The radius of the circle (a double).

### Constructors:
* A no-argument constructor initializing x, y, and radius to 0.
* A parameterized constructor allowing initialization of x, y, and radius.

### Overridden Methods:
* hashCode(): Generates a hash code based on x, y, and radius.
* equals(): Compares this circle to another object, checking if the x, y, and radius are equal.

### Getters and Setters:
* Methods for getting and setting the x, y, and radius values.

### Other Methods:
* getArea(double radius): Returns the area of the circle based on the given radius.
* getPerimeter(double radius): Returns the perimeter (circumference) of the circle based on the given radius.
* containsPoint(double x, double y): Determines if a point (x, y) is inside the circle using the distance formula.
* containsCircle(Circle circle): Checks if another circle is completely inside this circle.
* overlapsCircle(Circle circle): Determines if this circle overlaps with another circle.
