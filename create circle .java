public class Circle {
    private double radius;   // private variable

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
