
import java.util.Arrays;

class StringFunc {

    public static void main(String[] args) {
        String str = "ishuchanuha";
//         direct loop is not allowed ;
//  System.out.println(str);

// method used the charAt() or convert the string into toCharArray()
        String s = "ishuchauhan";

        char[] chars1 = s.toCharArray();
        char[] chars2 = str.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        System.out.println(chars1);
        System.out.println(chars2);

        // String ns = new String(chars1);
        // String news = new String(chars2);
        String ns = String.valueOf(chars1);
        String news = String.valueOf(chars2);

        System.out.println("new string");

        System.out.println(ns);
        System.out.println(news);

        //it shows that new string object of same string is not equal
        // because it store in the new heap memory and allocated new memory
        // but it shows that "==" check the same memory allocation insteadof the same words in it
        // but if use the ".equals " method then it will compare the string
        if (ns.equals(news)) {

            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
        // if (ns == news) {

        //     System.out.println("equals");
        // } else {
        //     System.out.println("not equals");
        // }

    }
}
