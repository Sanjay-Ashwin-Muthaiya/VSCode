import java.util.Scanner;

public class Student {

    String name,surname,rollno,grade,number,age,email,city,state,country;
    Student(){
    }
  
    public Student(String name, String surname, String rollno, String grade, String number, String age, String email,
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

    public String nameInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.nextLine();
        return name;
    }

    public String surnameInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter surname:");
        surname=sc.nextLine();
        return surname;
    }

    public String gradeInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter grade:");
        grade=sc.nextLine();
        return grade;
    }

    public String rollInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter RollNo:");
        rollno=sc.nextLine();
        return rollno;
    }

    public String numberInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Mobile Number:");
        number=sc.nextLine();
        return number;
    }

    public String ageInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age:");
        age=sc.nextLine();
        return age;
    }

    public String emailInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Email:");
        email=sc.nextLine();
        return email;
    }

    public String cityInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter City:");
        city=sc.nextLine();
        return city;
    }

    public String stateInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter State:");
        state=sc.nextLine();
        return state;
    }

    public String countryInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Country:");
        country=sc.nextLine();
        return country;
    }
    
}
