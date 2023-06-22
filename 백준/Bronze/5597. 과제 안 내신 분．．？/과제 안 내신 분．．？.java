import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		int[] project = new int[28];
		int[] no = new int[2];
		
		for (int i = 0; i < project.length; i++) {
			project[i] = sc.nextInt();
		}
		
		int noIndex = 0;
		for (int b = 0; b < num.length; b++) {
			boolean exists = false;
			
			for (int p = 0; p < project.length; p++) {
				if (num[b] == project[p]) {
					exists = true;
					break;
				}
			}
			
			if (!exists) {
				no[noIndex] = num[b];
				noIndex++;
			}
		}
		
		for (int c = 0; c < no.length; c++) {
			System.out.println(no[c]);
		}
	}
}