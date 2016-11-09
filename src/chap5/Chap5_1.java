package chap5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Chap5_1 {
	static List<Chap5_1_student> list;
	public static void addstudent(){
		list=new ArrayList<Chap5_1_student>();
		for(int i=0;i<5;i++){
			list.add(new Chap5_1_student(""+i,"yzh"+i,'y',new Date()));
		}
	}
	
	public static void removestudent(int i){
		list.remove(i);
	}
	
	public static void showstudent(){
		for (Chap5_1_student chap5_1_student : list) {
			System.out.println(chap5_1_student); 
		}
	}
	public static void main(String[] args) {
		addstudent();
		System.out.println("展示所有学生");
		showstudent();
		removestudent(0);
		System.out.println("删除第一个学生之后，展示剩下学生");
		showstudent();
	}
}
