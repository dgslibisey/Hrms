package day6.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import day6.hrms.entities.concretes.EmployerUser;

public interface EmployerUserDao extends JpaRepository<EmployerUser, Integer> {

	EmployerUser findByName(String firstName);
	EmployerUser findByemail(String mail);
	//Mail doğrulama için arama yapabilme
}
