package Javaprogrammes;

public class multipledimensionalarray {

	public static void main(String[] args) {
		
		int [][]x={{10,23,41,95},{3,48,21,91,72},{5,87,92,52,48}};
		for(int n=0;n<x.length;n++)
		{
			for(int i=0;i<x[n].length;i++)
			{
				System.out.print(x[n][i]+" ");
			}
			System.out.println();
		}
	}

}
