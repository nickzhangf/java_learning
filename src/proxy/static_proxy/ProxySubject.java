package proxy.static_proxy;

/**
 * Description:
 * User: zhangf
 * Date: 2018/03/07
 */
public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void dealTask(String taskName) {
        long time = System.currentTimeMillis();
        subject.dealTask(taskName);
        System.out.println("执行任务耗时：" + (System.currentTimeMillis() - time));
    }
}
