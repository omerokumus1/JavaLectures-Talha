package Ch10_ObjectOrientedThinking.Ch10_5_CourseClass;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;
    private static final int CAPACITY = 10;

    public Course(){
        numberOfStudents = 0;
        students = new String[CAPACITY];
    }

    public Course(String courseName) {
        this.courseName = courseName;
        numberOfStudents = 0;
        students = new String[CAPACITY]; // lazy loading
    }

    public void addStudent(String student) {
        int index = getFirstNull();
        if (index != -1) { // kontenjan dolu değilse
            students[index] = student;
            numberOfStudents++;
        }
    }

    private int getFirstNull() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null)
                return i;
        }
        return -1;
    }

    public void dropStudent(String student) {
        int index = getIndex(student);
        if (index != -1) { // öğrenci varsa
            students[index] = null;
            numberOfStudents--;
        }
    }

    private int getIndex(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].equals(student))
                return i;
        }
        return -1;
    }


    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
