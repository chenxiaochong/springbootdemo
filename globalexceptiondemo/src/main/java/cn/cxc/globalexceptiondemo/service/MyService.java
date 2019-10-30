package cn.cxc.globalexceptiondemo.service;

import cn.cxc.globalexceptiondemo.exception.DeleteException;
import org.springframework.stereotype.Service;

/**
 * @author chenxiaochong
 * @date 2019/10/29 20:29
 */
@Service
public class MyService {

    public String Test() {
        throw new DeleteException("错误！");
    }
}
