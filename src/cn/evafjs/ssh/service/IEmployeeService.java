package cn.evafjs.ssh.service;

import cn.evafjs.ssh.domain.Employee;


public interface IEmployeeService {

	Employee findEmployeeByName(String name);


}
