package Creational.builder;

public class NewStudent {
    String fName;
    String lName;
    String email;
    String phone;
    String address;
// 1- create an inner class with same field as outer class
    public static class NewStudentBuilder{
        String fName;
        String lName;
        String email;
        String phone;
        String address;

        public String getfName() {
            return fName;
        }

        public NewStudentBuilder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public String getlName() {
            return lName;
        }

        public NewStudentBuilder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public NewStudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public NewStudentBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public NewStudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        private boolean validate(){
            if(fName==null || lName ==null){
                return false;
            }
            return true;
        }
        // Step -2 Add a build method to create outer class
        public NewStudent build(){
            // step -4 validation
            boolean isValid = validate();
            if(!isValid){
                throw new IllegalArgumentException("Invalid User");
            }
            NewStudent student = new NewStudent();
            student.fName = this.fName;
            student.lName = this.lName;
            student.email = this.email;
            student.phone = this.phone;
            return student;
        }
    }
}
