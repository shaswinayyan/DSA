

public class main {
    public static void main(String[] args) {
        
        String s = "   fly me    to  the moon";
        int n = s.length();
        int lettercount =0;
        int i = n -1;
        while(s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            i--;
            lettercount++;
        }

        System.out.println(lettercount);
        
    }    
}
