package JavaBasics.Collections;
import java.util.*;
public class arraylist {
    public static void main(String[] args){
        Collection<Integer> num= new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        List<Integer> nums= new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(nums.indexOf(4));
        System.out.println(nums.get(2));
        for(int n:num){
            System.out.println(n);
        }
    }
}
