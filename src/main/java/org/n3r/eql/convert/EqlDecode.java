package org.n3r.eql.convert;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author bingoohuang [bingoohuang@gmail.com] Created on 2017/2/9.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@EqlConvert(EqlDecodeConverter.class)
public @interface EqlDecode {
    String[] value();

    String toType() default "string";
}
