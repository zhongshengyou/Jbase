public class Consmethod{
	
	public static void main(String[] args) {
	
		Person zsy = new Person("zsy", 28);

		System.out.println("zsy name = " + zsy.getName() + "  " + "age = " + zsy.getAge());
	}

}

class Person {
	
	private String name;
	private int age;

	public Person(String name, int age){
	
		this.name = name;
		this.age = age;
	}

	public String getName() {
		
		return this.name;	
	}

	public int getAge() {
	
		return this.age;
	}

	public void setName(String name) {
		
		this.name = name;	
	}
}
