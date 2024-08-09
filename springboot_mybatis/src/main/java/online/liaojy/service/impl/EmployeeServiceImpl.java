package online.liaojy.service.impl;

import online.liaojy.mapper.EmployeeMapper;
import online.liaojy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liaojy
 * @date 2023/12/25 - 6:33
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Transactional
    @Override
    public int deleteEmployeeById(int id) {

        // 删除一条数据
        int rowsOfDelete = employeeMapper.deleteEmployeeById(id);
        System.out.println("已成功删除"+rowsOfDelete+"行数据");

        // 制造一个异常
        int i = 1/0;

        return rowsOfDelete;
    }

}
