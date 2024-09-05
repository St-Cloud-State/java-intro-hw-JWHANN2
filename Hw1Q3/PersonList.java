import java.io.*;
import java.util.LinkedList;

public class PersonList {
    private LinkedList<Person> list;

    // Constructor initializing the LinkedList
    public PersonList() {
        this.list = new LinkedList<>();
    }

    // Store method to read from input stream and store data in the list
    public void store(InputStream inputStream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        
        // Reading input stream and adding persons to the list
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 3) {
                list.add(new Person(data[0], data[1], data[2]));
            }
        }
    }

    // Display method to write data from the list to an output stream
    public void display(OutputStream outputStream) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        
        // Write persons to the output stream
        for (Person person : list) {
            writer.write(person.toString());
            writer.newLine();
        }
        writer.flush();
    }

    // Find method to return the index of a person with a specific ID
    public int find(String sid) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }
}
