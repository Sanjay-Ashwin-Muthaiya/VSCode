import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetails {
    String c;
    private String name, surname, rollno, grade, number, age, email, city, state, country;
    StudentDetails(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    StudentDetails(String name, String surname, String rollno, String grade, String number, String age, String email,
            String city, String state, String country) {
        this.name = name;
        this.surname = surname;
        this.rollno = rollno;
        this.grade = grade;
        this.number = number;
        this.age = age;
        this.email = email;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "StudentDetails [Name=" + name + ", Surname=" + surname + ", RollNo=" + rollno + ", Grade=" + grade
                + ", Mobile Number=" + number + ", Age=" + age + ", Email=" + email + ", City=" + city + ", State="
                + state + ", Country=" + country + "]";
    }
    ArrayList<StudentDetails> al = new ArrayList<StudentDetails>();

    public ArrayList<StudentDetails> getIntput() {
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter Surname:");
        surname = sc.nextLine();
        System.out.println("Enter RollNo:");
        rollno = sc.nextLine();
        System.out.println("Enter Grade:");
        grade = sc.nextLine();
        System.out.println("Enter Mobile Number:");
        number = sc.nextLine();
        System.out.println("Enter Age:");
        age = sc.nextLine();
        System.out.println("Enter Email:");
        email = sc.nextLine();
        System.out.println("Enter City:");
        city = sc.nextLine();
        System.out.println("Enter State:");
        state = sc.nextLine();
        System.out.println("Enter Country:");
        country = sc.nextLine();
        StudentDetails sd = new StudentDetails(name, surname, rollno, grade, number, age, email, city, state, country);
        al.add(sd);
        System.out.println("Continue: y/n");
        c=sc.nextLine();
        }while(c.equals("y"));
        for(StudentDetails i:al){
            System.out.println(i);
        }
        return al;
        
    }
    public static void main(String[] args) {
        StudentDetails obj=new StudentDetails();
        obj.getIntput();
        
        

    }
}
