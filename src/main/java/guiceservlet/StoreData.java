package guiceservlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
@WebListener
public class StoreData extends HttpServlet {

	@Inject
	Student student;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name;
		String marks;
		name = request.getParameter("first_name");
		marks = request.getParameter("marks");
		System.out.println(name);
		System.out.println(marks);
		student.insert(name, marks);
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = student.retrive(name);
		for (Employee employee : employeeList) {
			System.out.print("id = " + employee.getId());
			System.out.print("name = " + employee.getName());
			System.out.print("marks =" + employee.getMarks());

		}
		request.setAttribute("employeeL", employeeList);
		request.getRequestDispatcher("table.jsp").forward(request, response);
	}
}
