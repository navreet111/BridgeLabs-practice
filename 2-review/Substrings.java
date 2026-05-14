import java.util.*;

public class Substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
        String res="";
        for(int j=i+1;j<str.length();j++){
                 res+=str.charAt(j);
                 System.out.println(res);
        }
    }
    }
}
