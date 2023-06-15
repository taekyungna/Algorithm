import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			
			int n = sc.nextInt();
			int [] arr = new int[n];
			int x = sc.nextInt();
			
			for(int i=0;i<arr.length;i++) {
				
				arr[i] = sc.nextInt();
			}
			
			

			for(int a=0; a<n; a++) {
				if(1<=n && arr[a] <= 10000 && arr[a] < x) {
					System.out.print(arr[a]+" ");
				}
			}
	}

}
