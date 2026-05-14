import java.util.*;
public class MergeArray {
   public static void main(String[] args) {
    int [] arr1={1,2,3};
    int [] arr2={4,5,6};
    int [] mer=new int[arr1.length+arr2.length];
    int idx=0;
    for(int i=0;i<arr1.length;i++){
        mer[idx++]=arr1[i];
    }
    for(int i=0;i<arr2.length;i++){
        mer[idx++]=arr2[i];
    }
    for(int i=0;i<mer.length;i++){
        System.out.print(mer[i]+ " ");
    }
   } 
}
