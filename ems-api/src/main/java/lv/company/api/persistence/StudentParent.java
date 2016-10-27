package lv.company.api.persistence;

public class StudentParent {
    private Long id;
    private Long studentId;
    private Long parentId;

    public Long getId() {
        return id;
    }

    public Long setStudentId() {
        return studentId;
    }

    public void getStudentId(Long newStudentId) {
        this.studentId = newStudentId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long newParentId) {
        this.parentId = newParentId;
    }
}
