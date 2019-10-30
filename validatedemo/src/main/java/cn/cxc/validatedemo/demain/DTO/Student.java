package cn.cxc.validatedemo.demain.DTO;

import cn.cxc.validatedemo.controller.validation.ValidationGroupAdd;
import cn.cxc.validatedemo.controller.validation.ValidationGroupUpdate;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author chenxiaochong
 * @date 2019/10/30 11:13
 */
@Data
public class Student {

    @NotNull(message = "id不能为空")
    private Integer id;

    @NotBlank(message = "名字不能为空！")
    @Size(min = 1,message = "名字不能小于1",groups = {ValidationGroupUpdate.class})
    @Size(min = 1,max = 10,message = "名字1-10个字符",groups = {ValidationGroupAdd.class})
    private String name;
}
