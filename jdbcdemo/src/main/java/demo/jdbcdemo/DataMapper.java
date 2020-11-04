package demo.jdbcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DataMapper {

    @Autowired
    private JdbcTemplate jdbc;

    public String getDeptNameByDeptNo()
    {  int deptNo = 10; //dummy data
       return jdbc.queryForObject("select dname from dept where deptno = " + deptNo, String.class);
    }

    public String insertDepartment() {
        jdbc.execute("insert into dept(deptno, dname,loc )values('8888','R&D','N.Y')");
        return "Insert success";
    }
}
