class Person {
    private String firstName;
    private String lastName;
    private String id;

    // Constructor with three parameters
    public Person(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    // Accessor methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    // toString method for displaying the person's information
    @Override
    public String toString() {
        return "Person [ID=" + id + ", First Name=" + firstName + ", Last Name=" + lastName + "]";
    }
}
