import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class AppTest {
    String name, surname, rollno, grade, number, age, email, city, state, country;
    Student obj = new Student();
    Student stu_obj = new Student("Sanjay", "Siva", "121212", "12", "9448765678", "15", "sanjay.siva@gmail.com",
            "Rasipuram", "TN", "Country");

    @Test
    public void objNotNull() {
        assertNotNull(obj);
    }

    @Before
    public void nameInputTest() {
        String data = "Sanjay";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            name = obj.nameInput();
        } finally {
            System.setIn(stdin);
        }
    }

    @Before
    public void surnameInputTest() {
        String data = "Siva";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            surname = obj.surnameInput();
        } finally {
            System.setIn(stdin);
        }
    }

    @Before
    public void rollInputTest() {
        String data = "1201221";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            rollno = obj.rollInput();
        } finally {
            System.setIn(stdin);
        }
    }

    @Before
    public void gradeInputTest() {
        String data = "12";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            grade = obj.gradeInput();
        } finally {
            System.setIn(stdin);
        }
    }

    @Before
    public void numberInputTest() {
        String data = "9876543210";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            number = obj.numberInput();
        } finally {
            System.setIn(stdin);
        }
    }

    @Before
    public void ageInputTest() {
        String data = "17";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            age = obj.ageInput();
        } finally {
            System.setIn(stdin);
        }
    }

    @Before
    public void emailInputTest() {
        String data = "sanjay.siva@anywhere.com";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            email = obj.emailInput();
        } finally {
            System.setIn(stdin);
        }
    }

    @Before
    public void cityInputTest() {
        String data = "Rasipuram";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            city = obj.cityInput();
        } finally {
            System.setIn(stdin);
        }
    }

    @Before
    public void stateInputTest() {
        String data = "Tamil Nadu";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            state = obj.stateInput();
        } finally {
            System.setIn(stdin);
        }
    }

    @Before
    public void countryInputTest() {
        String data = "India";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            country = obj.countryInput();
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void nameValidationTest() {
        int name_length = name.length();
        assertTrue(name_length >= 3);
    }

    @Test
    public void surnameValidationTest() {
        int surname_length = surname.length();
        assertTrue(surname_length >= 3);
    }

    @Test
    public void nameNullValidationTest() {
        assertNotNull(name);
    }

    @Test
    public void rollValidationTest() {
        int roll_length = rollno.length();
        assertTrue(roll_length == 7);
    }

    @Test
    public void gradeValidationTest() {
        int grade_check = Integer.parseInt(grade);
        assertTrue(grade_check <= 12);
    }

    @Test
    public void numberValidationTest() {
        int mob_number_length = number.length();
        assertTrue(mob_number_length == 10);
    }

    @Test
    public void ageTest() {
        int age_int = Integer.parseInt(age);
        assertTrue(age_int <= 17 && age_int >= 4);
    }

    @Test
    public void emailTest() {
        assertTrue(email.endsWith(".com"));
    }

    @Test
    public void emailContains_Atsign_Test() {
        assertTrue(email.contains("@"));
    }

    @Test
    public void cityTest() {
        assertEquals("Rasipuram", city);
    }

    @Test
    public void stateTest() {
        assertEquals("Tamil Nadu", state);
    }

    @Test
    public void countryTest() {
        assertEquals("India", country);
    }

    @Test
    public void deleteOneIdTest() {
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        map.put(1, stu_obj);
        map.put(2, stu_obj);
        map.remove(1);
        int map_size = map.size();
        assertEquals(1, map_size);
    }

    @Test
    public void NoDuplicatesTest() {
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        map.put(1, stu_obj);
        map.put(1, stu_obj);
        int map_size = map.size();
        assertNotEquals(2, map_size);
    }
}