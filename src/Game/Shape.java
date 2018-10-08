package Game;

class Shape {
	Point[] line;
	int r, c, cc = 13, cr = 1;

	Shape(int r, int c)
	{
		this.r = r;
		this.c = c;
		line = new Point[4];

		for(int i = 0; i < 4; i++)
		{
			line[i] = new Point();
		}

		/*Random rand = new Random();
		int  temp = rand.nextInt( c - 4) + 1;*/

		for(int i = 0; i < 4; i++)
		{
			line[i].setX(cr);
			line[i].setY(cc + i);
		}
	}

	void execute(String ch)
	{
		if(ch.equals("r") || ch.equals("l") || ch.equals("b") || ch.equals("d"))
		{
			move(ch);
		}
		else if(ch.equals("rr"))
		{
			rotate(ch);
		}
	}

	void rotate(String ch)
	{
		
	}

	void move(String ch)
	{
		if(ch.equals("r") && cc != c - 6)
		{
			moveRight();
		}
		else if(ch.equals("l") && cc != 1)
		{
			moveLeft();
		}
		else if(ch.equals("d") && cr != r - 2)
		{
			moveDown();
		}
		else if(ch.equals("b"))
		{
			moveBotom();
		}
		if(cr != 28)
		{
			moveDown();
		}
	}
	void moveRight()
	{
		cc++;
		for(int i = 0; i < 4; i++)
		{
			line[i].setY(cc + i);
		}
	}
	void moveLeft()
	{
		cc--;
		for(int i = 0; i < 4; i++)
		{
			line[i].setY(cc + i);
		}
	}
	void moveDown()
	{
		cr++;
		for(int i = 0; i < 4; i++)
		{
			line[i].setX(cr);
		}
	}
	void moveBotom()
	{
		cr = r - 2;
		for(int i = 0; i < 4; i++)
		{
			line[i].setX(cr);
		}
	}
}
