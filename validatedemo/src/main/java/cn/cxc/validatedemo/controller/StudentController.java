package cn.cxc.validatedemo.controller;

import cn.cxc.validatedemo.controller.validation.ValidationGroupAdd;
import cn.cxc.validatedemo.controller.validation.ValidationGroupUpdate;
import cn.cxc.validatedemo.demain.DTO.Student;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author chenxiaochong
 * @date 2019/10/30 11:17
 */
@RestController
public class StudentController {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String getStudent(@Validated(ValidationGroupUpdate.class) @RequestBody  Student student) {
        System.out.println(student);
        return "成功";
    }
}
