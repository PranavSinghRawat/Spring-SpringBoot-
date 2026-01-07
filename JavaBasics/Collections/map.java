package JavaBasics.Collections;
import java.util.*;
public class map {
    public static void main(String[] args){
        Map<String,Integer> num= new HashMap<String,Integer>();
        num.put("one",1);
        num.put("two",2);
        num.put("three",3);
        System.out.println(num.keySet());
        for(String name:num.keySet()){
            System.out.println(name+" "+num.get(name));
        }
    }
}
