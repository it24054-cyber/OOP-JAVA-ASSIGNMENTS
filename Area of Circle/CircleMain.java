public class CircleMain {
    public static void main(String[] args) {

        // Using constructor
        Circle c1 = new Circle(5.0);
        System.out.println("Area (using constructor): " + c1.calculateArea());

        // Using setter & getter
        Circle c2 = new Circle(0);  // temporary value
        c2.setRadius(7.5);
        System.out.println("Area (using setter): " + c2.calculateArea());
    }
}
