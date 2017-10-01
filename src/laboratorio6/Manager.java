package laboratorio6;

/**
 *
 * @author kevin
 */

import java.util.ArrayList;

public class Manager {
    private static ArrayList <Person> allPersons = new ArrayList<>();
    
    public static String [] getListPerson(){
        int size = allPersons.size();
        String [] persons = new String[size];
        
        for (Person tmpPerson:allPersons){
            persons[0] = tmpPerson.toString();
        }
        
        return persons;
    }
    
    static boolean addCliente(String paddress, String pemail, int pphone1, int pphone2, String pidentification, String pname, String psurname, String psecondsurname, String ppassword) 
    {
       boolean validation;
       Client newClient = new Client(paddress, pemail, pphone1, pphone2, pidentification, pname, psurname, psecondsurname, ppassword);
       
       if(newClient != null){
            allPersons.add(newClient);
            validation = true;
        }else{
             validation = false;
        }
        return validation;
    }

    static boolean addUser(String pprofile, String pidentification, String pname, String psurname, String psecondSurname, String ppassword) {
        boolean validation;
        User newUser = new User (pprofile, pidentification, pname, psurname, psecondSurname, ppassword);
        
        if(newUser != null){
            allPersons.add(newUser);
            validation = true;
        }else{
             validation = false;
        }
       
        return validation;
    }
}
