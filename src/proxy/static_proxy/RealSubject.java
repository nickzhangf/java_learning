package proxy.static_proxy;

/**
 * Description:
 * User: zhangf
 * Date: 2018/03/07
 */
public class RealSubject implements Subject {
    @Override
    public void dealTask(String taskName) {
        System.out.println("正在执行任务： " + taskName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
