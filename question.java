/**
 * A silly simple program to output a 1 - 12 multiplication table.
 * Time space = O^2
 * @author  - James Ly
 * @date    - 10.22.2018
 */

public class question
{
	public static void main(String[] args) {
    for (int i = 1; i <= 12; i++) {
			for (int y = 1; y <= 12; y++) {
				System.out.print(i * y + " ");
			}
			System.out.print("\n");
		}
	}
}
