/*
 * This file is generated by jOOQ.
*/
package de.samply.share.broker.model.db.tables.records;


import de.samply.share.broker.model.db.tables.Contact;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class ContactRecord extends UpdatableRecordImpl<ContactRecord> implements Record8<Integer, byte[], String, String, String, String, String, String> {

    private static final long serialVersionUID = 430233598;

    /**
     * Setter for <code>samply.contact.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>samply.contact.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>samply.contact.portrait</code>.
     */
    public void setPortrait(byte... value) {
        set(1, value);
    }

    /**
     * Getter for <code>samply.contact.portrait</code>.
     */
    public byte[] getPortrait() {
        return (byte[]) get(1);
    }

    /**
     * Setter for <code>samply.contact.title</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>samply.contact.title</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>samply.contact.firstname</code>.
     */
    public void setFirstname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>samply.contact.firstname</code>.
     */
    public String getFirstname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>samply.contact.lastname</code>.
     */
    public void setLastname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>samply.contact.lastname</code>.
     */
    public String getLastname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>samply.contact.phone</code>.
     */
    public void setPhone(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>samply.contact.phone</code>.
     */
    public String getPhone() {
        return (String) get(5);
    }

    /**
     * Setter for <code>samply.contact.email</code>.
     */
    public void setEmail(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>samply.contact.email</code>.
     */
    public String getEmail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>samply.contact.organizationname</code>.
     */
    public void setOrganizationname(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>samply.contact.organizationname</code>.
     */
    public String getOrganizationname() {
        return (String) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, byte[], String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, byte[], String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Contact.CONTACT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field2() {
        return Contact.CONTACT.PORTRAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Contact.CONTACT.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Contact.CONTACT.FIRSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Contact.CONTACT.LASTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Contact.CONTACT.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Contact.CONTACT.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Contact.CONTACT.ORGANIZATIONNAME;
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
    public byte[] value2() {
        return getPortrait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLastname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getOrganizationname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactRecord value2(byte... value) {
        setPortrait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactRecord value3(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactRecord value4(String value) {
        setFirstname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactRecord value5(String value) {
        setLastname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactRecord value6(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactRecord value7(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactRecord value8(String value) {
        setOrganizationname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactRecord values(Integer value1, byte[] value2, String value3, String value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContactRecord
     */
    public ContactRecord() {
        super(Contact.CONTACT);
    }

    /**
     * Create a detached, initialised ContactRecord
     */
    public ContactRecord(Integer id, byte[] portrait, String title, String firstname, String lastname, String phone, String email, String organizationname) {
        super(Contact.CONTACT);

        set(0, id);
        set(1, portrait);
        set(2, title);
        set(3, firstname);
        set(4, lastname);
        set(5, phone);
        set(6, email);
        set(7, organizationname);
    }
}