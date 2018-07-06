/*
 * This file is generated by jOOQ.
*/
package de.samply.share.broker.model.db.tables.daos;


import de.samply.share.broker.model.db.tables.Reply;
import de.samply.share.broker.model.db.tables.records.ReplyRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class ReplyDao extends DAOImpl<ReplyRecord, de.samply.share.broker.model.db.tables.pojos.Reply, Integer> {

    /**
     * Create a new ReplyDao without any configuration
     */
    public ReplyDao() {
        super(Reply.REPLY, de.samply.share.broker.model.db.tables.pojos.Reply.class);
    }

    /**
     * Create a new ReplyDao with an attached configuration
     */
    public ReplyDao(Configuration configuration) {
        super(Reply.REPLY, de.samply.share.broker.model.db.tables.pojos.Reply.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(de.samply.share.broker.model.db.tables.pojos.Reply object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Reply> fetchById(Integer... values) {
        return fetch(Reply.REPLY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public de.samply.share.broker.model.db.tables.pojos.Reply fetchOneById(Integer value) {
        return fetchOne(Reply.REPLY.ID, value);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Reply> fetchByContent(String... values) {
        return fetch(Reply.REPLY.CONTENT, values);
    }

    /**
     * Fetch records that have <code>bank_id IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Reply> fetchByBankId(Integer... values) {
        return fetch(Reply.REPLY.BANK_ID, values);
    }

    /**
     * Fetch records that have <code>inquiry_id IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Reply> fetchByInquiryId(Integer... values) {
        return fetch(Reply.REPLY.INQUIRY_ID, values);
    }
}