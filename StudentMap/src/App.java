import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    Map<Integer, Student> map = new HashMap<Integer, Student>();

    public void stu_display() {
        Scanner sc = new Scanner(System.in);
        String c;

        Student obj = new Student();
        int i = 1;
        do {
            String name = obj.nameInput();
            String surname = obj.surnameInput();
            String rollno = obj.rollInput();
            String grade = obj.gradeInput();
            String number = obj.numberInput();
            String age = obj.ageInput();
            String email = obj.emailInput();
            String city = obj.cityInput();
            String state = obj.stateInput();
            String country = obj.countryInput();
            // String details=name+" "+surname+" "+rollno+" "+grade+" "+number+" "+age+"
            // "+email+" "+city+" "+state+" "+country;
            Student student_obj = new Student(name, surname, rollno, grade, number, age, email, city, state, country);
            map.put(i, student_obj);
            i++;
            System.out.println("Continue: y/n");
            c = sc.nextLine();
        } while (c.equals("y"));
        System.out.println("STUDENT DETAILS:");
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            int key = entry.getKey();
            Student s = entry.getValue();
            // System.out.println(key+" Student Details:");
            System.out.println(key + "  Name: " + s.name + ", SurName: " + s.surname + ", RollNo: " + s.rollno
                    + ", Grade: " + s.grade + ", Mobile Number: " + s.number + ", Age: " + s.age + ", Email: " + s.email
                    + ", City: " + s.city + ", State: " + s.state + ", Country: " + s.country);
        }

    }

    public void stu_remove(int key_number) {
        map.remove(key_number);
        System.out.println(map);

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        App app_obj = new App();
        app_obj.stu_display();
        System.out.println("Enter the value to remove:");
        int map_remove_val = sc.nextInt();
        app_obj.stu_remove(map_remove_val);
        sc.close();
    }
}
