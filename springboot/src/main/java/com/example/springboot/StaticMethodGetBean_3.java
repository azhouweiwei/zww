package com.example.springboot;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;



@Component
public class StaticMethodGetBean_3<T> implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        StaticMethodGetBean_3.applicationContext = applicationContext;
    }

    public static <T> T  getBean(Class<T> clazz) {
        return applicationContext != null?applicationContext.getBean(clazz):null;
    }
    /**
     * 获取对象
     *
     * @return Object bean的实例
     * @throws BeansException
     */
    public static Object getBean(String beanName) throws BeansException
    {
            return applicationContext.getBean(beanName);
    }
}