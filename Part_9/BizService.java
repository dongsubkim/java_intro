package Part_9;

public class BizService {
    public void bizMethod(int i) throws BizException {
        System.out.println("bizMethod starts.");
        if (i < 0)
            throw new BizException("i must be greater than 0.");

        System.out.println("bizMethod ended.");
    }
}
