package cn.evafjs.ssh.service;

import java.util.List;

import cn.evafjs.ssh.domain.LeaveBill;



public interface ILeaveBillService {

	List<LeaveBill> findLeaveBillList();

	void saveLeaveBill(LeaveBill leaveBill);

	LeaveBill findLeaveBillById(Long id);

	void deleteLeaveBillById(Long id);

}
