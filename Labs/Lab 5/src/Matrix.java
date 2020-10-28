
public class Matrix {
	
	private final int NUMROW = 3;
	private final int NUMCOL = 2;
	private boolean[][] matrix = new boolean[NUMROW][NUMCOL];
	
	public Matrix(boolean[][] m)
	{
		this.matrix = m;
	}
	
	public String toString()
	{
		String matToString = "";
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				matToString = matToString + matrix[i][j] + ", ";
			}
		}
		return matToString;
	}
	
	public Matrix transposeMatrix() {}
	public boolean isSquareMatrix() {}
	public Matrix rotateClockwise() {}
	public Matrix rotateCounterClockwise() {}
	public String percentageTrue() {}
	public boolean isEqual(Matrix m) {}
	
}
