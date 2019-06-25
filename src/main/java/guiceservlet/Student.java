package guiceservlet;

import java.util.List;

public interface Student {
	
	public void insert(String name , String marks);
	public List retrive(String name);
	public void update(int id,String name);
	public void delete(int id);
}
