package zad1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String _name, String _email, char _gender) {
        this.name = _name;
        this.email = _email;
        this.gender = _gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString () {
        return "Author named " + this.name +
                ", with email " + this.email +
                ", his gender is " + this.gender;
    }

}