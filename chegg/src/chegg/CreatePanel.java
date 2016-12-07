package chegg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CreatePanel extends JPanel
 {
   private Vector athleteList;
   private JButton button1;
   private CountPanel cPanel;

 //Constructor initializes components and organize them using certain layouts
 public CreatePanel(Vector athleteList, CountPanel cPanel)
  {
    this.athleteList = athleteList;
    this.cPanel = cPanel;

    //organize components here
      
    button1 = new JButton("Create an Athlete");
    add(button1);
  }
  //ButtonListener is a listener class that listens to
  //see if the button "Create an Athlete" is pushed.
  //When the event occurs, it adds an athlete using the information
  //entered by a user.
  //It also performs error checking.
  private class ButtonListener implements ActionListener
   {
    public void actionPerformed(ActionEvent event)
     {

         //TO BE COMPLETED

     } //end of actionPerformed method
  } //end of ButtonListener class

} //end of CreatePanel class