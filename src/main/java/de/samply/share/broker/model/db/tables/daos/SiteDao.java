/*
 * This file is generated by jOOQ.
*/
package de.samply.share.broker.model.db.tables.daos;


import de.samply.share.broker.model.db.tables.Site;
import de.samply.share.broker.model.db.tables.records.SiteRecord;

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
public class SiteDao extends DAOImpl<SiteRecord, de.samply.share.broker.model.db.tables.pojos.Site, Integer> {

    /**
     * Create a new SiteDao without any configuration
     */
    public SiteDao() {
        super(Site.SITE, de.samply.share.broker.model.db.tables.pojos.Site.class);
    }

    /**
     * Create a new SiteDao with an attached configuration
     */
    public SiteDao(Configuration configuration) {
        super(Site.SITE, de.samply.share.broker.model.db.tables.pojos.Site.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(de.samply.share.broker.model.db.tables.pojos.Site object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Site> fetchById(Integer... values) {
        return fetch(Site.SITE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public de.samply.share.broker.model.db.tables.pojos.Site fetchOneById(Integer value) {
        return fetchOne(Site.SITE.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Site> fetchByName(String... values) {
        return fetch(Site.SITE.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>name = value</code>
     */
    public de.samply.share.broker.model.db.tables.pojos.Site fetchOneByName(String value) {
        return fetchOne(Site.SITE.NAME, value);
    }

    /**
     * Fetch records that have <code>name_extended IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Site> fetchByNameExtended(String... values) {
        return fetch(Site.SITE.NAME_EXTENDED, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Site> fetchByDescription(String... values) {
        return fetch(Site.SITE.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>contact IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Site> fetchByContact(String... values) {
        return fetch(Site.SITE.CONTACT, values);
    }
}