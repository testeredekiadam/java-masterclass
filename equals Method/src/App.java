
class Person {
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}




public class App {
	public static void main(String[] args) {
		Double num1 = 5.2;
		Double num2 = 5.2;
		Person p1 = new Person(1, "Bob");
		Person p2 = new Person(1, "Bob");
		System.out.println(num1.equals(num2));
		System.out.println(p1.equals(p2));
	}
}
