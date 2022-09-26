import java.util.Scanner;

public class Cylinder {
    private int radius;
    private int height;
    //using constructor

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
// using getters and setters
//    public void setHeight(int height) {
//        this.height = height;
//    }

//    public int getHeight() {
//        return height;
//    }

//    public void setRadius(int radius) {
//        this.radius = radius;
//    }

//    public int getRadius() {
//        return radius;
//    }
//      One Type by passing parameters
//    public void surfaceArea(int radius,int height){
//        double a = 2*Math.PI*radius*height+2*Math.PI*(radius*radius);
//        System.out.println("Surface Area of Cylinder = "+a);
//    }
//
//    public void volume(int radius,int height){
//        double b = Math.PI*(radius*radius)*height;
//        System.out.println("Volume of Cylinder = "+b);
//    }
    //2nd Type  without passing parameters
    public double surfaceArea(){
        return 2*Math.PI*radius*height+2*Math.PI*(radius*radius);
    }

    public double volume(){
        return Math.PI*(radius*radius)*height;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(14,10);
//        Scanner setRad =new Scanner(System.in);
//        Scanner setHht =new Scanner(System.in);

//        cylinder.setHeight(10);
//        cylinder.setRadius(14);

//        System.out.println("Height:"+cylinder.getHeight()+"\n"+"Radius:"+cylinder.getRadius());


        //  One Type
        //        cylinder.surfaceArea(cylinder.getRadius(),cylinder.getHeight());
        //        cylinder.volume(cylinder.getRadius(),cylinder.getHeight());

        //    2nd Type
        // 3rd Type using constructor
        System.out.println("Height:"+cylinder.height+"\n"+"Radius:"+cylinder.radius);
        System.out.println("Surface Area of Cylinder = "+cylinder.surfaceArea());
        System.out.println("Volume of Cylinder = "+cylinder.volume());
    }

}
