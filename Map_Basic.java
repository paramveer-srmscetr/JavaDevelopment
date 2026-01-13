/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
   
     Scanner sc= new Scanner(System.in);	
   int t=sc.nextInt();
   
   // ar1=[1,2,3]   ar2=[2,3,4] ar3=[3,4,5]
       HashMap<Integer,Integer>mp= new HashMap<>();
     while(t-->0){
         
       
       System.out.println("input the arrays size");
   int n=sc.nextInt();
      
       
       for(int i=0;i<n;i++){
           int p= sc.nextInt();
         mp.put(p,mp.getOrDefault(p,0)+1);  
       }
       

     }
   
   mp.forEach((key,value)->{
       System.out.println(key+""+value);
   });
   
   for(Map.Entry<Integer,Integer>m:mp.entrySet()){
       System.out.println(m.getKey()+""+""+m.getValue());
   }
   
   
   
   
	}
}
