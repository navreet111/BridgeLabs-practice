// import java.util.*;
// public class TwoSum {
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int arr[]=new int[n];

// for(int i=0;i<n;i++){
// arr[i]=sc.nextInt();
// }

// int target=sc.nextInt();
// int res=twoSum(arr,n,target);
// System.out.println(res);
// }
// public static int twoSum(int [] arr,int n,int target){
//     int count=0;
// HashMap<Integer,Integer> m=new HashMap<>();
// for(int i:arr){
// if(m.containsKey(target-i)){
// count++;
// }
// else{
// m.put(i,m.getOrDefault(i,0)+1);
// }
// }
// return count;


// }
// }
import java.util.*;

class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

         twoSum(arr, target);

    
    }

    public static void twoSum(int[] arr, int target) {

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] + arr[j] == target) {
                    System.out.print(arr[i]+" "+arr[j]);
                }
            }
        }

        
    }
}