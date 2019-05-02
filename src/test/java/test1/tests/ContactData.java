package test1.tests;

public class ContactData {
    private final String name;
    private final String middlename;
    private final String lastname;
    private final String email;

    public ContactData(String name, String middlename, String lastname, String email) {
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }
}
