package program;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Developer {

	private String name;
	private BigDecimal salary;
	private int age;

	public String getName() {
		return name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Developer(String name, BigDecimal salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public static List<Developer> getDevelopers() {
		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		return result;

	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

}
