import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        // String s = "java is easy and java is powerful";
        String[] str = s.split(" ");
        Map<String,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length;i++){
            map.put(str[i],map.getOrDefault(str[i], 0)+1);
        }
        
        for(Map.Entry<String,Integer> m : map.entrySet()){
            System.out.println(m.getKey()+" \t"+m.getValue());
        }
    }
} 
