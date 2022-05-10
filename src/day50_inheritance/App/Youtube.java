package day50_inheritance.App;

public class Youtube extends App {
/*  - Create a class YouTube
    - YouTube class inherits App class
    - create constructor to call parent constructor and set up variables (name and version)
    - create method: -->> watchVideo()
    - Example output: prints Watching java tutorial */

    public Youtube(String youTube, double version) {
        super("YouTube", version);
    }
    public void watchVideo(){
        System.out.println("Watching java tutorial....");
    }
}
