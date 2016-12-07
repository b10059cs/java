package chegg;

import java.util.Random;

public class RaceTrack {
	public static void main(String[] args) { 

		//
		EZ.initialize(680,680);

		//
		int screenWidth = 340; 
		EZImage trackPicture = EZ.addImage("track1.png", screenWidth,340);


		//add pictures of three pictures 
		EZImage dogPicture = EZ.addImage("dog.png", 0,0);
		EZImage tiggerPicture = EZ.addImage("tigger.png", 0,0);
		EZImage catPicture = EZ.addImage("cat.png", 0,0);


		EZSound dogSound = EZ.addSound("dog.wav");


		// initialize position of all three runners
		int dogPosX = 0;
		int posY = 300;
		int tiggerPosX =0;
		int catPosX= 0;
		int lastPressed = -1 ; // lastPressed = -1 -> no key was pressed last 
		// lastPressed == 0 -> a was pressed last
		// lastPressed == 1 -> s was pressed last

		int lastInLead = -1; //0 - dog
		//1 - tigger
		//2 - cat 

		//WHILE loop that will loop forever
		while (true) {

			dogPicture.translateTo(dogPosX, posY); // Set x position of dog.
			tiggerPicture.translateTo(tiggerPosX, 130); // set position of tigger
			catPicture.translateTo (catPosX, 460); //set position of cat

			//    
			Random randomGenerator;
			randomGenerator = new Random(); // make a random number generator and store it in the variable called randomGenerator
			int randomInteger = randomGenerator.nextInt(6); // make a random number from the variable randomInteger
			dogPosX= dogPosX + randomInteger; // make dog move along the x axis with the speed of the initialized random integer
			randomInteger = randomGenerator.nextInt(3);  //generate a random integer >=12 or <1
			tiggerPosX= tiggerPosX +randomInteger;// make tigger move within the random integer
			//randomInteger = randomGenerator.nextInt(12); //generate a random integer >=12 or <1
			//catPosX= catPosX+randomInteger; //make cat move within the random integer
			if(lastPressed == -1 && EZInteraction.wasKeyPressed('a') 
					|| lastPressed == 1 && EZInteraction.wasKeyPressed('a'))
			{
				catPosX = catPosX + 15; 
				lastPressed = 0; 
			}

			if ( lastPressed == -1 && EZInteraction.wasKeyPressed('a') || 
					lastPressed == 0 && EZInteraction.wasKeyPressed('s') )
			{
				catPosX = catPosX + 15; 
				lastPressed = 1; 
			}


			if(dogPosX - tiggerPosX >= (1/16)*screenWidth  && lastInLead != 0 && dogPosX - catPosX >= (1/16)*screenWidth)
			{
				System.out.println("dog in lead");
				lastInLead = 0; 
				dogSound.play();
			}
			if(tiggerPosX - catPosX >= (1/16)*screenWidth  && lastInLead != 1 && tiggerPosX - dogPosX >= (1/16)*screenWidth)
			{
				System.out.println("tigger in lead");
				lastInLead = 1; 

			}

			if(catPosX - dogPosX >= (1/16)*screenWidth  && lastInLead != 2 && catPosX - tiggerPosX >= (1/16)*screenWidth)
			{
				System.out.println("cat in lead");
				lastInLead = 2; 

			}
			// continue to refresh the screen
			EZ.refreshScreen();

		}

	}

}
