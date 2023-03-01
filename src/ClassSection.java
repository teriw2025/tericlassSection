import java.util.ArrayList;

public class ClassSection {
    //properties
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students = new ArrayList();

    //constructors
    public ClassSection(String subject, int capcacity, int yearLevel){
        this.subject = subject;
        this.capacity = capcacity;
        this.yearLevel = yearLevel;
    }

    //methods
    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public void addStudent(Student userStudent){
        if(students.size() <= capacity && userStudent.getYearLevel() == yearLevel && isStudentEnrolled(userStudent)==false) {
            students.add(userStudent);
        }
    }
    public void removeStudent(Student userStudent){
        students.remove(userStudent);
    }
    public boolean isStudentEnrolled(Student student){
        if(students.contains(student)){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", students=" + students + "}";
    }





}
