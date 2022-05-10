package day54_Abstraction.Animal;

import day54_Abstraction.language.Language;

public final class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println("Parrot wobble over to the seeds");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("hello,hello");
    }

    @Override
    public void bye() {
        System.out.println("bye,bye");
    }
}
