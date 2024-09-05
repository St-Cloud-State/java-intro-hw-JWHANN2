import java.io.*;
import java.util.LinkedList;

public class MyMain {

    public static void store(InputStream inputStream, LinkedList<Person> list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        
        // Read input stream line by line and add persons to the list
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 3) {
                list.add(new Person(data[0], data[1], data[2]));
            }
        }
    }

    public static void display(OutputStream outputStream, LinkedList<Person> list) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        
        // Write each person in the list to the output stream
        for (Person person : list) {
            writer.write(person.toString());
            writer.newLine();
        }
        writer.flush();
    }

    public static int find(String sid, LinkedList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        LinkedList<Person> personList = new LinkedList<>();
        
        // Simulating input stream with a string for simplicity
        String inputData = "John,Doe,1\nJane,Smith,2\nBob,Brown,3\n";
        InputStream inputStream = new ByteArrayInputStream(inputData.getBytes());
        
        // Storing data in the list
        store(inputStream, personList);
        
        // Displaying data
        System.out.println("List of persons:");
        display(System.out, personList);
        
        // Finding and displaying index of persons
        System.out.println("Finding persons:");
        System.out.println("Person with ID '1' is at index: " + find("1", personList));
        System.out.println("Person with ID '3' is at index: " + find("3", personList));
        System.out.println("Person with ID '5' is at index: " + find("5", personList));  // Not found
    }
}
