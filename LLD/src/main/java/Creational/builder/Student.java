package Creational.builder;

import java.util.HashMap;
import java.util.Map;

public class Student {
    String fName;
    String lName;
    String email;
    String phone;
    String address;

    public Student(){

    }

    public Student(String fName, String lName, String email, String phone, String address) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(Map<String, Object> studentValues) throws Exception {
        fName = (String) studentValues.get("fName");
        if(fName == null){
            throw new Exception("first name is required");
        }
        this.lName = (String) studentValues.get("lName");
        this.email = (String) studentValues.get("email");
        this.phone = (String) studentValues.get("phone");
        this.address = (String) studentValues.get("address");
    }
}
