/*
 * This file is generated by jOOQ.
*/
package de.samply.share.broker.model.db.tables.daos;


import de.samply.share.broker.model.db.enums.ActionType;
import de.samply.share.broker.model.db.tables.Action;
import de.samply.share.broker.model.db.tables.records.ActionRecord;

import java.sql.Date;
import java.sql.Time;
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
public class ActionDao extends DAOImpl<ActionRecord, de.samply.share.broker.model.db.tables.pojos.Action, Integer> {

    /**
     * Create a new ActionDao without any configuration
     */
    public ActionDao() {
        super(Action.ACTION, de.samply.share.broker.model.db.tables.pojos.Action.class);
    }

    /**
     * Create a new ActionDao with an attached configuration
     */
    public ActionDao(Configuration configuration) {
        super(Action.ACTION, de.samply.share.broker.model.db.tables.pojos.Action.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(de.samply.share.broker.model.db.tables.pojos.Action object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Action> fetchById(Integer... values) {
        return fetch(Action.ACTION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public de.samply.share.broker.model.db.tables.pojos.Action fetchOneById(Integer value) {
        return fetchOne(Action.ACTION.ID, value);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Action> fetchByType(ActionType... values) {
        return fetch(Action.ACTION.TYPE, values);
    }

    /**
     * Fetch records that have <code>date IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Action> fetchByDate(Date... values) {
        return fetch(Action.ACTION.DATE, values);
    }

    /**
     * Fetch records that have <code>time IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Action> fetchByTime(Time... values) {
        return fetch(Action.ACTION.TIME, values);
    }

    /**
     * Fetch records that have <code>project_id IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Action> fetchByProjectId(Integer... values) {
        return fetch(Action.ACTION.PROJECT_ID, values);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Action> fetchByUserId(Integer... values) {
        return fetch(Action.ACTION.USER_ID, values);
    }

    /**
     * Fetch records that have <code>message IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Action> fetchByMessage(String... values) {
        return fetch(Action.ACTION.MESSAGE, values);
    }

    /**
     * Fetch records that have <code>icon IN (values)</code>
     */
    public List<de.samply.share.broker.model.db.tables.pojos.Action> fetchByIcon(String... values) {
        return fetch(Action.ACTION.ICON, values);
    }
}