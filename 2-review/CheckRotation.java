import java.util.*;
public class CheckRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(str1.length()!=str2.length()){
            System.out.println("No");
        }
       else{
        String res=str1+str1;
        if(res.contains(str2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        }
       }
    }

