import java.util.*;
class j{
public static void main(String[] args){

Scanner obj = new Scanner(System.in);
double year = obj.nextDouble();

boolean is_year = false; 
if(year % 4 == 0 && year % 100 == 0  && year % 400 == 0 ){
is_year = true;
} 
else {
is_year = false ; 
}

if(!is_year){
System.out.println(is_year+": non leap year");
}
else {
System.out.println(is_year + ":  leap year ");
}

}}