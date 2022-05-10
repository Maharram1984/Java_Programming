package day38_Arraylist;

public class HTML_Generation {
    /*HTML Generator
      Given a String in the following format take the number part of the
      generator the html tags. Tags are surrounded with diamond brackets.
      The number of times to repeat with be given as the number after the ^
      Input:
               div^2
           Output:
               <div></div> <div></div>
       Input:
               li^3
           Output:
               <li></li><li></li><li></li>  */
    public static void main(String[] args) {
        System.out.println(htmlGenerate("li^3"));
        System.out.println(htmlGenerate("div^6"));
        System.out.println(htmlGenerate("ul^4"));
    }

    // String str = div^6
    public static String htmlGenerate(String str) {
        String html = "";
        String[] s = str.replace("^", " ").split(" ");  //str.split("\\^");
        int num = Integer.parseInt(s[1]);

        for (int i = 0; i < num; i++) {

            html += "<" +s[0]+ "></" +s[0]+ "> ";
        }
        return html;
    }

    // to use repeat method
    // html =   html += "<" + parts[0] + "></" + parts[0] + "> ";
    // html.repeat(3)


    /*  instead of split, using other String methods

        String word = str.substring(0, str.indexOf("^");// == parts[0]
        String number = str.substring(str.indexOf("^") + 1) == parts[1]

     */


}
