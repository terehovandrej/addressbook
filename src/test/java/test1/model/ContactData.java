package test1.model;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String email;
    private final String group;

    public ContactData(String firstname, String middlename, String lastname, String email, String group) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.email = email;
        this.group = group;

    }

    public String getName() {
        return firstname;
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

    public String getGroup() {
        return group;
    }
}
