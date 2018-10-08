package Game;

class Board {

	int r;
	int c;
	char[][] mat;

	Board(int r, int c)
	{
		this.r = c;
		this.c = r;
		mat = new char[r][c];
	}

	boolean checkX(int t, Shape s)
	{
		for(int i = 0; i < 4; i++)
		{
			if(t == s.line[i].getX())
			{
				return true;
			}
		}
		return false;
	}

	boolean checkY(int t, Shape s)
	{
		for(int i = 0; i < 4; i++)
		{
			if(t == s.line[i].getY())
			{
				return true;
			}
		}
		return false;
	}

	void assign()
	{
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				if(i == 0 || j == 0 || i == r - 1 || j == c - 1)
				{
					mat[i][j] = '|';
				}
				else
				{
					mat[i][j] = ' ';	
				}
			}
		}
	}

	void assign(Shape s)
	{
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				if(i == 0 || j == 0 || i == r - 1 || j == c - 1)
				{
					mat[i][j] = '|';
				}
				else if(checkX(i, s) && checkY(j, s))
				{
					mat[i][j] = '#';
				}
				else
				{
					mat[i][j] = ' ';	
				}
			}
		}
	}

	void display()
	{
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}
}