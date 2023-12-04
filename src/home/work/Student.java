package home.work;

public class Student {
    private String name;
    private int groupNumber;
    private int[] grades;

    public Student(String name, int groupNumber, int[] grades) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getGrades() {
        return grades;
    }


    public boolean hasHighGrades() {
        for (int grade : grades) {
            if (grade != 9 && grade != 10) {
                return false;
            }
        }
        return true;
    }

    public void printHighGradesInfo() {
        if (hasHighGrades()) {
            System.out.println("Фамилия: " + getName() + ", Группа: " + getGroupNumber());
        }
    }
}
