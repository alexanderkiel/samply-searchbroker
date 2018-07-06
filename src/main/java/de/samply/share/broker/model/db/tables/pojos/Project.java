/*
 * This file is generated by jOOQ.
*/
package de.samply.share.broker.model.db.tables.pojos;


import de.samply.share.broker.model.db.enums.ProjectStatus;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

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
public class Project implements Serializable {

    private static final long serialVersionUID = 868900060;

    private Integer       id;
    private String        name;
    private Timestamp     received;
    private Timestamp     approved;
    private Date          started;
    private Date          endEstimated;
    private Date          endActual;
    private Boolean       seen;
    private Integer       projectleaderId;
    private Boolean       archived;
    private ProjectStatus status;
    private Integer       applicationNumber;
    private Boolean       externalAssessment;

    public Project() {}

    public Project(Project value) {
        this.id = value.id;
        this.name = value.name;
        this.received = value.received;
        this.approved = value.approved;
        this.started = value.started;
        this.endEstimated = value.endEstimated;
        this.endActual = value.endActual;
        this.seen = value.seen;
        this.projectleaderId = value.projectleaderId;
        this.archived = value.archived;
        this.status = value.status;
        this.applicationNumber = value.applicationNumber;
        this.externalAssessment = value.externalAssessment;
    }

    public Project(
        Integer       id,
        String        name,
        Timestamp     received,
        Timestamp     approved,
        Date          started,
        Date          endEstimated,
        Date          endActual,
        Boolean       seen,
        Integer       projectleaderId,
        Boolean       archived,
        ProjectStatus status,
        Integer       applicationNumber,
        Boolean       externalAssessment
    ) {
        this.id = id;
        this.name = name;
        this.received = received;
        this.approved = approved;
        this.started = started;
        this.endEstimated = endEstimated;
        this.endActual = endActual;
        this.seen = seen;
        this.projectleaderId = projectleaderId;
        this.archived = archived;
        this.status = status;
        this.applicationNumber = applicationNumber;
        this.externalAssessment = externalAssessment;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getReceived() {
        return this.received;
    }

    public void setReceived(Timestamp received) {
        this.received = received;
    }

    public Timestamp getApproved() {
        return this.approved;
    }

    public void setApproved(Timestamp approved) {
        this.approved = approved;
    }

    public Date getStarted() {
        return this.started;
    }

    public void setStarted(Date started) {
        this.started = started;
    }

    public Date getEndEstimated() {
        return this.endEstimated;
    }

    public void setEndEstimated(Date endEstimated) {
        this.endEstimated = endEstimated;
    }

    public Date getEndActual() {
        return this.endActual;
    }

    public void setEndActual(Date endActual) {
        this.endActual = endActual;
    }

    public Boolean getSeen() {
        return this.seen;
    }

    public void setSeen(Boolean seen) {
        this.seen = seen;
    }

    public Integer getProjectleaderId() {
        return this.projectleaderId;
    }

    public void setProjectleaderId(Integer projectleaderId) {
        this.projectleaderId = projectleaderId;
    }

    public Boolean getArchived() {
        return this.archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public ProjectStatus getStatus() {
        return this.status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public Integer getApplicationNumber() {
        return this.applicationNumber;
    }

    public void setApplicationNumber(Integer applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public Boolean getExternalAssessment() {
        return this.externalAssessment;
    }

    public void setExternalAssessment(Boolean externalAssessment) {
        this.externalAssessment = externalAssessment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Project (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(received);
        sb.append(", ").append(approved);
        sb.append(", ").append(started);
        sb.append(", ").append(endEstimated);
        sb.append(", ").append(endActual);
        sb.append(", ").append(seen);
        sb.append(", ").append(projectleaderId);
        sb.append(", ").append(archived);
        sb.append(", ").append(status);
        sb.append(", ").append(applicationNumber);
        sb.append(", ").append(externalAssessment);

        sb.append(")");
        return sb.toString();
    }
}