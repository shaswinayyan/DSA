// package Recursion.walk;

public class main {
    public static void main(String[] args) {
        walk(100);
        
    }
    public static void walk(int steps){
        if(steps ==0){
            return;
        }
        walk(steps-1);
        System.out.printf("You're taking step %d \n", steps);
        
    }
}
