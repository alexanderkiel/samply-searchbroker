/*
 * This file is generated by jOOQ.
*/
package de.samply.share.broker.model.db.tables.records;


import de.samply.share.broker.model.db.tables.Consent;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConsentRecord extends UpdatableRecordImpl<ConsentRecord> implements Record4<Integer, String, String, Date> {

    private static final long serialVersionUID = -1094059938;

    /**
     * Setter for <code>samply.consent.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>samply.consent.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>samply.consent.version</code>.
     */
    public void setVersion(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>samply.consent.version</code>.
     */
    public String getVersion() {
        return (String) get(1);
    }

    /**
     * Setter for <code>samply.consent.content</code>.
     */
    public void setContent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>samply.consent.content</code>.
     */
    public String getContent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>samply.consent.created</code>.
     */
    public void setCreated(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>samply.consent.created</code>.
     */
    public Date getCreated() {
        return (Date) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Date> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Date> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Consent.CONSENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Consent.CONSENT.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Consent.CONSENT.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Consent.CONSENT.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsentRecord value2(String value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsentRecord value3(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsentRecord value4(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsentRecord values(Integer value1, String value2, String value3, Date value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConsentRecord
     */
    public ConsentRecord() {
        super(Consent.CONSENT);
    }

    /**
     * Create a detached, initialised ConsentRecord
     */
    public ConsentRecord(Integer id, String version, String content, Date created) {
        super(Consent.CONSENT);

        set(0, id);
        set(1, version);
        set(2, content);
        set(3, created);
    }
}