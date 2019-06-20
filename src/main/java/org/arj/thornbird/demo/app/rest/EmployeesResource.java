package org.arj.thornbird.demo.app.rest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.arj.thornbird.demo.app.jpa.Employee;
import org.eclipse.microprofile.openapi.annotations.Operation;


@Path("/employes")
public class EmployeesResource {
	@PersistenceContext
	EntityManager em;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Operation(deprecated = false, description = "Returns all mployees.", hidden = false, summary = "Employees summary.")
	public List<Employee> hello() {
		List<Employee> employees = em.createNamedQuery("Employee.findAll", Employee.class).getResultList();
		return employees;
	}
}
