package java;

public class EVENorODD{
public Boolean isEven(int num){
if(num%2==0){
return true;
}
else 
return false;
}
public static void main (String[]args){

EVENorODD s=new EVENorODD();
Boolean result=s.isEven(35);
if(result){
System.out.println("Even");
}
else
System.out.println("Odd");
}
}