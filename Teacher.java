/**This class is responsible for keeping the track of teacher's name id,salary 
 */
public class Teacher{
    private int id;
    private String name;
    private int salary;
/**
 * Create a new Teacher object 
 * @param id id for the teacher;
 * @param name name of the teacher.
 * @param salary salary of the teacher.
 */
public Teacher(int id,String name,int salary){
this.id=id;
this.name=name;
this.salary=salary;
}
//here all act as the get to get the value of different id name 
public int getId(){
    return id;
}
public String getName(){
    return name;//here we can use the this key to return us the given value
}
public int getSalary(){
    return salary;
}
//here the set is used to set the value to change previously by the increasing or decreasing by the way of ones performance the individual done
public void setSalary(int salary){
    this.salary = salary;
}
}
