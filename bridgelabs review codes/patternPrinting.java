import java.util.*;
class patternPrinting{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
pattern(n);
}
public static void pattern(int n){
for(int i=1;i<=n;i++){
for(int j=n-1;j>=i;j--){
System.out.print(" ");
}
int a=1;
for(int k=1;k<=i;k++){
System.out.print(a);
a++;
}
int b=i-1;
for(int j=1;j<=i-1;j++){
System.out.print(b);
b--;
}
System.out.println();
}
}
}

