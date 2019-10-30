package cn.cxc.globalexceptiondemo.exception;

/**
 *
 * @author chenxiaochong
 * @date 2019/10/29 20:18
 */
public class BaseException extends RuntimeException{

    BaseException() {

    }
    BaseException(String msg) {
        super(msg);
    }
}
