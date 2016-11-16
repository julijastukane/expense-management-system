package lv.company.api.controllers.parents;

public class ParentDTO {
    private Long id;
    private String phone;
    private String email;
    private String password;
    private boolean activity;
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isActivity() {
        return activity;
    }

    public Long getId() {
        return id;
    }

    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setActivity(boolean newActivity) {
        this.activity = newActivity;
    }

    public Boolean getActivity() {
        return activity;
    }
}
