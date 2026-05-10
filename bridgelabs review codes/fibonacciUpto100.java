import java.util.*;
class fibonacciUpto100 {
public static void main(String[] args){

int a=0;
int b=1;
while(a<=100){
System.out.print(a+" ");
int c=a+b;
a=b;
b=c;
}
}

}
