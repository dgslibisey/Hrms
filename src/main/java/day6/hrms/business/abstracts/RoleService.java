package day6.hrms.business.abstracts;

import java.util.List;

import day6.hrms.core.results.DataResult;
import day6.hrms.core.results.Result;
import day6.hrms.entities.concretes.Role;


public interface RoleService {

	DataResult<List<Role>> getAll();
	Result add(Role role);
}
