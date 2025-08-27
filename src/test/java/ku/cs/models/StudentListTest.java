package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    @DisplayName("ทดสอบการเพิ่ม Student ลงใน StudentList และตรวจสอบว่าพบคนนั้นหรือไม่")
    void testAddNewStudent() {
        StudentList list = new StudentList();
        list.addNewStudent("6710450996", "StudentTest");
        assertNotNull(list.findStudentById("6710450996"));
    }

    @Test
    @DisplayName("ทดสอบการให้คะแนน Student ใน StudentList และดูเกรดของคนนั้น")
    void testViewGradeOfId() {
        StudentList list = new StudentList();
        list.addNewStudent("6xxxxxxxx", "StudentTest");
        list.giveScoreToId("6xxxxxxxx", 85.20);
        assertEquals("A", list.viewGradeOfId("6xxxxxxxx"));
    }

    @Test
    @DisplayName("ทดสอบการค้นหา StudentList ด้วยชื่อที่กรองแล้ว")
    void testFilterByName() {
        StudentList list = new StudentList();
        list.addNewStudent("6710450996", "Student1");
        list.addNewStudent("6710450997", "Student2");
        list.addNewStudent("6710450998", "Stu3");

        StudentList newList = list.filterByName("Student");

        assertNotNull(newList.findStudentById("6710450996"));
        assertNull(newList.findStudentById("6710450998"));
    }
}