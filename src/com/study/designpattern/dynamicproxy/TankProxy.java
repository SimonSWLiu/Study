package com.study.designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TankProxy {
    public static <T> T getBean(final Object tank) throws Exception{
        return (T)Proxy.newProxyInstance(tank.getClass().getInterfaces()[0], new InvocationHandler(){
            public void invoke(Object proxy, Method method) {
                long start = System.currentTimeMillis();
                System.out.println("start:"+start);
                try {
                    method.invoke(tank, new Object[]{});
                } catch (Exception e) {
                    e.printStackTrace();
                }
                long end = System.currentTimeMillis();
                System.out.println("end:"+end);
                System.out.println("time:"+(end-start));
            }

			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				// TODO Auto-generated method stub
				return null;
			}
            
        });
    }
}