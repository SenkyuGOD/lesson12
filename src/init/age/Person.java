package init.age;

public class Person {
    private  String name;
    private  String surname;



    public void init(String _name, String _surname) {
        name = _name;

        surname = _surname;
    }

    public void print() {
        System.out.println("Имя = " +name);
        System.out.println("Фамилия = " + surname);
    }
}
