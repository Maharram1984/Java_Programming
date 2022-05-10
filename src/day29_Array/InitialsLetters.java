package day29_Array;

public class InitialsLetters {
    public static void main(String[] args) {
    /*  Initials
     Given an array of classmate’s names, first name and last separated by a space,
      print the initials of everyone
       Ex: Input:
      [ “James Bond”, “Eve Roll”, “Anna Johnson” ]
       Output:
      JB ER AJ   */

        String[] names = {" James Bond", "Eve Roll", "Anna Johnson","Cris Ron"};

        for (int i = 0; i < names.length; i++) {
            String fullName = names[i].trim();
            String lastName = fullName.substring(fullName.indexOf(" ") + 1);//.trim();
            System.out.println("" + fullName.charAt(0) +lastName.charAt(0)); // Without " " or Putting " " at the end got binary 140 151 139 149
        }
        System.out.println();

        for (String str : names) {
            str = str.trim();
            System.out.println(str.substring(0,1)+str.substring(str.indexOf(" ")+1).charAt(0));

            String fullName = str.trim();
            String lastName = fullName.substring(fullName.indexOf(" ") + 1);//.trim();
            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));     //in middle -->> J B
        }


    }
}
