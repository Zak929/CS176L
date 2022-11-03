/**
   A person is represented by the name and a birth year.
   You must enter the class name, instance variable(s), and constructor below
*/
class Person {
	private int birthYear;
	private String name;
	public Person(int personDate, String personName) {
		birthYear = personDate;
		name = personName;
	}
	
/**
      Returns the string representation of the object.
      @return a string representation of the object
*/
   public String toString()
   {
      return "Person[name=" + name + ",birthYear=" + birthYear + "]";
   }
}