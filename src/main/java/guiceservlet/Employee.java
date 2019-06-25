package guiceservlet;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.sound.midi.Sequence;

@Entity
public class Employee {
	@Id
	@GeneratedValue//(strategy = GenerationType.SEQUENCE)
	int id;
	String name;
	String marks;
	@OneToOne(mappedBy = "employee")
	Address address;
	@OneToMany(cascade = CascadeType.ALL,mappedBy="employee")
	private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public Employee(String name, String marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public Employee() {
		super();
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



	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Vehicle> getVehicleList() {
		return this.vehicleList;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicleList = vehicle;
	}

//	public List<Address> getAddress() {
//		return address;
//	}
//
//	public void setAddress(List<Address> address) {
//		this.address = address;
//	}
//	private List<Address> address = new ArrayList<Address>();
}