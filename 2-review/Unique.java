
import java.util.*;
public class Unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(unique(str));
    }
    public static boolean unique(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
            if(str.charAt(j)==str.charAt(i)){
                return false;
            }
        }
        }
            return true;
        
    }
}
