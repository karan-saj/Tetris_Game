/**
 *
 */
package Game;

/**
 * @author Karan
 *
 */

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Tetris {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int r = 30,c = 30;
		Scanner sc = new Scanner(System.in);

		Board m = new Board(r, c);
		m.assign();
		m.display();

		Shape s = new Shape(r, c);

		while(true)
		{
			m.assign(s);
			m.display();
			String ch = sc.next();
			s.execute(ch);
		}
	}

}
