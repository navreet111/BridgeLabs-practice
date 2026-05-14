import java.util.*;
public class ToUppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
            ch=(char)(ch-32);
        }
        res+=ch;
    }
    System.out.println(res);
    }
}
