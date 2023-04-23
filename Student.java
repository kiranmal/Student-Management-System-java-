// This class is responsible for keeping the track of students fees,name,grade and fees paid
public class Student{
    private int id;
    private String name;
    private int grade;
    private int feesPaid =0;
    private int feesTotal;
        /**to Create a new student by initializing 
         * Fees for every students is 30,000.
         * Initial paied fees is 0
         * id for the student:unique.
         * name name of the student.
         * grade grade of the student
     */
    public Student(int id,String name,int grade){
        //this. all are the constructor it will also help to coordinate between the private and the argument that is passing
        feesPaid=0;
this.id=id;
this.name=name;
this.grade=grade; 
    }
public void setGrade(int grade) {

    this.grade=grade;
}
//Keep adding the fees to feesPaid Field.
/**Add the fees to the fees paid.
 * The School is going recieve the funds.
 */
//Not going to alter student's name,student's id
/**
 * u@param grade new gradeof .
 * grade new grade of the students
 */
public void payFeesPaid(int fees){
    feesPaid+=fees;
    School.updateTotalMoneyEarned(feesPaid);
}
public int getId(){
    return id;
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
       
        return grade;
    }
    public int getFeesPaid(){
        return feesPaid;
    }
    public int getFeesTotal(){
        return feesTotal;
    }
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

}
