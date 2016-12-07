package chegg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class SeaPortListener implements ActionListener {
    static SeaPortProgram seaPortProgram = null;
    
    public SeaPortListener(SeaPortProgram seaPortProgram){
        this.seaPortProgram = seaPortProgram;
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        String actionCommand = event.getActionCommand();
        
        switch (actionCommand) {
        case SeaPortProgram.OPEN_FILE:
            openFileActionPerformed(event);
            break;
            
        case SeaPortProgram.SEARCH:
            break;
        default:
            break;
        }
    }
    
    private void openFileActionPerformed(ActionEvent event) {
        JFileChooser fileChooser = new JFileChooser(".");
        int result = fileChooser.showOpenDialog(fileChooser);
        if(result == JFileChooser.APPROVE_OPTION){
        
            File selectedFile = fileChooser.getSelectedFile();
            try(Scanner sc = new Scanner(selectedFile)){
                while(sc.hasNextLine()){
                    seaPortProgram.world.process(sc.nextLine());
                }
            } catch (FileNotFoundException e){
                JOptionPane.showMessageDialog(null, "File can not be opened", "File Open Error", JOptionPane.ERROR_MESSAGE);
                
            }
            
            seaPortProgram.getOutPutArea().append(seaPortProgram.world.toString());
            
        }
        
    }

}