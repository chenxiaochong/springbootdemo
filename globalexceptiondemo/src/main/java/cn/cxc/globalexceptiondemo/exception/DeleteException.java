package cn.cxc.globalexceptiondemo.exception;

/**
 * @author chenxiaochong
 * @date 2019/10/29 20:21
 */
public class DeleteException extends BaseException {
    public DeleteException() {
    }

    public DeleteException(String msg) {
        super(msg);
    }
}
