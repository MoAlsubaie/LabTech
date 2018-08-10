import java.io.Serializable;
public class LinkedList implements Serializable {
    // head is a reference variable (i.e. class variable) to the first node of the list
    
    private TestFile head;

    // CONSTRUCTORS
    public LinkedList() {
        head = null;
    }

    /* Below are MANY methods that are used on Linked Lists.
     * 
     * Examples:
     * search, insert, delete, isEmpty, sumNodes, and many more
     */
    //
    // boolean | isEmpty()
    //
    public boolean isEmpty() {
        return head == null;  //If head is null, it returns true otherwise false
    }

    //
    // boolean | search(int) for avoiding duplicate entries
    //
    

public boolean search(String data) { //Gets only the data to be searched, from calling method
        return search(head, data); //Sends reference to the first node and the data to be searched, 
                                                  //to another overloaded ‘Search’ method, which will return 
                                                  //‘true’ if that data is found, otherwise it will return false
    }
    //
    // boolean | search(TestFile, int)
    //

    private boolean search(TestFile p, String data) { //Gets reference of first node and data to be 
                                                                            //searched, from calling method(Previous 
                                                                            //Search method) and returns Boolean value
        TestFile helpPtr = p;  //Assigns received reference to another reference variable ‘helpPtr’
        while (helpPtr != null) {
            if (helpPtr.getName().equalsIgnoreCase(data)) {  //If data is found
                return true;
            }
            helpPtr = helpPtr.getNext();  //Goes to next node in the list
        }
        return false;  //If data is not found after traversing the entire link list
    }

    //
    // boolean | findNode(int)
    //
    public TestFile findNode(String data) { //Gets the ‘data’ to be searched
        return findNode(head, data); //Calls another method findNode() by passing it the 
                                                       //reference variable ‘head’ and the data to be found
    }
    //
    // boolean | findNode(TestFile, int) //Used for finding the required data
    // This method has not been used in this program

    private TestFile findNode(TestFile p, String data) { //Receives reference variable for traversing 
                                                                                //the entire link list and the data to be found
        TestFile helpPtr = p;  //Assigns received reference to another reference variable ‘helpPtr’
        while (helpPtr != null) {   //Traverses the entire link list
            if (helpPtr.getName().equalsIgnoreCase(data)) { //If the required data is found
                return helpPtr;                       //Returns reference i.e. pointer to that node
            }
            helpPtr = helpPtr.getNext(); //For moving to next node
        }
        return null;  //If required data is not found
    }

    //
    // void | PrintList()
    //
    

public void PrintList() {
        PrintList(head);  //Calling another method PrintList() by passing it reference variable 
                                   //‘head’ for traversing the entire link list
    }
    //
    // void | PrintList(TestFile)
    //

    private void PrintList(TestFile head) { //Receives reference variable for traversing
        // We need to traverse...so we need a help pointer
        TestFile helpPtr = head;
         
        while (helpPtr != null) {
            // Print the data value of the node
            System.out.print(helpPtr.getName()+ ", ");
            // Moving to next node
            helpPtr = helpPtr.getNext();
        }
        System.out.println();
    }

    
    //
    // void | insert(int)
    //
    public void insert(TestFile data) { //Takes only data to be inserted
        head = insert(head, data); //Calls another insert() method by passing it the reference 
                                                  //variable ‘head’ (pointing to first node) for traversing the link 
                                                  //list and the data to be inserted at the proper location
    }
    //
    // TestFile | insert(TestFile, value)
    //

    private TestFile insert(TestFile head, TestFile data) { //Receives reference variable and data
        // IF there is no list, newNode will be the first node, so just return it
        if (head == null) { //If head is null i.e. there is no node or if there 
                                                                            //is only one node whose data is greater than 
                                                                            //the data we want to insert (as we want an 
                                                                            //ascending ordered data)
            head = data; //Creates new node with data and reference variable 
                                                                  //head which was previously null (if there was no 
                                                                  //node) or pointing to the previously existing 
                      //only node and then assigns its address to the reference variable ‘head’ so that                  
                      //head will be pointing to this newly created node which has now become the 
                      //first node in the list i.e. it will always add new node to the front of link list
            return head;
        } // ELSE, we have a list. Insert the new node at the correct location

        else {
            // We need to traverse to the correct insertion location...so we need a help ptr
            TestFile helpPtr = head;

            // Traverse to correct insertion point
            while (helpPtr.getNext() != null) { //Traversing the entire link list
                
                helpPtr = helpPtr.getNext();
            }
            // Now make the new node. Set its next to point to the successor node.
            // And then make the predecessor node point to the new node
           
            helpPtr.setNext(data); //Making predecessor node (which helpPtr points to) point 
                                                         //to the newly created node
        }
        // Return head
        return head;
    }

    //
    // void | delete(int)
    //
    public void delete(String data) { //Takes data to be deleted
        head = delete(head, data); //Passes the reference variable ‘head’ for traversing the entire 
                                                   //link list and data to be deleted. It will return the reference of 
                                                   //the next node 
    }
    //
    // TestFile | delete(TestFile, value)
    //

    private TestFile delete(TestFile head, String data) {
        // We can only delete if the list has nodes (is not empty)
        if (!isEmpty()) {
            // IF the first node (at the head) has the data value we are wanting to delete
            // we found it. Delete by skipping the node and making head point to the next node.
            if (head.getName().equalsIgnoreCase(data)) {
                head = head.getNext(); //Head will now point to the next node in the list
            } // ELSE, the data is perhaps somewhere else in the list...so we must traverse and 
               //look for it
            else {
                // We need to traverse to find the data we want to delete...so we need a help ptr
                TestFile helpPtr = head; //reference variable helpPtr will be used to traverse and 
                                                       //delete the required node
                // Traverse to correct deletion point

                while (helpPtr.getNext() != null) {
                    if (helpPtr.getNext().getName().equalsIgnoreCase(data)) { //Comparing the data of next node 
                                                                                       //(successor of current node) with the 
                                                                                       //data to be deleted
                        helpPtr.setNext(helpPtr.getNext().getNext()); //Skipping the deleted node
                        break; // we deleted the value and should break out of the while loop
                    }
                    helpPtr = helpPtr.getNext();
                } //End of while
            } //End of else part
            // return the possibly updated head of the list
            return head; //Returns reference of the first node
        } //End of outer most if 
        return head; //If list becomes empty, it returns null as the value of reference variable ‘head’ 
    }
}
