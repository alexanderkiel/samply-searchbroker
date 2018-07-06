/*
 * This file is generated by jOOQ.
*/
package de.samply.share.broker.model.db.tables.daos;


import de.samply.share.broker.model.db.enums.InquiryStatus;
import de.samply.share.broker.model.db.tables.Inquiry;
import de.samply.share.broker.model.db.tables.records.InquiryRecord;

import java.sql.Date;
import java.sql.Timestamp;
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
public class InquiryDao extends DAOImpl<InquiryRecord, de.samply.share.broker.model.db.tables.pojos.Inquiry, Integer> {

    /**
     * Create a new InquiryDao without any configuration
     */
    public InquiryDao() {
        super(Inquiry.INQUIRY, de.samply.share.broker.model.db.tables.pojos.Inquiry.class);
    }

    /**
     * Create a new InquiryDao with an attached configuration
     */
    public InquiryDao(Configuration configuration) {
        super(Inquiry.INQUIRY, de.samply.share.broker.model.db.tables.pojos.Inquiry.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(de.samply.share.broker.model.db.tables.pojos.Inquiry object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Inquiry> fetchById(Integer... values) {
        return fetch(Inquiry.INQUIRY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public de.samply.share.broker.model.db.tables.pojos.Inquiry fetchOneById(Integer value) {
        return fetchOne(Inquiry.INQUIRY.ID, value);
    }

    /**
     * Fetch records that have <code>project_id IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Inquiry> fetchByProjectId(Integer... values) {
        return fetch(Inquiry.INQUIRY.PROJECT_ID, values);
    }

    /**
     * Fetch records that have <code>label IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Inquiry> fetchByLabel(String... values) {
        return fetch(Inquiry.INQUIRY.LABEL, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Inquiry> fetchByDescription(String... values) {
        return fetch(Inquiry.INQUIRY.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Inquiry> fetchByCreated(Timestamp... values) {
        return fetch(Inquiry.INQUIRY.CREATED, values);
    }

    /**
     * Fetch records that have <code>expires IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Inquiry> fetchByExpires(Date... values) {
        return fetch(Inquiry.INQUIRY.EXPIRES, values);
    }

    /**
     * Fetch records that have <code>author_id IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Inquiry> fetchByAuthorId(Integer... values) {
        return fetch(Inquiry.INQUIRY.AUTHOR_ID, values);
    }

    /**
     * Fetch records that have <code>archived IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Inquiry> fetchByArchived(Boolean... values) {
        return fetch(Inquiry.INQUIRY.ARCHIVED, values);
    }

    /**
     * Fetch records that have <code>criteria IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Inquiry> fetchByCriteria(String... values) {
        return fetch(Inquiry.INQUIRY.CRITERIA, values);
    }

    /**
     * Fetch records that have <code>viewfields IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Inquiry> fetchByViewfields(String... values) {
        return fetch(Inquiry.INQUIRY.VIEWFIELDS, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Inquiry> fetchByStatus(InquiryStatus... values) {
        return fetch(Inquiry.INQUIRY.STATUS, values);
    }

    /**
     * Fetch records that have <code>revision IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Inquiry> fetchByRevision(Integer... values) {
        return fetch(Inquiry.INQUIRY.REVISION, values);
    }

    /**
     * Fetch records that have <code>result_type IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Inquiry> fetchByResultType(String... values) {
        return fetch(Inquiry.INQUIRY.RESULT_TYPE, values);
    }
}