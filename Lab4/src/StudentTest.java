import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    private ArrayList<Student> students;
    
    public StudentTest() {
        students = new ArrayList<>();
    }
    
    public void insertStudent(Student student) {
        students.add(student);
    }
    
    public List<Student> findHighestDegreeStudents() {
        if (students.isEmpty()) return new ArrayList<>();
        
        int maxDegree = students.get(0).getTotalDegree();
        List<Student> highestStudents = new ArrayList<>();
        
        for (Student student : students) {
            int totalDegree = student.getTotalDegree();
            if (totalDegree > maxDegree) {
                maxDegree = totalDegree;
                highestStudents.clear();
                highestStudents.add(student);
            } else if (totalDegree == maxDegree) {
                highestStudents.add(student);
            }
        }
        
        return highestStudents;
    }
    
    public List<Student> findProbationStudents() {
        List<Student> probationStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.isOnProbation()) {
                probationStudents.add(student);
            }
        }
        return probationStudents;
    }
}