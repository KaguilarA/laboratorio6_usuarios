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
class Client extends Person {
    
    protected String address, email;
    protected int phone1, phone2;

    public Client() {
        super ();
    }

    public Client(String paddress, String pemail, int pphone1, int pphone2, String pidentification, String pname, String psurname, String psecondsurname, String ppassword) {
        super(pidentification, pname, psurname, psecondsurname, ppassword);
        this.address = paddress;
        this.email = pemail;
        this.phone1 = pphone1;
        this.phone2 = pphone2;
    }

    // Gets
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }
    public int getPhone1() {
        return phone1;
    }
    public int getPhone2() {
        return phone2;
    }
    
    // Sets
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone1(int phone1) {
        this.phone1 = phone1;
    }
    public void setPhone2(int phone2) {
        this.phone2 = phone2;
    }
    
    // To String
    @Override
    public String toString() {
        return super.toString() + ", Dirreccion= " + address + ", Correo electronico= " + email + ", Telefono 1= " + phone1 + ", Telefono 2= " + phone2;
    }

    
}
