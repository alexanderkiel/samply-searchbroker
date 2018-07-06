/*
 * This file is generated by jOOQ.
*/
package de.samply.share.broker.model.db.tables.pojos;


import de.samply.share.broker.model.db.enums.ActionType;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

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
public class Action implements Serializable {

    private static final long serialVersionUID = -526105257;

    private Integer    id;
    private ActionType type;
    private Date       date;
    private Time       time;
    private Integer    projectId;
    private Integer    userId;
    private String     message;
    private String     icon;

    public Action() {}

    public Action(Action value) {
        this.id = value.id;
        this.type = value.type;
        this.date = value.date;
        this.time = value.time;
        this.projectId = value.projectId;
        this.userId = value.userId;
        this.message = value.message;
        this.icon = value.icon;
    }

    public Action(
        Integer    id,
        ActionType type,
        Date       date,
        Time       time,
        Integer    projectId,
        Integer    userId,
        String     message,
        String     icon
    ) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.time = time;
        this.projectId = projectId;
        this.userId = userId;
        this.message = message;
        this.icon = icon;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ActionType getType() {
        return this.type;
    }

    public void setType(ActionType type) {
        this.type = type;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return this.time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Integer getProjectId() {
        return this.projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Action (");

        sb.append(id);
        sb.append(", ").append(type);
        sb.append(", ").append(date);
        sb.append(", ").append(time);
        sb.append(", ").append(projectId);
        sb.append(", ").append(userId);
        sb.append(", ").append(message);
        sb.append(", ").append(icon);

        sb.append(")");
        return sb.toString();
    }
}