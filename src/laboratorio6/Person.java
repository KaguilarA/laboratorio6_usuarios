package laboratorio6;

/**
 *
 * @author kevin
 */
public class Person {
    
    private String identification, name, surname, secondSurname, password;
    
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
}
