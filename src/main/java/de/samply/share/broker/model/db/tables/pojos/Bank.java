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
public class Bank implements Serializable {

    private static final long serialVersionUID = 796688428;

    private Integer id;
    private String  email;
    private Integer authtokenId;
    private String  clientinfo;

    public Bank() {}

    public Bank(Bank value) {
        this.id = value.id;
        this.email = value.email;
        this.authtokenId = value.authtokenId;
        this.clientinfo = value.clientinfo;
    }

    public Bank(
        Integer id,
        String  email,
        Integer authtokenId,
        String  clientinfo
    ) {
        this.id = id;
        this.email = email;
        this.authtokenId = authtokenId;
        this.clientinfo = clientinfo;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAuthtokenId() {
        return this.authtokenId;
    }

    public void setAuthtokenId(Integer authtokenId) {
        this.authtokenId = authtokenId;
    }

    public String getClientinfo() {
        return this.clientinfo;
    }

    public void setClientinfo(String clientinfo) {
        this.clientinfo = clientinfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bank (");

        sb.append(id);
        sb.append(", ").append(email);
        sb.append(", ").append(authtokenId);
        sb.append(", ").append(clientinfo);

        sb.append(")");
        return sb.toString();
    }
}