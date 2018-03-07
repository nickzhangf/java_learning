package proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description:
 * User: zhangf
 * Date: 2018/03/07
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object delegate;

    public DynamicProxyHandler(Object delegate) {
        this.delegate = delegate;
    }

    public Object newInstance() {
        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(), delegate.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method:"+method.getName());
        System.out.println("args:"+args[0].getClass().getName());
        System.out.println("Before invoke method...");
        Object object = method.invoke(delegate, args);
        System.out.println("After invoke method...");
        return object;
    }
}
