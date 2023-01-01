package EmployeeManager.EmployeeManagerProgect.employeeRepository;

import EmployeeManager.EmployeeManagerProgect.model.Employ;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployRepository extends JpaRepository<Employ, Long> {
    void deleteEmployById(Long id);

    Optional<Employ> findEmployById(Long id);
}
