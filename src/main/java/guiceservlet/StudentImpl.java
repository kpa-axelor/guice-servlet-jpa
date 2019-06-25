package guiceservlet;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

public class StudentImpl implements Student {

	@Inject
	Provider<EntityManager> entityManagerProvider;
	
	EntityManager entityManager;

	@Transactional
	public void insert(String name, String marks) {
		entityManager = entityManagerProvider.get();
		Employee employee = new Employee(name, marks);
		entityManager.persist(employee);
	}

	@Transactional
	public List retrive(String name) {
		entityManager = entityManagerProvider.get();
		Query query = entityManager.createQuery("from Employee");
		List<Employee> employeeList = query.getResultList();
		return employeeList;

	}

	@Transactional
	public void update(int id, String name) {
		entityManager = entityManagerProvider.get();
		System.out.println();
		System.out.println(id);
		System.out.println(name);

		Employee employee = entityManager.find(Employee.class, id);
		System.out.println(employee.getName());
		employee.setName(name);
		System.out.println(employee.getName());
		entityManager.persist(employee);

	}
	@Transactional
	public void delete(int id) {
		entityManager = entityManagerProvider.get();
		Employee employee = entityManager.find(Employee.class, id);
		entityManager.remove(employee);
	}
}
