
// define Class student
public class Student {
	
	// private properties of the class
	private int id;
	private String name;
	private double grade;
	
	/**
	 * Constructor used to initialize Student objects
	 * @param id
	 * @param name
	 * @param grade
	 */
	public Student(int id, String name, double grade) {
		setId(id);
		setName(name);
		setGrade(grade);
	}
	/**
	 * Method that returns the id of each student object
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * Method that sets/resets the id of each student object
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Method that returns the name of each student object
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Method that sets/resets the name of each student object
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Method that returns the grade of each student object
	 * @return grade
	 */
	public double getGrade() {
		return grade;
	}
	/**
	 * Method that set/resets the grade of each student object
	 * @param grade
	 */
	public void setGrade(double grade) {
		this.grade = grade;
	}
	/**
	 * Method that returns a "String/text" representation of each object
	 * Method is used to facilitate displaying the properties of the object
	 */
	public String toString() {
		return String.format("Student(id=%d, name=%s, grade=%.2f)", getId(), getName(), getGrade());
	}
	
	// main method 
	public static void main(String[] args) {
		// Each class can have several objects. Two defined below
		Student studentOne = new Student(101, "John Smith", 9.0);
		Student studentTwo = new Student(102, "Anne Brown", 10.0);
		// Calling the String representation of each object
		// Note that set/get methods can also be called here 
		System.out.println(studentOne.toString());
		System.out.println(studentTwo.toString());

	}
	
	

}
