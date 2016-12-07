package chegg;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class CountPanel extends JPanel
 {
     private Vector athleteList;
   //Constructor initialize each component and arrange them using
   //certain layouts
   public CountPanel(Vector athleteList)
     {
         this.athleteList = athleteList;

        //organize components for spending panel
     }
 //This method  refreshes the JComboBox with
 //updated vector information
 public void updateAthleteList()
  {
      //call updateUI() for the JList object
  }
 //CountListener class listens to see the radio buttons
 //was chosen
 private class CountListener implements ActionListener
     {
         public void actionPerformed(ActionEvent event)
         {
           //TO BE COMPLETED
         }
     }
 //ButtonListener class listens to see the button "Increase Medal Count" is pushed.
 //A user can choose which athlete to increase medal counts and that will update the
 //medal count of such athlete.
 private class ButtonListener implements ActionListener
  {
       public void actionPerformed(ActionEvent event)
        {
            //TO BE COMPLETED
        }
  } //end of ButtonListener class
} //end of CountPanel class