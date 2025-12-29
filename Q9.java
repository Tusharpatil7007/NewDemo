import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        // int a[] = {1,5,10,20,40,80};
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(10);
        list1.add(20);
        list1.add(40);
        list1.add(80);
        // int b[] = {6, 7, 20, 80, 100};
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(20);
        list2.add(80);
        list2.add(100);
        // int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(4);
        list3.add(15);
        list3.add(20);
        list3.add(30);
        list3.add(70);
        list3.add(80);
        list3.add(120);
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : list1){
            map.put(n, 0);
        }
        Set<Integer> set = new LinkedHashSet<>();
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            for(Integer num : list3){
                if (m.getKey() == num) {
                    set.add(num);
                    
                }
            }
        }
        Set<Integer> result = new LinkedHashSet<>();
        for(int number  : list3){
            if (set.contains(number)) {
                result.add(number);
            }
        }
        System.out.println(result);
    }
}
