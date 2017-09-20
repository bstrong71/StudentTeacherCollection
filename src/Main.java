import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> allStudents = new ArrayList<>();

        Student newStudent1 = new Student("Adam", "Baker", 100, 1);
        allStudents.add(newStudent1);
        Student newStudent2 = new Student("Eve", "Jones", 101, 1);
        allStudents.add(newStudent2);
        Student newStudent3 = new Student("Joe", "Blake", 102, 1);
        allStudents.add(newStudent3);
        Student newStudent4 = new Student("John", "Smith", 103, 1);
        allStudents.add(newStudent4);
        Student newStudent5 = new Student("Sara", "Lipscomb", 104, 1);
        allStudents.add(newStudent5);
        Student newStudent6 = new Student("Amy", "Lawrence", 105, 1);
        allStudents.add(newStudent6);
        Student newStudent7 = new Student("Tony", "Brown", 106, 1);
        allStudents.add(newStudent7);
        Student newStudent8 = new Student("Jeff", "Taggert", 107, 1);
        allStudents.add(newStudent8);
        Student newStudent9 = new Student("Julie", "Johnson", 108, 1);
        allStudents.add(newStudent9);
        Student newStudent10 = new Student("Michelle", "Allen", 109, 1);
        allStudents.add(newStudent10);
        Student newStudent11 = new Student("Willy", "Clinton", 110, 1);
        allStudents.add(newStudent11);
        Student newStudent12 = new Student("George", "Bush", 111, 1);
        allStudents.add(newStudent12);
        Student newStudent13 = new Student("Pam", "Dawber", 112, 1);
        allStudents.add(newStudent13);
        Student newStudent14 = new Student("Lisa", "Stephens", 113, 1);
        allStudents.add(newStudent14);
        Student newStudent15 = new Student("James", "Walters", 114, 1);
        allStudents.add(newStudent15);

        ArrayList<Teacher> allTeachers = new ArrayList<>();

        Teacher newTeacher1 = new Teacher("Bob", "Thomas", 120, 1);
        allTeachers.add(newTeacher1);
        Teacher newTeacher2 = new Teacher("Linda", "James", 121, 1);
        allTeachers.add(newTeacher2);
        Teacher newTeacher3 = new Teacher("Joe", "Terry", 122, 1);
        allTeachers.add(newTeacher3);

        Set<Student> studentSet1 = new HashSet<>();
        studentSet1.add(newStudent1);
        studentSet1.add(newStudent2);
        studentSet1.add(newStudent3);
        studentSet1.add(newStudent4);
        studentSet1.add(newStudent5);

        Set<Student> studentSet2 = new HashSet<>();
        studentSet2.add(newStudent6);
        studentSet2.add(newStudent7);
        studentSet2.add(newStudent8);
        studentSet2.add(newStudent9);
        studentSet2.add(newStudent10);

        Set<Student> studentSet3 = new HashSet<>();
        studentSet3.add(newStudent11);
        studentSet3.add(newStudent12);
        studentSet3.add(newStudent13);
        studentSet3.add(newStudent14);
        studentSet3.add(newStudent15);

        Map<Teacher, Set<Student>> classrooms = new HashMap<>();
        classrooms.put(newTeacher1, studentSet1);
        classrooms.put(newTeacher2, studentSet2);
        classrooms.put(newTeacher3, studentSet3);

        System.out.println("Teacher List: ");
        for(Teacher teacher: classrooms.keySet()) {
            System.out.println(teacher);
        }

        System.out.println("Student List: ");
        for(Set<Student> student: classrooms.values()) {
            System.out.println(student);
        }

        System.out.println("All Map Entries: ");
        for(Map.Entry<Teacher, Set<Student>> each: classrooms.entrySet()) {
            System.out.println(each);
        }
    }
}
