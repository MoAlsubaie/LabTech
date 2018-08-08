
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class main {
    
    public static void main(String[] args) throws InterruptedException {
        
         try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        splash s = new splash();
        
        s.setVisible(true);
        
       Thread.sleep(2000); 
        
       

        LabTach labTech = new LabTach();
        
        
        labTech.setVisible(true);
        s.dispose(); 
    }
    
}
