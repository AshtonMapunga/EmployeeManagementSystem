package EmployeeManager.EmployeeManagerProgect.employeeController;

import EmployeeManager.EmployeeManagerProgect.employeeService.EmployeeServices;
import EmployeeManager.EmployeeManagerProgect.model.Employ;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employ")
public class EmployeeControllers {

    private final EmployeeServices employeeServices;

    public EmployeeControllers(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Employ>> getAllEmployees (){
        List<Employ> employees = employeeServices.findAllEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employ> getEmployeeById(@PathVariable("id") Long id){
        Employ employ = employeeServices.findEmployeeById(id);
        return new ResponseEntity<>(employ, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employ> addEmployee(@RequestBody Employ employ) {
        Employ newEmployee = employeeServices.addEmployee(employ);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employ> updateEmployee(@RequestBody Employ employ) {
        Employ updateEmployee = employeeServices.updateEmployee(employ);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK );
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
         employeeServices.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK );
    }


}
