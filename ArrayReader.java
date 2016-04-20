import java.io.*;
import java.util.*;

public class ArrayReader
{
	public static void main (String[] args) throws IOException
	{
		Dataset display = new Dataset();
		Dataset total = new Dataset();
		File myFile = new File ("Lab2.txt");
		Scanner fileScan = new Scanner(myFile);
		Scanner fileBreak;
		String line;
		int y =0;

		String [] [] grid = new String [25] [10];

		while(fileScan.hasNext())
		{
			line = fileScan.nextLine();
			fileBreak = new Scanner(line).useDelimiter("\t");

			for (int i=0; i<10; i++)
				{
				grid[y][i] = fileBreak.next();
				}
			y++;
		}
		
		display.print(grid, 25);
		
		double roundedTotal = Math.round(total.donationTotal(grid,  25)*100)/100.0;
		System.out.println("Total: " +roundedTotal);
		
		System.out.println();
	}
}
