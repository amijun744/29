import java.util.Arrays;
public class Main {
 public static void main(String[] args) {
  // Create objects of Student, Teacher, College
  College college = new College("Computing");
  Student student1 = new Student("amir", 20,new int[]{57,99,100} );
  Student student2 = new Student("messi", 22,new int[]{87,69,93} );
  Teacher teacher1 = new Teacher("Mr. benaw", "Mathematics");
  Teacher teacher2 = new Teacher("Mr. andualem",  "Physics");
  // Set values for attributes through the constructor

  // Add Student and Teacher objects into the College object
  college.getStudents().add(student1);
  college.getStudents().add(student2);
  college.getTeachers().add(teacher1);
  college.getTeachers().add(teacher2);
  // Print some details to test
  {
   System.out.println("College:");
   System.out.println("Name: " + college.getName());
  }
  System.out.println("Students:");
  for (Student student : college.getStudents()) {
   System.out.println("Name: " + student.getName());
   System.out.println("id: " + student.getId());
   System.out.println("grade: " + Arrays.toString(student.getGrade()));
   System.out.println();
  }

  System.out.println("Teachers:");
  for (Teacher teacher : college.getTeachers()) {
   System.out.println("Name: " + teacher.getName());
   System.out.println("Subject: " + teacher.getSubject());
   System.out.println();
  }}
}