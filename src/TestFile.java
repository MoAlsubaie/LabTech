
import java.io.File;
import java.io.Serializable;

public class TestFile implements Serializable{

    private String testName ;
    private File file ;
    private String type ;
    private String addedBy ;
    private String dateAdded ;
    private TestFile next ;

    public String getName() {
        return testName;
    }

    public void setName(String name) {
        this.testName = name;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public TestFile getNext() {
        return next;
    }

    public void setNext(TestFile next) {
        this.next = next;
    }
    
    
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
