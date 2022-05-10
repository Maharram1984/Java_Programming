package day_23;

    /*
    Final Class can not be INHERITED
     */
    public  class Parent {

    /*
    final : non-access modifier / keyword
    final variables : After it has a value , it is not possbile to change it
    final methods   : To prevent OVERRIDING
    final classes   : To prevent INHERITANCE
    variables :
        - if the variable is final , we CAN NOT MODIFY IT
        - When variable is final we need to initialize them
                - Constr
                - Same statement
        if final variable is STATIC they are called as CONSTANTS.
                - Integer.MAX_VALUE;
        Question : Can we create SETTER methods for final variables ?
                   If variables is FINAL you can not use SETTER.(READ-ONLY)
     methods : A final method can not be override
     classes : A final class can not be extended
     */

        public final String password="123";
        public final String username;

        public final static String COMPANY="Cydeo";



        public Parent(String username) {
            this.username = username;
        }

        public final void finalMethod(){

            System.out.println("Final Method");

        }
}
