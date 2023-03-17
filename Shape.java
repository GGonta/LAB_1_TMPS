interface Shape {
  double area();
}

class Rectangle implements Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double area() {
    return this.width * this.height;
  }
}

class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double area() {
    return 3.14 * Math.pow(this.radius, 2);
  }
}

class AreaCalculator {
  private Shape[] shapes;

  public AreaCalculator(Shape[] shapes) {
    this.shapes = shapes;
  }

  public double totalArea() {
    double total = 0;
    for (Shape shape : this.shapes) {
      total += shape.area();
    }
    return total;
  }
}

