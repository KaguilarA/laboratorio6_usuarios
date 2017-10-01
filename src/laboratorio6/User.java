/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio6;

/**
 *
 * @author kevin
 */
class User extends Person{
    
    protected String profile;

    public User() {
        super ();
    }

    public User(String profile, String pidentification, String pname, String psurname, String psecondsurname, String ppassword) {
        super(pidentification, pname, psurname, psecondsurname, ppassword);
        this.profile = profile;
    }
    
    
    
    // Gets
    public String getProfile() {
        return profile;
    }
    
    // Sets
    public void setProfile(String profile) {
        this.profile = profile;
    }
    
    // To String
    @Override
    public String toString() {
        return super.toString() + ", Informacion de usuario= " + profile;
    }
}
