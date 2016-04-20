public class Dataset
{
	private String [][] data;
	private int row;
	private double total=0;
	private double l;
	private String col9;

	public void print(String [] [] data, int row)
	{
		for (int count= 0; count < row; count++)
			{
				System.out.println(data [count][0] + ' ' + data[count][1]);
				System.out.println(data [count][2] + ' ' + data[count][3] + ' ' + data[count][4]);
				System.out.println(data [count][5] + ' ' + data[count][6] + ' ' + data[count][7]);
				System.out.println(data [count][8] + ' ' + data[count][9]);
				System.out.println("\n");
			}
			
	}		
	public double donationTotal(String [] [] data, int row)
	{
		for (int i=0; i<row; i++)
		{
		col9 = data[i][9];
		l = Double.parseDouble(col9);
		total += l;
		}
	return total;
	}
}
