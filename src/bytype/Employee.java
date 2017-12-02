package bytype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int id;
	private String name;
	@Autowired(required=false)
	//@Qualifier("xyz2")
	private Address add;
	public Employee(){}
	/*public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
		System.out.println(id+"  "+name);
	}*/
	//@Autowired
	public Employee(Address add){
		
		this.add=add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAdd() {
		return add;
	}
	//@Autowired
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	
}
