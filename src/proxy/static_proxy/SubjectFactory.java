package proxy.static_proxy;

/**
 * Description:
 * User: zhangf
 * Date: 2018/03/07
 */
public class SubjectFactory {
    public static Subject getInstance() {
        return new ProxySubject(new RealSubject());
    }

    public static void main(String[] args) {
        Subject proxy = SubjectFactory.getInstance();
        proxy.dealTask("任务1");
    }
}
