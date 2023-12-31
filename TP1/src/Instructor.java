public class Instructor {
    private int instructorId;
    private String firstName;
    private String lastName;
    public Instructor(int instructorId,String firstName,String lastName){
        this.instructorId=instructorId;
        this.firstName=new String(firstName);
        this.lastName=new String(lastName);
    }

    public int getInstructorId() {
        return instructorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
