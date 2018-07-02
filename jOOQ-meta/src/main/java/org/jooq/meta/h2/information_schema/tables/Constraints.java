/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.h2.information_schema.tables;


import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.h2.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Constraints extends TableImpl<Record> {

    private static final long serialVersionUID = -235741806;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.CONSTRAINTS</code>
     */
    public static final Constraints CONSTRAINTS = new Constraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public static final TableField<Record, String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(2147483647), CONSTRAINTS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public static final TableField<Record, String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(2147483647), CONSTRAINTS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public static final TableField<Record, String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), CONSTRAINTS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_TYPE</code>.
     */
    public static final TableField<Record, String> CONSTRAINT_TYPE = createField("CONSTRAINT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(2147483647), CONSTRAINTS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTRAINTS.TABLE_CATALOG</code>.
     */
    public static final TableField<Record, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(2147483647), CONSTRAINTS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTRAINTS.TABLE_SCHEMA</code>.
     */
    public static final TableField<Record, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(2147483647), CONSTRAINTS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTRAINTS.TABLE_NAME</code>.
     */
    public static final TableField<Record, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), CONSTRAINTS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTRAINTS.UNIQUE_INDEX_NAME</code>.
     */
    public static final TableField<Record, String> UNIQUE_INDEX_NAME = createField("UNIQUE_INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), CONSTRAINTS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTRAINTS.CHECK_EXPRESSION</code>.
     */
    public static final TableField<Record, String> CHECK_EXPRESSION = createField("CHECK_EXPRESSION", org.jooq.impl.SQLDataType.VARCHAR(2147483647), CONSTRAINTS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTRAINTS.COLUMN_LIST</code>.
     */
    public static final TableField<Record, String> COLUMN_LIST = createField("COLUMN_LIST", org.jooq.impl.SQLDataType.VARCHAR(2147483647), CONSTRAINTS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTRAINTS.REMARKS</code>.
     */
    public static final TableField<Record, String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR(2147483647), CONSTRAINTS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTRAINTS.SQL</code>.
     */
    public static final TableField<Record, String> SQL = createField("SQL", org.jooq.impl.SQLDataType.VARCHAR(2147483647), CONSTRAINTS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTRAINTS.ID</code>.
     */
    public static final TableField<Record, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, CONSTRAINTS, "");

    /**
     * No further instances allowed
     */
    private Constraints() {
        this(DSL.name("CONSTRAINTS"), null);
    }

    private Constraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Constraints(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }
}