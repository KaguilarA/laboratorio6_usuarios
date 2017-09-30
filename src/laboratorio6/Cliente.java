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
public class Cliente {
    
    protected String address, email;
    protected int phone1, phone2;

    public Cliente() {
    }
    
    public Cliente(String address, String email, int phone1, int phone2) {
        this.address = address;
        this.email = email;
        this.phone1 = phone1;
        this.phone2 = phone2;
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
        return "Cliente{" + "address=" + address + ", email=" + email + ", phone1=" + phone1 + ", phone2=" + phone2 + '}';
    }
    
}
