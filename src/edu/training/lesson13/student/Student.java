package edu.training.lesson13.student;

public class Student {
    private String initials;
    private int numOfGroup;
    private int[] grade = new int[5];

    public Student(String initials, int numOfGroup, int[] grade) {
        setInitials(initials);
        setNumOfGroup(numOfGroup);
        setGrade(grade);

    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getNumOfGroup() {
        return numOfGroup;
    }

    public void setNumOfGroup(int numOfGroup) {
        this.numOfGroup = numOfGroup;
    }

    public int[] getGrade() {
        return grade;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
    }

    public boolean hasHighGrades() {
        for (int grade : getGrade()) {
            if (grade != 9 && grade != 10) {
                return false;
            }
        }
        return true;
    }

    public void printHighGradesInfo() {
        if (hasHighGrades()) {
            System.out.print("Фамилия: " + getInitials() + " группа: " + getNumOfGroup() + " успеваемость: ");
            for (int grade: getGrade()) {
                System.out.print(grade + " ");
            }
            System.out.println();
        }
    }
}
