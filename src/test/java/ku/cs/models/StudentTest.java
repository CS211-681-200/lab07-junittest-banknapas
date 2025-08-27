package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อ")
    void testChangeName(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.changeName("Student");
        assertEquals("Student", s.getName());
    }

    @Test
    @DisplayName("ทดสอบ method isId")
    void testisId(){
        Student s = new Student("6710450996", "StudentTest");
        assertTrue(s.isId("6710450996"));
    }

    @Test
    @DisplayName("ทดสอบ method isNameContains")
    void testisNameContains(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        assertTrue(s.isNameContains("student"));
    }
}