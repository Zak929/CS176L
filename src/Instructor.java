/**
   An instructor is represented by a name, a birth year, and a salary.
   You must enter the class name, instance variable(s), and constructor below
*/

class Instructor extends Person {
	private double salary;
	public Instructor(int personDate, String personName, double wage) {
		super(personDate, personName);
		salary = wage;
	
	}

   /**
      Returns the string represention of the object.
      @return a string representation of the object
   */
   public String toString()
   {
      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
}
}