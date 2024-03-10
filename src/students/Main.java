package students;

public class Main {

	public static void main(String[] args) {
	
			/*
			 * Subject subject=new Subject("OOP","CSE313"); System.out.println(subject);
			 * System.out.println(subject.getId());
			 * subject.setName("Object Oriented Programming"); System.out.println(subject);
			 */
			
			
			
			//test1();
			test2();

	}
	
	
	/*
	 * private static void test1() { try { Course course1=new Course(2014,new
	 * Subject("Mathematic-6","MAT6")); Course course2=new
	 * Course(2015,"Mathematic-7","MAT7"); course1.setScore(7);
	 * //course1.setScore('C'); //course2.setScore('c');
	 * System.out.println(course1.getId());
	 * 
	 * print(course1); System.out.println(course2.getId()); print(course2);
	 * 
	 * 
	 * } catch(Exception Ex) { System.out.println(Ex.getMessage()); } }
	 * 
	 * 
	 * 
	 * private static void print(Course course) throws Exception{
	 * System.out.println(course); if(course.completed())
	 * System.out.println("The course is completed with the result "+course.getScore
	 * ());
	 * 
	 * 
	 * }
	 */
	 
		
		private static void test2() {
			try {
				Student stud1=new Student("AB","AB4044@diu.edu.bd", new Course(2023, new Subject("Chaya Highway","Cha")));
				Student stud2=new Student("Seam","Seam123@habijabi.com", new Course(2015, new Subject("Programming","PRG")), 
						                                                 new Course(2015, new Subject("Operationg Systems","OPS")));
				stud1.add(new Course(2014, new Subject("Database Management","DBS")));
				stud2.add(new Course(2014, new Subject("Web Applications","WEB")));
				
				stud1.getCourses("2014-DBS").setScore(4);
				stud1.getCourses("2023-Cha").setScore('B');
				
				stud2.getCourses("2014-WEB").setScore(10);
				 stud2.getCourses("2015-OPS").setScore(2);
				 print(stud1);
				 print(stud2);
		
			}
			catch(Exception E) {
				System.out.println(E.getMessage());
			}
		}
		
		private static void print(Student stud) {
			 System.out.println(stud);
			 for (int i = 0; i < stud.getCount(); ++i) {
				 try {
					 Course c = stud.getCourse(i);
					 System.out.println(c + ", " +
					 (c.completed() ? "Score: " + c.getScore() : "Not completed"));
				 }
				 catch(Exception Ex) {
					 
				 }
			 }

		}


}
		
		
	
	


