package microwave;

public class Microwave {

	//instant variable, constant for this class of time
	private int time;
	
	//instant variable, constant for this class of power
	private int power;
	
	
	//constuctor
	public Microwave()
	{
		time = 0;
		power = 1;
	}
	
	//create power button and levels
	public void powerButton()
	{
		if (power == 1) 
			{power = 2;}
	 else 
			{power = 1;}
	}
	
	//make time button and add 30 seconds to initial value
	public void timeButton()
	{
		time = time + 30;
	}
	
	//create reset button to have the ability to start over after microwave is done
	public void resetButton() 
	{
		time = 0;
		power = 1;
	}
	
	//start button statement 
	public void startButton()
	{
	System.out.println("Cooking for " + time + " seconds at level " + power + ".");
	}



}