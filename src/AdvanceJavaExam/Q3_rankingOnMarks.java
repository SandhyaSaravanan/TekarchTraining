package AdvanceJavaExam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student {
	String name;
	int regNo;
	int marks;
	
	student(String name , int num , int marks){
		this.name = name;
		this.regNo = num;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}

public class Q3_rankingOnMarks {

	public static void main(String[] args) {
		ArrayList<student> al = new ArrayList<student>();
		al.add(new student("Ram",101,87));
		al.add(new student("Tom",201,97));
		al.add(new student("Sid",301,84));
		al.add(new student("Tim",401,98));
		al.add(new student("Ria",501,85));
		
		//sort elements on the basis of marks
		Comparator<student> com = Comparator.comparing(student::getMarks);
		Collections.sort(al, com);
		for(student st : al) {
			System.out.println(st.regNo +" "+st.name + " " + st.marks);
		}
		System.out.println("-------------Awards-----------");
		for(int i=1;i<=3;i++) {
		System.out.println("Rank "+ i + " :"+ al.get(5-i).getName());
		}
	}
}
