import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable{
    private int id;
    private String name;
    private int marks;
    public Student(){

    }
    public Student(int id,String name,int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;

    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }
    public String toString(){
        return "id: "+getId()+"\t"+"Name : "+getName()+"\t"+getMarks();
    }
    @Override
    public int compareTo(Object o) {
		Student emp = (Student)o;
		if(this.marks > emp.marks)
		{	return 1;
		}else if(this.marks< emp.marks)
		{	return -1;
		}else {
			return 0;
		}
	}


}

public class Q8 {
   public static void main(String x[]){
        ArrayList<Student> al = new ArrayList<>();
        Student s1 = new Student(1,"ABC",40);
        Student s2 = new Student(2,"MNO",10);
        Student s3 = new Student(3,"STV",20);

        al.add(s1);
        al.add(s2);
        al.add(s3);

        System.out.println("Display Before Sorting : ");
		for (Student e : al) {
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getMarks());
		}
		Collections.sort(al);
		System.out.println("Display after Sorting : ");
		for (Student e : al) {
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getMarks());
		}
   }   
}





