package zadacijavarash.uroven12zadaca7;



import java.util.ArrayList;

/*
В классе Faculty есть метод printStudentNames(ArrayList), который принимает список объектов и выводит их имена.
 Но на данный момент программа не компилируется.
Твоя задача исправить этот баг. Для этого нужно исправить сигнатуру метода printStudentNames(ArrayList),
 чтобы он принимал список объектов только типа Student(используй дженерик).
Метод main не участвует в проверке.

Требования:
•	Исправь сигнатуру метода printStudentNames, чтобы он принимал список только студентов.
•	Реализацию метода printStudentNames не изменять.
 */
public class DjenerikiIStudenti {
    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Акакий"));
        students.add(new Student("Любослав"));

        printStudentNames(students);
    }
    public static void printStudentNames(ArrayList students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));   // dobav .getname
        }
    }

//    public static void printStudentNames(ArrayList<Student> students) {
//        for (int i = 0; i < students.size(); i++) {
//            System.out.println(students.get(i).getName());
//        }
//    }
}
