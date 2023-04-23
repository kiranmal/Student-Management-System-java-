import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student>students;//by all these we mean that a school contain multiple teachers and students so
    private static int totalMoneyEarned; 
    private static int totalMoneySpent;
            /**
             * new school object is created)
             * techers list of teachers in the school)
             * students list of students in the school.
     */
    public School(List<Teacher> teachers,List<Student>students){
        this.teachers = teachers;
        this.students =students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }
    //the list of teacher int the School
    public List<Teacher> getTeachers(){
        return teachers;
    }
    /**
     * Adds a teacher to the school
     * @param teachers the teacher to be added
     */
    public void addTeacher(Teacher teacher){//Teacher object are coming from teacher class
        // Object teacher;
        teachers.add(teacher);
        //this is the simpliest way to add more teachers
    }
    /**
     * 
     * @return the list of students in the school.
     */
    public List<Student> getStudents(){
        return students;
    }
    /**
     * Adds a student to the school
     * @param student the student to be added.
     */
    public void addStudent(Student student){
        students.add(student);
    }
    public int gettotalMoneyEarned(){
        return totalMoneyEarned;
    }
    public void updateTotalMoneyEarned(int totalMoneyEarned, int MoneyEarned){
        totalMoneyEarned += MoneyEarned;
    }
    //Adds the total money by the school
    public int getTotalMoneyspent(){
        return totalMoneySpent;
    }
    /**
     * update the money that is spent by the school.the money which is the salary to its teachers 
     * @param MoneySpent spent by the school
     */
    public void updateTotalMoneySpent(int MoneySpent){
        totalMoneyEarned -=MoneySpent;
    }
    public static void updateTotalMoneyEarned(int feesPaid) {
    }
}
//We use here array for storing multiple number all at once and also by data not be very specific so here we use of all its called to be array list