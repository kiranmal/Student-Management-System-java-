import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",899);
        Teacher Malisa = new Teacher(2,"Malisa",700);
List<Teacher> teacherList = new ArrayList<>();
teacherList.add(lizzy);
teacherList.add(Malisa);

        Student tamasha =new Student(1,"Tamasha",4);
        Student Kiran =new Student(2,"Kiran",4);
        
List<Student>studentList=new ArrayList<>();
studentList.add(tamasha);
School ghs =new School(teacherList,studentList);
System.out.println(
    "ghs has earned"+ghs.gettotalMoneyEarned());
    tamasha.payFeesPaid(5000);
    System.out.println("Ghs has earned $"+ghs.gettotalMoneyEarned());
    
}
}
