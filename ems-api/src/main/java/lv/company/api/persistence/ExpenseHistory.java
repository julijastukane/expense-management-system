package lv.company.api.persistence;

import java.util.Date;

public class ExpenseHistory {
    private Long record_id;
    private Long formId;
    private Date dateSaved;
    private Long expenseId;
    private Long expenseTotalAmount;
    private Long parentId;

    public Long getId() {
        return record_id;
    }

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public Date getDateSaved() {
        return dateSaved;
    }

    public void setDateSaved(Date dateSaved) {
        this.dateSaved = dateSaved;
    }

    public Long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }

    public Long getExpenseTotalAmount() {
        return expenseTotalAmount;
    }

    public void setExpenseTotalAmount(Long expenseTotalAmount) {
        this.expenseTotalAmount = expenseTotalAmount;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
