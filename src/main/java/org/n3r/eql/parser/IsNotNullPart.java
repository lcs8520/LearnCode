package org.n3r.eql.parser;

import java.util.Map;

public class IsNotNullPart extends IsEmptyPart {
    public IsNotNullPart(String expr, MultiPart multiPart) {
        super(expr, multiPart);
    }

    @Override
    public String evalSql(Object bean, Map<String, Object> executionContext) {
        return !isNull(bean, executionContext) ? multiPart.evalSql(bean, executionContext) : "";
    }
}
