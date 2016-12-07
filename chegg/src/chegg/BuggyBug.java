package chegg;

import java.awt.Color;

public class BuggyBug {

	public static void main(String[] args) {
		EZ.initialize(400,400);

	       EZ.setBackgroundColor(new Color(0,100,0));

	       EZImage bugPicture = EZ.addImage("bug.png",0,0);

	       bugPicture.rotateTo(90);

	      

	       int stepCount = 0;

	      

	       while(true){

	           if(stepCount < 80){

	               stepCount += 1;

	               bugPicture.moveForward(5);

	              

	           }else{

	               stepCount = 0;

	               bugPicture.turnLeft(90);

	           }

	           EZ.refreshScreen();

	       }



	}

}
