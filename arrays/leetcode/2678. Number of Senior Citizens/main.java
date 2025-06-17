

public class main {
public static void main(String[] args) {
    String[] details ={"7868190130M7522","5303914400F9211","9273338290F4010"};
    int res=0;
    for(String det: details){
        if (Integer.parseInt(det.substring(11, 13))>60) {
            res+=1;
        }
    }
    System.out.println(res);
}    
}
