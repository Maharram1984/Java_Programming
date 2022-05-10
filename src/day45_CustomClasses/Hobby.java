package day45_CustomClasses;

public class Hobby {
    // DATA --->> name, annual cost, is outdoors (boolean), requires others (boolean)

    String name;
    int annualCost;
    boolean isOutDoor;
    boolean requiresOthers;

    // - create a constructor that creates a Hobby object with the name
    public Hobby(String name) {
        this.name = name;
    }

    // - create a constructor that creates a Hobby object with the name and annual cost
    public Hobby(String name, int annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    // - create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others
    public Hobby(String name, int annualCost, boolean isOutDoor, boolean requiresOthers) {
        this(name, annualCost);
        this.isOutDoor = isOutDoor;
        this.requiresOthers = requiresOthers;
    }

    public void doIt() {
    // - print: Doing $name-of-hobby $outside-or-inside
        System.out.println("Doing: " +name+ (isOutDoor ? " outside" : " inside"));
    }

      public String toString() {
        return "\nHobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutDoor=" + isOutDoor +
                ", requiresOthers=" + requiresOthers +
                '}';
    }
}
