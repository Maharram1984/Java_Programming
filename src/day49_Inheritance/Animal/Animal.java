package day49_Inheritance.Animal;

public class Animal {

  public String name;
  public String breed;
  public String size;
  public int age;
  public String color;
  public char gender;
  public double price;


  public void sleep(){
      System.out.println(name + " is sleeping");
  }

  public String toString() {
    return "Animal{" +
            "name='" + name + '\'' +
            ", breed='" + breed + '\'' +
            ", size='" + size + '\'' +
            ", age=" + age +
            ", color='" + color + '\'' +
            ", gender=" + gender +
            ", price= $" + price +
            '}';
  }
}
