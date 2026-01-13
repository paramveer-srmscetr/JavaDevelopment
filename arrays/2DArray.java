import java.util.*;

public class Main
{
	public static void main(String[] args) {
   
     Scanner sc= new Scanner(System.in);	
   List<List<Integer>>ls= new ArrayList<>();
   
   int row=sc.nextInt();
   int col= sc.nextInt();
   
   for(int i=0;i<row;i++){
          ls.add(new ArrayList<>());
       for(int j=0;j<col;j++){
           int n=sc.nextInt();
          ls.get(i).add(n);
           
       }
   }
   
   
   System.out.println(ls);

		  System.out.println("traverse through the one by one element");
   
   for(List<Integer>ns:ls){
       for(int k:ns){
           System.out.println(k);
       }
   }
   
   
	}
}
