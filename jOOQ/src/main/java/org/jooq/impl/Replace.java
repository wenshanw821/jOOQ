/**
 * Copyright (c) 2009-2015, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq.impl;

import static org.jooq.impl.DSL.function;
import static org.jooq.impl.DSL.val;
import static org.jooq.impl.SQLDataType.VARCHAR;

import org.jooq.Configuration;
import org.jooq.Field;

/**
 * @author Lukas Eder
 */
class Replace extends AbstractFunction<String> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -7273879239726265322L;

    Replace(Field<?>... arguments) {
        super("replace", SQLDataType.VARCHAR, arguments);
    }

    @Override
    final Field<String> getFunction0(Configuration configuration) {
        Field<?>[] args = getArguments();

        // [#861] Most dialects don't ship with a two-argument replace function:
        switch (configuration.family()) {
            /* [pro] xx
            xxxx xxxx x
                xx xxxxxxxxxxxx xx xx x
                    xxxxxx xxxxxxxxxxxxxxxxxxxxxxx xxxxxxxx xxxxxxxx xxxxxxxx xxxxxxxxxxx
                x
                xxxx x
                    xxxxxx xxxxxxxxxxxxxxxxxxxxxxx xxxxxxxx xxxxxx
                x
            x

            xxxx xxxxxxx
            xxxx xxxx
            xxxx xxxxx
            xxxx xxxxxxx
            xxxx xxxxxxxxxx
            xxxx xxxxxxx
            xxxx xxxxxxxx
            xx [/pro] */
            case FIREBIRD:
            case HSQLDB:
            case MARIADB:
            case MYSQL:
            case POSTGRES:
            case SQLITE: {
                if (args.length == 2) {
                    return function("replace", VARCHAR, args[0], args[1], val(""));
                }
                else {
                    return function("replace", VARCHAR, args);
                }
            }

            default: {
                return function("replace", VARCHAR, args);
            }
        }
    }
}
