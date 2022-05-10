package day51_inheritance.lyft;

public class LyftXL extends Lyft{


    public LyftXL() {
        super("John",48,456123);
    }

    @Override
    public double calculateRate(int miles) {
        return super.calculateRate(miles) * 2;
    }
    // super.calculateRate() calls the method in the Lyft class, parent class, then we multiply 1.1 to that result


    @Override
    public String toString() {
        return "LyftXL{" +
                "driver='" + driver + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
