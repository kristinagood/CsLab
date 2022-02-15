package microwave;

public class MicrowaveTester {

	public static void main(String[] args) {
		
		//Create a microwave object
		Microwave myMicrowave = new Microwave();
		
		
		//Hit the time button
		myMicrowave.timeButton();
		myMicrowave.timeButton();
		myMicrowave.timeButton();
		
		//Hit the power button
		myMicrowave.powerButton();
		
		
		//Hit the start button
		myMicrowave.startButton();
		
		
		//Hit the reset button
		myMicrowave.resetButton();


	}

}
