package Part_9;

public class BizException extends RuntimeException {
    public BizException(String msg) {
        super(msg);
    }

    public BizException(Exception ex) {
        super(ex);
    }
}