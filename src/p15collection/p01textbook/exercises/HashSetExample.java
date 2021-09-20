package p15collection.p01textbook.exercises;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		//교재 777쪽 8번
		
		Set<Student> set = new HashSet<Student>(); {
			
			set.add(new Student(1, "김태희"));
			set.add(new Student(2, "전지현"));
			set.add(new Student(1, "한가인"));				//학번이 같으므로 저장되지 않게 하고싶엉
			
			Iterator<Student> iterator = set.iterator();
			while(iterator.hasNext()) {
				Student student = iterator.next();
				System.out.println(student.studentNum + ":" +student.name);
			}
			
		}
		
		
	}
}
