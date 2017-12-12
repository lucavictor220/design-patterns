/**
 * Created by vitiok on 12/12/17.
 */
public class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void show() {
        System.out.println("My name is: " + name + ". I'm " + age + " age old.");
    }
}
