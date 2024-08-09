package online.liaojy.mapper;

import online.liaojy.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liaojy
 * @date 2023/12/22 - 6:27
 */
public interface EmployeeMapper {

    List<Employee> getAllEmployee();

    int deleteEmployeeById(int id);

}
