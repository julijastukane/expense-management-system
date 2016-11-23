package lv.company.api.persistence;

import java.util.Date;

public class Student extends Person {
    private Long id;
    private String formName;
    private Date dateOfBirth;
    private String studentEmail;
    private Boolean active;
    private Boolean blocked;
    private Date lastLoginDate;

    public Long getId() {
        return id;
    }

    public void setId(Long newId) {
        this.id = newId;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String newFormName) {
        this.formName = newFormName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date newDateOfBirth) {
        this.dateOfBirth = newDateOfBirth;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(" ").append(super.toString());
        sb.append(", formName='").append(formName).append('\'');
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append(", studentEmail='").append(studentEmail).append('\'');
        sb.append(", active=").append(active);
        sb.append(", blocked=").append(blocked);
        sb.append(", lastLoginDate=").append(lastLoginDate);
        sb.append('}');
        return sb.toString();
    }
}
