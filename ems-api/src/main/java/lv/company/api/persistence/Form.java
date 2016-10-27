package lv.company.api.persistence;

import java.util.Date;

public class Form {
    private Long id;
    private Integer studentTotal;
    private String teacherNameSurname;
    private String teacherEmail;
    private String teacherPhone;
    private Long totalBalance;
    private Date studYearFrom;
    private Date studYearTo;

    public Long getId() {
        return id;
    }

    public Integer getStudentTotal() {
        return studentTotal;
    }

    public void setStudentTotal(Integer newStudentTotal) {
        this.studentTotal = newStudentTotal;
    }

    public String getTeacherNameSurname() {
        return teacherNameSurname;
    }

    public void setTeacherNameSurname(String newTeacherNameSurname) {
        this.teacherNameSurname = newTeacherNameSurname;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    public Long getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(Long totalBalance) {
        this.totalBalance = totalBalance;
    }

    public Date getStudYearFrom() {
        return studYearFrom;
    }

    public void setStudYearFrom(Date studYearFrom) {
        this.studYearFrom = studYearFrom;
    }

    public Date getStudYearTo() {
        return studYearTo;
    }

    public void setStudYearTo(Date studYearTo) {
        this.studYearTo = studYearTo;
    }
}
