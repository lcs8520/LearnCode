package org.n3r.eql.parser;

import java.util.Map;

public interface EqlPart {

    String evalSql(Object bean, Map<String, Object> executionContext);
}
