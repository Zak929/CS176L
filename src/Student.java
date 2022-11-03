/**
   A student is represented by the name, birth year, and major.
   You must enter the class name, instance variable(s), and constructor below
*/
class Student extends Person {
	private String major;
	public Student(int personDate, String personName, String major) {
		super(personDate, personName);
		this.major = major;
	}

   /**
      Returns the string representation of the object.
      @return a string representation of the object
   */
   public String toString()
   {
      return "Student[super=" + super.toString() + ",major=" + major + "]";
   }
}
