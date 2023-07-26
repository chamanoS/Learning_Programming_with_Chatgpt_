
abstract class Shape{

    abstract double calculateArea(); // common interface

}

class Circle extends Shape{
    private double radius;//data members

    public Circle(double radius){ //constructor
        this.radius = radius;
    }

    @override
    double calculateArea(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    private double width; //private fields
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @override
    double calculateArea(){
        return width * height;
    }
}