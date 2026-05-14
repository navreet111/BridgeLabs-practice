
import java.util.*;

public class DuplicateRemoval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> lt=new ArrayList<>();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        lt.add(arr[0]);
      for(int i=1;i<n;i++){
        if(arr[i]!=arr[i-1]){
            lt.add(arr[i]);
        }
      }
      for(int i:lt){
        System.out.print(i+" ");
      }
    }
}
