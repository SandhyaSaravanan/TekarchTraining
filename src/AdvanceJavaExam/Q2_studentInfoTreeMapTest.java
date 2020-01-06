package AdvanceJavaExam;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class StudentInfo {

	String studentName;
	int regNo;
	
	public StudentInfo(String name , int num){
		this.studentName = name;
		this.regNo = num;
	}
	
}
public class Q2_studentInfoTreeMapTest {

	public static void main(String[] args) {
		
		//Creating TreeMap of Student information
		Map<Integer, StudentInfo> studentsMap = new TreeMap<Integer, StudentInfo>();
		
		//Creating Student information
		StudentInfo s1 = new StudentInfo("Ram" , 101);
		StudentInfo s2 = new StudentInfo("Sid" , 201);
		StudentInfo s3 = new StudentInfo("Ria" , 301);
		StudentInfo s4 = new StudentInfo("Tom" , 401);
		StudentInfo s5 = new StudentInfo("Tim" , 501);
		
		//Adding student information to treeMap
		studentsMap.put(2,s2);
		studentsMap.put(1,s1);
		studentsMap.put(5,s5);
		studentsMap.put(3,s3);
		studentsMap.put(4,s4);
		
		System.out.println("key  StudentName  RegisterNumber ");
		//Traversing Map
		for(Map.Entry<Integer, StudentInfo> entry : studentsMap.entrySet()) {
			int key = entry.getKey();
			StudentInfo s = entry.getValue();
			System.out.println(key + "    " + s.studentName+"          "+s.regNo);
		}
	}
}
