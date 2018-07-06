/*
 * This file is generated by jOOQ.
*/
package de.samply.share.broker.model.db.tables.records;


import de.samply.share.broker.model.db.tables.Reply;

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
public class ReplyRecord extends UpdatableRecordImpl<ReplyRecord> implements Record4<Integer, String, Integer, Integer> {

    private static final long serialVersionUID = 1103815310;

    /**
     * Setter for <code>samply.reply.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>samply.reply.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>samply.reply.content</code>.
     */
    public void setContent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>samply.reply.content</code>.
     */
    public String getContent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>samply.reply.bank_id</code>.
     */
    public void setBankId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>samply.reply.bank_id</code>.
     */
    public Integer getBankId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>samply.reply.inquiry_id</code>.
     */
    public void setInquiryId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>samply.reply.inquiry_id</code>.
     */
    public Integer getInquiryId() {
        return (Integer) get(3);
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
    public Row4<Integer, String, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Reply.REPLY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Reply.REPLY.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Reply.REPLY.BANK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Reply.REPLY.INQUIRY_ID;
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
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getBankId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getInquiryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplyRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplyRecord value2(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplyRecord value3(Integer value) {
        setBankId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplyRecord value4(Integer value) {
        setInquiryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplyRecord values(Integer value1, String value2, Integer value3, Integer value4) {
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
     * Create a detached ReplyRecord
     */
    public ReplyRecord() {
        super(Reply.REPLY);
    }

    /**
     * Create a detached, initialised ReplyRecord
     */
    public ReplyRecord(Integer id, String content, Integer bankId, Integer inquiryId) {
        super(Reply.REPLY);

        set(0, id);
        set(1, content);
        set(2, bankId);
        set(3, inquiryId);
    }
}