package za.ac.cput.schoolmanagement.domain;
/*
 School_Management
 Entity for the Student
 Author: Edvalter da Costa Jamba (220446571)
 Date: 11 June 2022
*/
public class Student {
    private String studentid;
    private String studentemail;
    private String studentname;

    private Student() {}

    public Student(Builder builder) {
        this.studentid = builder.studentid;
        this.studentemail=builder.studentemail;
        this.studentname = builder.studentname;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public void setStudentemail(String studentemail) {
        this.studentemail = studentemail;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentid() {
        return studentid;
    }

    public String getStudentemail() {
        return studentemail;
    }

    public String getStudentname() {
        return studentname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid='" + studentid + '\'' +
                ", studentemail='" + studentemail + '\'' +
                ", studentname='" + studentname + '\'' +
                '}';
    }

    public static class Builder{

        private String studentid;
        private String studentemail;
        private String studentname;


        public Builder setstudentid(String studentid) {
            this.studentid = studentid;
            return this;
        }

        public Builder setstudentemail(String studentemail) {
            this.studentemail = studentemail;
            return this;
        }

        public Builder setstudentname(String studentname) {
            this.studentname = studentname;
            return this;
        }

        public Builder copy(Student student) {
            this.studentid = student.studentid;
            this.studentemail=student.studentemail;
            this.studentname = student.studentname;

            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

}
