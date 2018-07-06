/*
 * This file is generated by jOOQ.
*/
package de.samply.share.broker.model.db.tables;


import de.samply.share.broker.model.db.Keys;
import de.samply.share.broker.model.db.Samply;
import de.samply.share.broker.model.db.tables.records.ContactRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Contact extends TableImpl<ContactRecord> {

    private static final long serialVersionUID = 8345174;

    /**
     * The reference instance of <code>samply.contact</code>
     */
    public static final Contact CONTACT = new Contact();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContactRecord> getRecordType() {
        return ContactRecord.class;
    }

    /**
     * The column <code>samply.contact.id</code>.
     */
    public final TableField<ContactRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('samply.contact_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>samply.contact.portrait</code>.
     */
    public final TableField<ContactRecord, byte[]> PORTRAIT = createField("portrait", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>samply.contact.title</code>.
     */
    public final TableField<ContactRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>samply.contact.firstname</code>.
     */
    public final TableField<ContactRecord, String> FIRSTNAME = createField("firstname", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>samply.contact.lastname</code>.
     */
    public final TableField<ContactRecord, String> LASTNAME = createField("lastname", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>samply.contact.phone</code>.
     */
    public final TableField<ContactRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>samply.contact.email</code>.
     */
    public final TableField<ContactRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>samply.contact.organizationname</code>.
     */
    public final TableField<ContactRecord, String> ORGANIZATIONNAME = createField("organizationname", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>samply.contact</code> table reference
     */
    public Contact() {
        this("contact", null);
    }

    /**
     * Create an aliased <code>samply.contact</code> table reference
     */
    public Contact(String alias) {
        this(alias, CONTACT);
    }

    private Contact(String alias, Table<ContactRecord> aliased) {
        this(alias, aliased, null);
    }

    private Contact(String alias, Table<ContactRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Samply.SAMPLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ContactRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CONTACT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContactRecord> getPrimaryKey() {
        return Keys.CONTACT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContactRecord>> getKeys() {
        return Arrays.<UniqueKey<ContactRecord>>asList(Keys.CONTACT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Contact as(String alias) {
        return new Contact(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Contact rename(String name) {
        return new Contact(name, null);
    }
}