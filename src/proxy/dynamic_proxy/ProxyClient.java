package proxy.dynamic_proxy;

import proxy.static_proxy.RealSubject;
import proxy.static_proxy.Subject;

/**
 * Description:
 * User: zhangf
 * Date: 2018/03/07
 */
public class ProxyClient {
    public static void main(String[] args) {
        Subject delegate =  new RealSubject();
        DynamicProxyHandler handler = new DynamicProxyHandler(delegate);
        Subject proxy = (Subject) handler.newInstance();
        System.out.println(proxy.getClass().getName());
        proxy.dealTask("dynamic proxy task run...");
    }
}
