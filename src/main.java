
public class main {
    
    public static void main(String[] args) throws InterruptedException {
        
         
        splash s = new splash();
        
        s.setVisible(true);
        
       Thread.sleep(2000); 
        
        
        LabTach labTech = new LabTach();
        
        
        labTech.setVisible(true);
        s.dispose(); 
    }
    
}
