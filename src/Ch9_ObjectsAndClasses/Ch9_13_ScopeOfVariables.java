package Ch9_ObjectsAndClasses;

public class Ch9_13_ScopeOfVariables {
    /*
        Scope: Değişkenin tanımlı olduğu (declare edildiği) en küçük blok (süslü parantezler)
            Örn; if bloğu, döngü blokları, method bloğu, global blok (class bloğu)

            - Class bloğu içerisinde tanımlanan değişkenlere global değişken, class' variable, veya properties denir

        Shadowing: method parametresinin veya local değişkenin global değişkeni bloklaması. Method parametresi
                ile global parametre aynı isimde olunca gerçekleşir
     */

    // global değişken
    private int id;


    // Shadowing örnek 1 - Parametre vs Global değişken
    private void dummy(int id){
        id = 6; // id parametresi global değişken olan id değişkenine erişimi bloklar çünkü ikisi aynı isimdeler
    }

    // Shadowing örnek 2 - Local değişken vs Global değişken
    private void dummy2(){
        int id;
        id = 9; // id local değişkeni global değişken olan id değişkenine erişimi bloklar çünkü ikisi aynı isimdeler
    }




}
