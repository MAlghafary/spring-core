package mutaz.code.springcode;

import org.springframework.aop.framework.Advised;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class IgnoreThisAnnotationPostProcesser implements BeanPostProcessor {


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = getTargetObject(bean).getClass();
        for (Method method : beanClass.getMethods()) {
            IgnoreThis annotation = method.getDeclaredAnnotation(IgnoreThis.class);
            if (annotation != null) {
                System.out.println(method.getName());
            }
        }
        return bean;
    }

    private Object getTargetObject(Object proxy) {
        try {
            if (AopUtils.isJdkDynamicProxy(proxy)) {
                return ((Advised) proxy).getTargetSource().getTarget();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return proxy;
    }
}
