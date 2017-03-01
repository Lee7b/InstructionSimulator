package program;

import java.util.Random;

public class Main {
	
	private int memory[][];
	GUI gui;
	
	public Main()
	{
		memory = new int[4096][4];
		gui = new GUI();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.generatePCValue();
		main.fillMemory();
	}
	
	public void generatePCValue()
	{
		Random rand = new Random();
		int num = rand.nextInt(4090 - 0 + 1);
		gui.setPCVal(num);
	}
	
	public int generateRandom()
	{
		Random rand = new Random();
		
		int num = rand.nextInt(15 - 0 + 1);
		
		return num;
	}
	
	public void fillMemory()
	{
		for (int i = 0; i < 4096; i++)
		{
			int num = generateRandom();
			int num2 = generateRandom();
			int num3 = generateRandom();
			int num4 = generateRandom();
			
			if (num != 7)
			{
				memory[i][0] = num;
				memory[i][1] = num2;
				memory[i][2] = num3;
				memory[i][3] = num4;
			}
			else
			{
				memory[i][0] = num;
				
				if (num2 == 0)
				{
					memory[i][1] = 0;
					memory[i][2] = 0;
					memory[i][3] = 1;
				}
				if (num2 == 1)
				{
					memory[i][1] = 0;
					memory[i][2] = 0;
					memory[i][3] = 2;
				}
				if (num2 == 2)
				{
					memory[i][1] = 0;
					memory[i][2] = 0;
					memory[i][3] = 4;
				}
				if (num2 == 3)
				{
					memory[i][1] = 0;
					memory[i][2] = 0;
					memory[i][3] = 8;
				}
				if (num2 == 4)
				{
					memory[i][1] = 0;
					memory[i][2] = 1;
					memory[i][3] = 0;
				}
				if (num2 == 5)
				{
					memory[i][1] = 0;
					memory[i][2] = 2;
					memory[i][3] = 0;
				}
				if (num2 == 6)
				{
					memory[i][1] = 0;
					memory[i][2] = 4;
					memory[i][3] = 0;
				}
				if (num2 == 7)
				{
					memory[i][1] = 0;
					memory[i][2] = 8;
					memory[i][3] = 0;
				}
				if (num2 == 8)
				{
					memory[i][1] = 1;
					memory[i][2] = 0;
					memory[i][3] = 0;
				}
				if (num2 == 9)
				{
					memory[i][1] = 2;
					memory[i][2] = 0;
					memory[i][3] = 0;
				}
				if (num2 == 10)
				{
					memory[i][1] = 4;
					memory[i][2] = 0;
					memory[i][3] = 0;
				}
				if (num2 == 11)
				{
					memory[i][1] = 8;
					memory[i][2] = 0;
					memory[i][3] = 0;
				}
				if (num2 == 12)
				{
					memory[i][1] = 0;
					memory[i][2] = 0;
					memory[i][3] = 1;
				}
				if (num2 == 13)
				{
					memory[i][1] = 0;
					memory[i][2] = 0;
					memory[i][3] = 2;
				}
				if (num2 == 14)
				{
					memory[i][1] = 0;
					memory[i][2] = 0;
					memory[i][3] = 4;
				}
				if (num2 == 1)
				{
					memory[i][1] = 0;
					memory[i][2] = 0;
					memory[i][3] = 8;
				}
			}
		}
		
		gui.setMemory(memory);
		
	}


}
