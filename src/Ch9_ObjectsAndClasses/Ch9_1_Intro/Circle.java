package Ch9_ObjectsAndClasses.Ch9_1_Intro;

public class Circle {
    // Data field -> properties
    int radius;
    String lineColor;
    int lineWidth;

    /*
         Constructor: özel bir methoddur. diğer methodlardan farkı obje oluşturma işini yapar.
                methodun ismi class yine aynıdır. return değeri yazılmaz, void vs içermez

                - Bir class birden fazla constructora sahip olabilir -> constructor overloading (method overloading'in aynısı)

                - no-arg constructor: arguman almayan constructor'dır
                - default constructor: Eğer elle hiçbir constructor yazılmamışsa, java otomatik olarak no-arg constructor oluşturur.
                                    Eğer en az 1 tane constructor yazılmışsa, no-arg constructor silinir.
     */
    // no-arg constructor
    Circle(){
        radius = 1;
        lineColor = "Black";
        lineWidth = 1;
    }
    // bir class birden fazla constructora sahip olabilir
    Circle(int circleRadius){
        radius = circleRadius;
    }

    Circle(int circleRadius, String circleLineColor, int circleLineWidth){
        radius = circleRadius;
        lineColor = circleLineColor;
        lineWidth = circleLineWidth;
    }


    // Behaviors -> bildiğimiz method yazmaktır
    public void introduce(){
        System.out.println("Circle: ");
        System.out.println("\tradius: " + radius);
        System.out.println("\tline color: " + lineColor);
        System.out.println("\tline width: " + lineWidth);
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }








}
