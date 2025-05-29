//14. Longest Common Prefix

public class longestcommonprefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        for(int i=0; i<strs[0].length();i++){
            for(String s: strs){
                if(i==s.length() || strs[0].charAt(i)!=s.charAt(i)){
                    System.out.println(s.substring(0,i));
                }
            }
        }
        System.out.println(strs[0]);
    }
}
