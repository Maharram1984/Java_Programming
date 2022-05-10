package day25_loops;

public class GreatingID {
    public static void main(String[] args) {
        /*
        Given a first name and last name create and return an id using the following format:
	the first letter of the first name as lowercase,
	the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
	the length of the first String multiplied by 2
	first name: john
	last name: smith
	id: jSmi8 */
      String firstName = "maharram";
      String lastName = "rafiyev";

      String id = firstName.substring(0,1).toUpperCase().trim();
      id += lastName.substring(0,1).toUpperCase() + lastName.substring(1,7).toLowerCase().trim();
      id +=firstName.length() * 10 + 4;

        System.out.println(id + "@gmail.com");













    }
}
