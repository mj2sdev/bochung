package interHashMap;

public class MapDTO {
	private String name;
	private int grade;  // 1:bujang, 2:chajang, 3:gwajang
	private int id;
	private int salary;  // 1:500, 2:400, 3:300
	private int bonus;  // salary * 0.1
	private int pay;   // salary + bonus
	
	public String getName() {
		return name;
	}
	public MapDTO setName(String name) {
		this.name = name;
		return this;
	}
	public int getGrade() {
		return grade;
	}
	public MapDTO setGrade(int grade) {
		this.grade = grade;
		return this;
	}
	public int getId() {
		return id;
	}
	public MapDTO setId(int id) {
		this.id = id;
		return this;
	}
	public int getSalary() {
		return salary;
	}
	public MapDTO setSalary(int salary) {
		this.salary = salary;
		return this;
	}
	public int getBonus() {
		return bonus;
	}
	public MapDTO setBonus(int bonus) {
		this.bonus = bonus;
		return this;
	}
	public int getPay() {
		return pay;
	}
	public MapDTO setPay(int pay) {
		this.pay = pay;
		return this;
	}
}
