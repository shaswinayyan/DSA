
import java.util.*;


public class hashsetjav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        sc.nextLine();
        
        HashSet<String> str = new HashSet<>();
        
        for(int i=0; i<num; i++){
            String s = sc.nextLine();
            str.add(s);
            System.out.println(str.size());
        }
        sc.close();


    }
}
