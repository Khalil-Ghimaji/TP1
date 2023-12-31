import java.util.ArrayList;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses;
    public Student(String firstName,String lastName,ArrayList<Course> courses){
        this.firstName=new String(firstName);
        this.lastName=new String(lastName);
        this.courses=new ArrayList<Course>(courses);
    }
    public int getStudentId(){
        return studentId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public ArrayList getCourses() {
        return courses;
    }
    //public void enroll(Course course)
}
