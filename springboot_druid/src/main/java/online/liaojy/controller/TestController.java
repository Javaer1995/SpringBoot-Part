package online.liaojy.controller;

import online.liaojy.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liaojy
 * @date 2023/12/21 - 6:08
 */
@RestController
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        String sql = "select * from t_emp";
        List<Employee> employeeList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
        return employeeList;
    }

}
