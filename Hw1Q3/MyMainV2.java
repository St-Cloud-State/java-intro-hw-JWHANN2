import java.io.*;

public class MyMainV2 {
    public static void main(String[] args) throws IOException {
        // Creating an instance of PersonList
        PersonList personList = new PersonList();
        
        // Simulating input stream with sample data
        String inputData = "John,Doe,1\nJane,Smith,2\nBob,Brown,3\n";
        InputStream inputStream = new ByteArrayInputStream(inputData.getBytes());
        
        // Storing data in the list
        personList.store(inputStream);
        
        // Displaying data in the list
        System.out.println("List of persons:");
        personList.display(System.out);
        
        // Finding persons by ID
        System.out.println("Finding persons:");
        System.out.println("Person with ID '1' is at index: " + personList.find("1"));
        System.out.println("Person with ID '3' is at index: " + personList.find("3"));
        System.out.println("Person with ID '5' is at index: " + personList.find("5"));  // Not found
    }
}
