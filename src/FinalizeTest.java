/**
 * Description: finalize() 在gc时会被调用
 * User: zhangf
 * Date: 2018/03/06
 */
public class FinalizeTest {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() running...");
    }

    public static void main(String[] args) {
        FinalizeTest finalizeTest = new FinalizeTest();
        finalizeTest = null;
        System.gc();
    }
}
