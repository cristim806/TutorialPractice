public class Person {

    private String name;
    private String address;
    private int age;
    public Person() {
        this("Jarvis", "Palo Alto", 35);
    }
    public Person(String name, String address, int age) {
        setData(name, address, age);
    }
    public void setData(String name, String address,  int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public void showEmployeeDetail() {
        System.out.println("Name = " + name + ", Address = " + address + ", Age = " + age);
    }
    public static void main(String... args) {
        Person e = new Person();
        e.showEmployeeDetail();
    }
}
