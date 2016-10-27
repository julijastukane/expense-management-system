package lv.company.api.persistence;

import java.util.Date;

public class Student extends Person {
    private Long id;
    private String formName;
    private String studentName;
    private String studentSurname;
    private Date dateOfBirth;
    private String studentEmail;
    private Boolean active;
    private Boolean blocked;
    private Date lastLoginDate;

    public Long getId() {
        return id;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String newFormName) {
        this.formName = newFormName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String newStudentName) {
        this.studentName = newStudentName;
    }

    public String setStudentSurname() {
        return studentSurname;
    }

    public void getStudentSurname(String newStudentSurname) {
        this.studentSurname = newStudentSurname;
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
}
