package za.ac.cput.schoolmanagement.domain;
/*
 School_Management
 Entity for the StudentAddress
 Author: Edvalter da Costa Jamba (220446571)
 Date: 11 June 2022
*/

public class StudentAddress {

    private String studentAddressid;
    private String studentAddress;


    private StudentAddress() {}

    public StudentAddress(Builder builder) {
        this.studentAddressid = builder.studentAddressid;
        this.studentAddress=builder.studentAddress;

    }

    public void setStudentAddressid(String studentAddressid) {
        this.studentAddressid = studentAddressid;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getstudentAddressid() {
        return studentAddressid;
    }

    public String getstudentAddress() {
        return studentAddress;
    }

    @Override
    public String toString() {
        return "StudentAdress{" +
                "studentAdressid='" + studentAddressid + '\'' +
                ", studentAdress='" + studentAddress + '\'' +
                '}';
    }

    public static class Builder{

        private String studentAddressid;
        private String studentAddress;


        public StudentAddress.Builder setstudentAddressid(String studentAddress) {
            this.studentAddressid = studentAddressid;
            return this;
        }

        public StudentAddress.Builder setstudentAddress(String studentAddress) {
            this.studentAddress = studentAddress;
            return this;
        }



        public Builder copy(StudentAddress student) {
            this.studentAddressid = student.studentAddressid;
            this.studentAddress=student.studentAddress;

            return this;
        }

        public StudentAddress build() {
            return new StudentAddress(this);
        }
    }
}
