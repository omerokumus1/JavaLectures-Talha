package Ch9_ObjectsAndClasses.Ch9_9_DataFieldEncapsulation;

public class Triangle {
    // Data field encapsulation: property'lerin hepsi private
    double a;
    private double b;
    private double c;

    Triangle(double s1, double s2, double s3){
        a = s1;
        b = s2;
        c = s3;
    }

    // Getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Setters
    public void setA(double newValue) {
        a = newValue;
    }

    public void setB(double newValue) {
        if (newValue > 0)  // -> bu sayede her türlü değerin b'ye atanması engellenir. Sadece izin verilen değerler atanır
            b = newValue;
        else
            System.out.println(newValue + " is not allowed.");
    }

    public void setC(double newValue) {
        c = newValue;
    }
}
