package online.liaojy.controller;

import online.liaojy.mapper.EmployeeMapper;
import online.liaojy.pojo.Employee;
import online.liaojy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liaojy
 * @date 2023/12/22 - 6:16
 */
@RestController
public class TestController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/deleteEmployeeById")
    public String deleteEmployeeById(){
        int i = employeeService.deleteEmployeeById(26);
        return "删除成功";
    }

    @RequestMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        List<Employee> employeeList = employeeMapper.getAllEmployee();
        return employeeList;
    }

}
