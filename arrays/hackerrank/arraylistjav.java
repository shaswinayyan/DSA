package arrays.hackerrank;
import java.util.*;
public class arraylistjav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //get input from user
        int n = Integer.parseInt(sc.nextLine());

        //get integers and store them in an arraylist for multiple times

        //declare an nested arraylist of integers 
        List<List<Integer>> allInput = new ArrayList<>();

        for(int i=0; i<n; i++){
            String line = sc.nextLine();
            String[] parts = line.trim().split("\\s+");
            List<Integer> intList = new ArrayList<>();

            for(String part: parts){
                intList.add(Integer.parseInt(part));
            }
            allInput.add(intList);
        }

        int q = Integer.parseInt(sc.nextLine());

        for(int i=0; i<q ;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x>0 && x<=allInput.size()){
                List<Integer> line = allInput.get(x-1);
                if(y>0 && y<=line.size()){
                    System.out.println(line.get(y));
                } else{
                    System.out.println("ERROR!");
                }
            } else{
                System.out.println("ERROR!");
            }
        }
    }
}
