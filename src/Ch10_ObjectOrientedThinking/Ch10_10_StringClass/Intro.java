package Ch10_ObjectOrientedThinking.Ch10_10_StringClass;

public class Intro {
    public static void main(String[] args) {
        /*
            Strings are immutable. They cannot be changed once they're created.
         */

        String s1 = "Java ";
        String s2 = "Programming";
        s1 = s1+s2; // burada s1 stringi değiştirilmemiştir. s1 ile s2 kullanılarak yeni bir string oluşturulur ve s1'e atanır.
        System.out.println("new s1: " + s1);

        String s3 = "";
        for (int i = 0; i < s1.length(); i++) {
            s3 += Character.toUpperCase(s1.charAt(i)); // daimi bir string objesi oluşturma işlemi vardır, var olanın içeriği değişmez
        }


    }
}
