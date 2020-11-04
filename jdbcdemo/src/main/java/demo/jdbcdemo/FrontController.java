package demo.jdbcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
    public class FrontController {

    private Assembler assembler;
    private UseCaseController ctrl;

    public FrontController(Assembler assembler, UseCaseController ctrl) {
        this.assembler = assembler;
        this.ctrl = ctrl;
    }

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hey world";
    }

    @GetMapping("/select")
    @ResponseBody
    public String getDeptName() {
        return ctrl.getDeptNameByDeptNo();
    }

    @GetMapping("/insert")
    @ResponseBody
    public String insert() {
       return ctrl.insertDepartment();
    }

}
