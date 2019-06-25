package guiceservlet;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class MyGuiceServletConfig extends GuiceServletContextListener{

	@Override
	protected Injector getInjector() {
		// TODO Auto-generated method stub
		return Guice.createInjector(new ServletModule() {
			@Override
			protected void configureServlets() {
				serve("/StoreData").with(StoreData.class);
				serve("/UpdateData").with(UpdateData.class);
				bind(Student.class).to(StudentImpl.class);
				install(new JpaPersistModule("crud"));
				filter("StoreData").through(PersistFilter.class);
			}
		});
	}

}
