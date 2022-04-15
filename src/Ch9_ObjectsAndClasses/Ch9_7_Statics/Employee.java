package Ch9_ObjectsAndClasses.Ch9_7_Statics;

public class Employee {
    String name, surname;
    int age, experience;

    static int numberOfEmployees = 0;

    Employee(String empName, String empSurname, int empAge, int empExperience) {
        name = empName;
        surname = empSurname;
        age = empAge;
        experience = empExperience;
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {
        System.out.println("There are " + numberOfEmployees + " employees.");
    }

    public void introduce(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + experience);
    }

    public static void introduce(Employee e){
        System.out.println("Name: " + e.name);
        System.out.println("Surname: " + e.surname);
        System.out.println("Age: " + e.age);
        System.out.println("Experience: " + e.experience);
    }

    public static boolean isSenior(Employee e){
        return e.experience > 10;
    }

}
