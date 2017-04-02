/**
 * 
 */
package com.mindtree.dao;

import com.mindtree.entity.Employee;
import com.mindtree.exception.DaoException;

/**
 * @author m1026398
 *
 */
public interface EmployeeDao {
	
	public Employee getEmployeeDtails(String mid) throws DaoException;

	public void saveEmployee(Employee employee) throws DaoException;

}
