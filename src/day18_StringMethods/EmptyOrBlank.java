package day18_StringMethods;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "last example";                    //.isEmpty and .isBlank returns to boolean.....
        System.out.println(str.isEmpty());  //false -->> because it is full

        str = "";
        System.out.println(str.isEmpty());   //true -->>  because empty

        str = "   ";
        System.out.println("str is empty: " + str.isEmpty());   // false -->> because space is there, space is character
        System.out.println("str is blank: " + str.isBlank());   // if white characters -->>true
















        if(str.length() == 0){
            System.out.println("empty");
        }else {
            System.out.println("Full");
        }


















    }
}
