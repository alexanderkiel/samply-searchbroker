/*
 * This file is generated by jOOQ.
*/
package de.samply.share.broker.model.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class User implements Serializable {

    private static final long serialVersionUID = -476814382;

    private Integer id;
    private String  username;
    private String  email;
    private String  name;
    private String  authid;
    private Integer contactId;

    public User() {}

    public User(User value) {
        this.id = value.id;
        this.username = value.username;
        this.email = value.email;
        this.name = value.name;
        this.authid = value.authid;
        this.contactId = value.contactId;
    }

    public User(
        Integer id,
        String  username,
        String  email,
        String  name,
        String  authid,
        Integer contactId
    ) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.name = name;
        this.authid = authid;
        this.contactId = contactId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthid() {
        return this.authid;
    }

    public void setAuthid(String authid) {
        this.authid = authid;
    }

    public Integer getContactId() {
        return this.contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(email);
        sb.append(", ").append(name);
        sb.append(", ").append(authid);
        sb.append(", ").append(contactId);

        sb.append(")");
        return sb.toString();
    }
}