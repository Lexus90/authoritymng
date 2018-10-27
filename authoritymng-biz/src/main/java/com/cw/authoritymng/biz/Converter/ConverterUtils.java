package com.cw.authoritymng.biz.Converter;

import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/10/27
 * @version v1.0
 */
public class ConverterUtils {

    public static <S, T> T convert(S source, Class clazz) {
        T target = null;
        try {
            target = (T) BeanUtils.instantiateClass(clazz);
            BeanUtils.copyProperties(source, target);
        } catch (BeanInstantiationException e) {

        }
        return target;
    }

    public static <S, T> List<T> convertList(List<S> sourceList, Class clazz) {
        List<T> targetList = new ArrayList<T>();
        for (S  t : sourceList) {
            T t1 = (T) convert(t, clazz);
            if (t1 != null) {
                targetList.add(t1);
            }
        }
        return targetList;
    }

}
