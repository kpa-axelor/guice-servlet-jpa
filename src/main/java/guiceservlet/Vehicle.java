package guiceservlet;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	int vehicleId;
	String vehicleName;
	@ManyToOne
	Employee employee;
	@ManyToMany
	List<Contect> contect = new ArrayList<Contect>();

	public Vehicle(String vehicleName) {
		super();
		this.vehicleName = vehicleName;
	}

	public Vehicle() {
		super();
	}

	public void setEmpId() {
		this.employee = null;
	}
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	public int getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public List<Contect> getContect() {
		return contect;
	}

	public void setContect(List<Contect> contect) {
		this.contect = contect;
	}

//@JoinColumn(name = "vehicleId")
//@ManyToMany
//	Collection<Employee> employeelist = new ArrayList();
//	public Collection<Employee> getEmployeelist() {
//	return employeelist;
//}
//
//public void setEmployeelist(Collection<Employee> employeelist) {
//	this.employeelist = employeelist;
//}

}
