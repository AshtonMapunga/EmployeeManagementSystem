package EmployeeManager.EmployeeManagerProgect.employeeService;

import EmployeeManager.EmployeeManagerProgect.employeeException.UserNotFoundException;
import EmployeeManager.EmployeeManagerProgect.employeeRepository.EmployRepository;
import EmployeeManager.EmployeeManagerProgect.model.Employ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeServices {
    private final EmployRepository employRepository;

    @Autowired
    public EmployeeServices(EmployRepository employRepository) {
        this.employRepository = employRepository;
    }

    public List<Employ> findAllEmployee() {
        return employRepository.findAll();
    }

    public Employ updateEmployee(Employ employ){
        return employRepository.save(employ);
    }

    public Employ findEmployeeById(Long id){
        return employRepository.findEmployById(id)
                .orElseThrow(()-> new UserNotFoundException("User by id"+id+"was not found"));
    }

    public  void deleteEmployee(Long id){
        employRepository.deleteEmployById(id);
    }

    public Employ addEmployee(Employ employ) {
        employ.setEmployCode(UUID.randomUUID().toString());
        return employRepository.save(employ);
    }


}
