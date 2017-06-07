package cn.evafjs.ssh.dao;

import cn.evafjs.ssh.domain.Employee;


public interface IEmployeeDao {

	Employee findEmployeeByName(String name);

	

}
