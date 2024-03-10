package students;

public class Subject {
	
	private String name;
	private String id;
	
	public Subject(String name, String id) throws Exception {
		
		if(!subjectOk(name,id))
			throw new Exception("Subject must have both name and course code:");
		this.name=name;
		this.id=id;
	
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setName(String name) throws Exception {
		if(!subjectOk(name,id))
			throw new Exception("Subject must have a name:");
		this.name=name;
		
	}
	
	public String toString() {
		return name;
	}
	
	public static boolean subjectOk(String name, String id) {
		return name!=null && name.length()>0 && id!=null && name.length()>0;
	}

	

}
