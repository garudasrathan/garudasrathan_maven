import java.util.*;
interface Milkybar{  
void print();  
}  
interface Twix{  
void print1();  
} 
interface KajuBarfi{  
void print2();  
}
interface Gilebi{  
void print3();  
}
class Sweets implements Milkybar,Twix,KajuBarfi,Gilebi{
public void print(){System.out.println("Milkybar");}  
 public void print1(){System.out.println("Twix");}  
 public void print2(){System.out.println("KajuBarfi");}  
public void print3(){System.out.println("Gilebi");}  
 public static void main(String args[]){
Scanner v=new Scanner(System.in) ;
int c=0;
System.out.println("CHOOSE ANY ITEM:\n1.Milkybar\n2.Twix\n3.KajuBarfi\n4.Gilebi");
while(true)
{
Sweets obj = new Sweets();  
int b=v.nextInt();
if (b==5)
break;
switch(b)
{
case 1:
obj.print();
c++;
break;
case 2:
obj.print1();
c++;
break;
case 3:
obj.print2();
c++;
break;
case 4:
obj.print3();
c++;
break;
}
}  
System.out.println("\nTotal Gifts Count :"+c);
 }  
}  