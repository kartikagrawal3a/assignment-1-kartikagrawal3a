public class Person {
    String fname;
    String lname;
    String number;
    String email;

    public Person(String fname, String lname, String number, String email) {
        this.fname = fname;
        this.lname = lname;
        this.number = number;
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }
}
