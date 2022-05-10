package day51_inheritance.lyft;

public class Lyft {

    String driver;
    int age;
    int id;

    public Lyft(String driver, int age, int id) {
        this.driver = driver;
        this.age = age;
        this.id = id;
    }

    public double calculateRate(int miles){
        return miles * 1.5;
    }

    @Override
    public String toString() {
        return "Lyft{" +
                "driver='" + driver + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
