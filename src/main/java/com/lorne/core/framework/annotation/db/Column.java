package com.lorne.core.framework.annotation.db;

/**
 * Created by yuliang on 2015/7/8.
 */
@java.lang.annotation.Target(value={java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Column {

     String name() default "";
}
