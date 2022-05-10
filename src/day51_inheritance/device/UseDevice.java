package day51_inheritance.device;

public class UseDevice {
    /*  Create a class UseDevice
        create an object of TV and Phone and
        verify if constructor, toString(), and useDevice()
        are working properly for each class
     	List is a relations of all the classes   */
    public static void main(String[] args) {

        TV obj1 = new TV("Samsung","Q-65",1200,false);
        System.out.println(obj1);
        System.out.println(obj1.useDevice());

        Phone obj2 = new Phone("Apple","ProMax",1199,true);
        System.out.println(obj2);
        System.out.println(obj2.useDevice());












    }



}
