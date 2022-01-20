package Creational.builder;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StudentTest {
    @Test
    public void testStudent(){

        Map<String,Object> values = new HashMap<>();
        values.put("fName",null);
        values.put("lName","Jamil");
        values.put("email","shaz.jamil@gmail.com");
        values.put("phone","8340184107");
        values.put("address","Garia");
        Student student= null;
        try {
            student = new Student(values);
        } catch (Exception e){
            e.printStackTrace();
        }
//        student.setfName("Sharif");
//        student.setlName("Jamil");
//        student.setEmail("shaz.jamil@gmail.com");
//        student.setAddress("Garia");

        Assert.assertEquals("If the name is Set, upon fetching it should give the same name","Sharif",student.getfName());
    }

    @Test
    public void NewStudentTest(){
        NewStudent.NewStudentBuilder builder = new NewStudent.NewStudentBuilder();
        builder.setfName("Sharif")
                .setlName("Jamil")
                .setEmail("")
                .setPhone("")
                .setAddress("");
        NewStudent student = builder.build();
        Assert.assertEquals("If the name is Set, upon fetching it should give the same name","Sharif",student.fName);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NewTest(){
        NewStudent.NewStudentBuilder builder = new NewStudent.NewStudentBuilder();
        builder.setEmail("")
                .setPhone("")
                .setAddress("");
       builder.build();
       // Assert.assertEquals("If the name is Set, upon fetching it should give the same name","Sharif",student.fName);
    }
}
