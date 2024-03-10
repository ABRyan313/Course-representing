package students;
import java.util.*;

public class Student {
	
	private static int number=0;
	private int id;
	private String name;
	private String mail;
	private ArrayList<Course>courses=new ArrayList();
	
	public Student(String name, String mail, Course ... course)throws Exception{
		if(!studentOk(name,mail)) throw new Exception("Invalid student name/mail");
		this.name=name;
		this.mail=mail;
		for(Course c:courses) courses.add(c);
		id=++number;
	}
	
	static {
		number=1000;
	}
	
	public int getId() {
		return id;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) throws Exception{
		if(mail==null || mail.length()==0) throw new Exception("Invalid mail");
		this.mail=mail;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) throws Exception{
		if(name==null || name.length()==0) throw new Exception("Invalid name");
		this.name=name;
	}
	
	public int getCount() {
		return courses.size();
	}
	
	  public Course getCourse(int n )throws Exception{ return courses.get(n); }
	 
	
	public Course getCourses(String id) throws Exception{
		for(Course c:courses) if(c.getId().equals(id)) return c;
		throw new Exception("Course not found");
	}
	
	public ArrayList<Course> getCourses(int year){
		ArrayList<Course> list=new ArrayList();
		for(Course c:courses) if(c.getYear()==year) list.add(c);
		return list;
	}
	
	
	  public void add(Course course) throws Exception{
	  
	  for (Course c : courses) if (course.getId().equals(c.getId())) throw new
	  Exception("The course is already added"); courses.add(course); }
	 
	
	public String toString() {
	 return "[" + id + "] " + name;
	 }
	
	public static boolean studentOk(String name, String mail) {
		return mail!=null && mail.length()>0 && name!=null && name.length()>0;
	}

}
