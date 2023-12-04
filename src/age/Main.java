package age;

import home.work.*;
import init.age.Person;


public class Main {
    public static void main(String[] args) {
        Person human = new Person();

        human.init("Павел", "балоболов");
        human.print();
//---------------------------------------------------------------------------------------------------------------------

        Test2 t1 = new Test2();
        Test2 t2 = new Test2(25, 48);

        System.out.println("Первое число " + t1.getFirstNumber() + " второе число " + t1.getSecondNumber());
        System.out.println("Первое число " + t2.getFirstNumber() + " второе число " + t2.getSecondNumber());
//-------------------------------------------------------------------------------------------------------------------
        Test1 try1 = new Test1();


        try1.setNumber1(20);

        try1.setNumber2(28);

        try1.printSum();

        try1.maxNum();

        try1.changeNumbers(45, 29);
        //----------------------------------------------------------------------------------------------------

        Student[] students = new Student[10];

        students[0] = new Student("Колоколов И.И.", 105, new int[]{1, 2, 1, 4, 9, 4, 2, 3,});
        students[1] = new Student("Отличников А.В.", 109, new int[]{10, 9, 9, 9, 10, 9, 10});

        System.out.println("Студенты с оценками 9 или 10:");
        for (Student student : students) {
            if (student != null) {
                student.printHighGradesInfo();
            }
        }
//----------------------------------------------------------------------------------------
        /*Train[] trains = new Train[5];

        trains[0] = new Train("Москва", 745,"19:00");
        trains[1] = new Train("Могилёв", 648,"14:45");

        System.out.println("Покзда отсартированные по номеру поезда:");
        sortByTrainNumber(trains);
        printTrains(trains);

        System.out.println("поезда отсартерованные по времени:");
        sortByDestinationAndTime(trains);
        printTrains(trains);*/

        //-----------------------------------------------------------------------------------------------
        DecimalCounter counter1 = new DecimalCounter();
        System.out.println("Текущий показатель счётчика: " + counter1.getCurrentValue());
        counter1.increment();
        counter1.increment();
        System.out.println("Показатели счётчика были увеличины на 2, текуший показатель: " + counter1.getCurrentValue());
        counter1.decrement();
        System.out.println("Показатели счётчика были уменьшены на 1, текущий показатель счётчика: " + counter1.getCurrentValue());

        DecimalCounter counter2 = new DecimalCounter(-3, 4);
        System.out.println("Текущий показатель счётчика:" + counter2.getCurrentValue());
        counter2.increment();
        counter2.increment();
        counter2.increment();
        System.out.println("Показатели счётчика были увеличины на 3, текущий показатель счётчика: " + counter2.getCurrentValue());
        counter2.increment();
        counter2.increment();
        counter2.increment();
        counter2.increment();
        counter2.increment();
        //------------------------------------------------------------------------------------------------------------------------
        Time time1 = new Time();
        System.out.println("Установеленное время: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        time1.changeMinute(25);
        time1.changeHour(12);
        time1.changeSecond(48);
        System.out.println("Изменённое время: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());

        Time time2 = new Time(27,45,39);
        System.out.println("Установленное время: " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
        //--------------------------------------------------------------------------------------------------------------------
        Triangle triangle1 = new Triangle();
        triangle1.findSquare();
        triangle1.findPerimeter();

    }
}