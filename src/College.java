import java.util.ArrayList;

public class College {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public College(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public ArrayList<Student> getStudents() {

        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {

        this.teachers = teachers;
    }
}

