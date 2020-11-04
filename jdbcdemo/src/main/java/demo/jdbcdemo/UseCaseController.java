package demo.jdbcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseCaseController {

    @Autowired
    private DataMapper dm = null;

    //dependency injection of DataMapper --> flexibility
    public UseCaseController(DataMapper dm) {
        this.dm = dm;
    }

    public String getDeptNameByDeptNo()
    {
        return dm.getDeptNameByDeptNo();
    }

    public String insertDepartment()
    {
        return dm.insertDepartment();
    }
}
