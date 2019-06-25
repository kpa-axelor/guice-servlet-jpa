package guiceservlet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contect {
	@Id
	@GeneratedValue
	int id;
	String contectno;
//	List<Vehicle> vehiclelist = new ArrayList<Vehicle>();

	public Contect(String contectno) {
		super();
		this.contectno = contectno;
	}

	public Contect() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public List<Vehicle> getVehiclelist() {
//		return vehiclelist;
//	}
//
//	public void setVehiclelist(List<Vehicle> vehiclelist) {
//		this.vehiclelist = vehiclelist;
//	}

	public String getContectno() {
		return contectno;
	}

	public void setContectno(String contectno) {
		this.contectno = contectno;
	}

}
