/**
 * A silly simple program to output a 1 - 12 multiplication table.
 * Time complexity = O^2
 * @author  - James Ly
 * @date    - 10.22.2018
 */

public class question
{
	static int n = 12;
	public static void main(String[] args) {
    for (int i = 1; i <= n; i++) {
			for (int y = 1; y <= n; y++) {
				System.out.print(i * y + " ");
			}
			System.out.print("\n");
		}
	}
}
