public class Area {
    private double length;
    private double breadth;

    // Setter method to set the dimensions of the rectangle
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Getter method to calculate and return the area of the rectangle
    public double getArea() {
        return length * breadth;
    }

    // Main method to test the Area class
    public static void main(String[] args) {
        // Create an instance of the Area class
        Area rectangle = new Area();

        // Set the dimensions of the rectangle
        rectangle.setDim(5, 10);

        // Get and print the area of the rectangle
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}