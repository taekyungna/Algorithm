import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] basket = new int[n];
		int chan=0;
		int m = sc.nextInt();
		
		for(int a=0; a<n; a++) {
			basket[a]=a+1;
		}
		
		for(int b=0; b<m; b++) {
			int i = sc.nextInt()-1, j = sc.nextInt()-1;
			chan=basket[i];
			basket[i]= basket[j];
			basket[j] = chan;
			
		}
        
		for(int d=0; d<n; d++) {
			System.out.print(basket[d]+" ");
		}
		
	}
			
}
