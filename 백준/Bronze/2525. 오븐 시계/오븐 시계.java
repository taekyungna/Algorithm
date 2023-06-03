import java.util.Scanner;
public class Main{
    
    public static void main(String [] args){
        
       Scanner sc = new Scanner(System.in);
	        
		int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();

	        int min = a*60+b;
	        int total = c+min;
	        
	        System.out.println((total/60)%24+" "+(total%60));
	        
	 }
	       
	        
}
	    
