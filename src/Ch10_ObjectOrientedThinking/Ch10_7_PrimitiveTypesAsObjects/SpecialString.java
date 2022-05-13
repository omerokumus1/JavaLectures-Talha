package Ch10_ObjectOrientedThinking.Ch10_7_PrimitiveTypesAsObjects;

public class SpecialString {
    private String str;
    private char UNSUPPORTED_CHAR = '*';
    public SpecialString(String str) {
        this.str = formatString(str);
    }

    private String formatString(String str){
        // * karakteri bulunup silindi
        return str; // omerokumus* -> omerokumus
    }

    public String getStr() {
        return str;
    }
}
