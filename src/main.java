
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class main {
    
    
    
    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
        
         try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        splash s = new splash();
        
        s.setVisible(true);
        
       Thread.sleep(2000); 
        
       File f = new File ("C:\\Users\\Public\\Documents\\LabTech\\Data");
       
       if(!f.exists()){
           f.mkdirs();
       }else{
           FileInputStream fin = new FileInputStream(DataSaver.DS);
           ObjectInputStream in = new ObjectInputStream(fin);
           LL.LL = (LinkedList) in.readObject() ;
       }
       
       
       

        LabTach labTech = new LabTach();
        
        
        labTech.setVisible(true);
        s.dispose(); 
    }
    
}
