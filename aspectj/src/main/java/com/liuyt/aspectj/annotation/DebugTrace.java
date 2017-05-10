package com.liuyt.aspectj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liuyt on 17-5-10.
 */
/**
 * 表明被注释的方法将被跟踪（仅在Debug模式下）并且将会与Aspect程序中截获该注释的Advise关联，调用该切点
 * 的Advise
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface DebugTrace {
}
