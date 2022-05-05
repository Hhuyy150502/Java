public class Circle {
    // private instance variables
    private double radius;
    private String color;

    // constructors
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Construced a circle wwith circle()");
    }
    public Circle(double radius){
        this.radius = radius;
        this.color = "red";
        System.out.println("construced a circle wwith cirle wwith cricle(radius, color)");
    }
    // public getters and setter for the private variables
    public double getRadius(){
        return radius;
    }
    /** Return a self-descriptive String */
    public String toString(){
        return "Circle[radius="+ radius + ",color=" + color +"]";
    }
    /** returns the area of this circle*/
    public double getArea(){
        return radius * radius * Math.PI;
    }

    public String getColor() {
        return color;
    }
}