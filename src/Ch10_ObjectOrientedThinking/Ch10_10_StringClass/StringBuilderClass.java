package Ch10_ObjectOrientedThinking.Ch10_10_StringClass;

public class StringBuilderClass {
    public static void main(String[] args) {
        /*
        StringBuilder immutable değil mutable'dır. İçeriği değiştirilebilir
        Ne zaman kullanılır: Bir stringin içeriğini sürekli değiştirmek gerekiyorsa kullanılır.
         */

        String s1 = "Java ";
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            s2.append(Character.toUpperCase(s1.charAt(i))); // daimi bir string objesi oluşturma işlemi yoktur, var olanın içeriği değişir
        }

        s2.insert(2, "125");
        System.out.println(s2);

        s2.delete(2, 4);
        System.out.println(s2);

        s2.deleteCharAt(0);
        System.out.println(s2);



    }

    private String contentToUpperCase(String str){
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            str2.append(Character.toUpperCase(str.charAt(i)));
        }

        return str2.toString();
    }
}
