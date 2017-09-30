package laboratorio6;

/**
 *
 * @author kevin
 */
public class Person {
    
    protected String identification, name, surname, secondSurname, password;
    
    public Person()
    {
    }
    
    public Person(String pidentification, String pname, String psurname, String psecondsurname, String ppassword)
    {
        this.identification = pidentification;
        this.name = pname;
        this.surname = psurname;
        this.secondSurname = psecondsurname;
        this.password = ppassword;
    }
    
    // Gets
    public String getIdentification() {
        return identification;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getSecondSurname() {
        return secondSurname;
    }
    public String getPassword() {
        return password;
    }
    
    // Sets
    public void setIdentification(String identification) {
        this.identification = identification;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    // To String
    @Override
    public String toString() {
        return "Person{" + "identification=" + identification + ", name=" + name + ", surname=" + surname + ", secondSurname=" + secondSurname + ", password=" + password + '}';
    }
}
