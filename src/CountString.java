import java.util.ArrayList;
import java.util.List;

public class CountString {
     public static void main(String[] args) {
         int count = 0;
         List<String> list = new ArrayList<>();
         list.add("a");
         list.add("abc");
         list.add("abcd");
         list.add("abdee");
         list.add("abdf");
         list.forEach(str ->{
             str.toCharArray();
             System.out.println(str.toCharArray());
         });


    }
}
