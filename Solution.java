import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			char[] s = fs.next().toCharArray();
			int max = Integer.MIN_VALUE;
			for (char letter : s) {
				max = Math.max(max, letter - 'a');
			}
			System.out.println(max + 1);
		}
		fs.close();
	}
}
