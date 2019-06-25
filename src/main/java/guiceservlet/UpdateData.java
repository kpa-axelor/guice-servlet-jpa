package guiceservlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
@WebListener
public class UpdateData extends HttpServlet {
	@Inject
	Student student;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id;
		id = Integer.parseInt(request.getParameter("id"));
		String name;
		name = request.getParameter("name");
		if (null != request.getParameter("update")) {
			student.update(id, name);
		} else {
			student.delete(id);
		}
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = student.retrive(name);
		request.setAttribute("employeeL", employeeList);
		request.getRequestDispatcher("table.jsp").forward(request, response);
	}

}
