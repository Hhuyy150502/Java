public class Cylinder  extends Circle {
    private double height;
    public Cylinder(){
        super();
        this.height =1.0;
        System.out.printf("Contrusted a Cylinder with Cyinder ()");
    }
    public  Cylinder(double height){
        super();
        this.height = height;
        System.out.println("Contrusted a Cylinder with Cylinder(height)");
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
        System.out.printf("Construsted a Cylinder with Cylinder(height,");
    }
    public void setHeight(){
        this.height = height;
    }
    public double getVolume(){
        return getRadius()*height;
    }
    public double getHeight() {
        return height;
    }

    public String toString(){
        return  "This is a Cylinder";
    }
}
