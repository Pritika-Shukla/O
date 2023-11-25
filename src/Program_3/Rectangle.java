package Program_3;


//3. Write a Java program to create a class called "Rectangle" with width and height attributes.
// Calculate the area and perimeter of the rectangle.

public class Rectangle {
    double width;
    double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public double per() {
        return 2 * (width + height);
    }
    public double area(){
        return  width*height;
    }
}