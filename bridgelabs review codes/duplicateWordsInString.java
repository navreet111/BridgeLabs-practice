import java.util.*;
class duplicateWordsInString{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);

String str=sc.nextLine();
str=str.toLowerCase();
String[] string=str.split(" " );

for(int i=0;i<string.length;i++){
int count=1;
for(int j=i+1;j<string.length;j++){
if(string[i].equals(string[j])){
count++;
string[j]="0";
}
if(count>1 && string[i]!="0"){
System.out.print(string[i]+" ");
}
}
}
}
}