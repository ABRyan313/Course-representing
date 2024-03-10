package students;

public class Course {
	
	private int year;
	private Subject subject;
	private int score=Integer.MIN_VALUE;
	
	
	
	  public Course(int year,Subject subject) throws Exception{
	  if(!courseOk(year,subject)) throw new Exception ("Illegal course");
	  this.year=year; this.subject=subject; }
	 
	 
	 
	
	public String getId() {
		return year +"-"+ subject.getId();
	}
	
	
	public int getYear() {
		return year;
	}
	
	public boolean completed() {
		return score>Integer.MIN_VALUE;
	}
	
	public int getScore() throws Exception{
		if(!scoreOk(score)) throw new Exception("The student has not completed the course");
		return score;
	}
	
	public void setScore(int score) throws Exception{
		if(!scoreOk(score)) throw new Exception("Illegal character");
		this.score=score;
	}
	
	public void setScore(String score) throws Exception {
		try {
			int number = Integer.parseInt(score);
			if(!scoreOk(number)) throw new Exception("Illegal score");
			this.score=number;
		}
		catch(Exception E) {
			throw new Exception("Illegal score");
		}
	}
	
	public String toString() {
		return subject.toString();
	}
	
	public static boolean courseOk(int year,Subject subject) {
		return year>=2000 && year<2025 &&  subject != null;
	}
	
	private boolean scoreOk(int score) {
		return true;
	}
	
	
	  public Course(int year,String name,String id) throws Exception{ 
		  subject=new Subject(name,id);
		  if(!courseOk(year,subject)) throw new
	  Exception("Illegal year"); this.year=year; }
	 
	 
	
	
	
}
