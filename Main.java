public class Main {

  public static void main(String[] args) {
    Shape[] shapes = {new Rectangle(10, 1), new Circle(5)};
    AreaCalculator calculator = new AreaCalculator(shapes);
    System.out.println("Rezultatul este: "+calculator.totalArea());
  }
}
