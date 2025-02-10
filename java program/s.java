import java.util.*;

class s{
public static void main(String[] args){
int even_num = 0;
int sum= 0 ; 

for(int i = 0 ; i<=10; i ++ ){
if(i %2 == 0 ){
even_num += i ; 
}
else {
sum +=i ; 
}}
System.out.println("sum of even num is  "  + even_num );
System.out.println("sum of negative num is  "  + sum );
}}