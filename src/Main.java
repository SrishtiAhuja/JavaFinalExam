import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        // Adding some students to the student list
        Student s1 = new Student("1234", "Jiya", 20);
        s1.addCourse("java");
        s1.addCourse("python");

        Student s2 = new Student("3456", "Mehar", 21);
        s2.addCourse("HTML");
        s2.addCourse("CSS");

        Student s3 = new Student("4567", "Happy", 22);
        s3.addCourse("C++");
        s3.addCourse("PHP");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        System.out.println("Details of all the students:");
        studentList.stream()
                .forEach(Student::getStudentDetails);

        //to get details of a particular student that studies Java
        String specificCourse = "java";
        System.out.println("Students attending in " + specificCourse + ": ");
        studentList.stream()
                .filter(student -> student.getCourses().contains(specificCourse))
                .forEach(Student::getStudentDetails);

        //to update age of a particular student if their id
        String IDForUpdate = "3456";
        int updatedAge = 25;

        studentList = studentList.stream()
                .map(student -> {
                    if (student.getStudentID().equals(IDForUpdate)) {
                        student.setAge(updatedAge);
                    }
                    return student;
                })
                .toList();

        System.out.println("Details of all the students after updating age:");
        studentList.stream()
                .forEach(Student::getStudentDetails);

        //to calculate and display avg of a student
        double avgAge = studentList.stream()
                .mapToDouble(Student::getAge)
                .average()
                .orElse(0.0);

        System.out.println("Average age of all students: " + avgAge);
    }
}
