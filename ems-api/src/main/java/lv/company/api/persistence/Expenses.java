package lv.company.api.persistence;

import java.util.Date;

public class Expenses {
    protected Long id;
    protected Date dateAccured;
    protected String description;
    protected String responsible;
    protected Integer type;
    protected Date expirationDate;
    protected Date dateIntoSystem;
    protected String attachmentLink;
    protected Long amount;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Date getDateAccured() {
        return dateAccured;
    }

    public void setDateAccured(Date dateAccured) {
        this.dateAccured = dateAccured;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getDateIntoSystem() {
        return dateIntoSystem;
    }

    public void setDateIntoSystem(Date dateIntoSystem) {
        this.dateIntoSystem = dateIntoSystem;
    }

    public String getAttachmentLink() {
        return attachmentLink;
    }

    public void setAttachmentLink(String attachmentLink) {
        this.attachmentLink = attachmentLink;
    }

    public Long getId() {
        return id;
    }

}
