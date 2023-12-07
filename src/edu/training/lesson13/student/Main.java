package edu.training.lesson13.student;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
         students[0] = new Student("Соколов В.А.", 105, new int[]{9, 9, 9, 10, 9,});
         students[1] = new Student("Васькин И.К.", 106, new int[]{9, 10, 9, 9, 10});
         students[2] = new Student("Черёткин Г.В.", 106, new int[]{7, 8, 5, 1, 8});
         students[3] = new Student("Игорчик Д.Г", 105, new int[]{6, 10, 5, 9, 7});
         students[4] = new Student("Шалыжин Л.А.", 105, new int[]{9, 5, 9, 8, 7});

        for (Student student: students){
            student.printHighGradesInfo();
        }

    }
}
