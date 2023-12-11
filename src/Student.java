import java.util.List;
import java.util.ArrayList;
public class Student {
    private String StudentID;
    private String Name;
    private int Age;
    private List<String> Courses;

    public Student(String StudentID, String Name, int age){
        this.StudentID=StudentID;
        this.Name=Name;
        this.Age=age;
        this.Courses= new ArrayList<>();

    }
    public void getStudentDetails(){
        System.out.println("Student ID: "+ StudentID);
        System.out.println("Student Name: "+ Name);
        System.out.println("Student Age: "+ Age);
        System.out.println("Courses Student attends:"+ Courses);
    }

    public int getAge(){
        return Age;
    }
    public String getStudentID(){
        return StudentID;
    }
    public void setAge(int Age){
        this.Age=Age;
    }
    public List<String> getCourses(){
        return Courses;
    }
    public void addCourse(String course){
        Courses.add(course);
    }



}
