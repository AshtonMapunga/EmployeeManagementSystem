package EmployeeManager.EmployeeManagerProgect.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "managemantEmpTable")
public class Employ implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobtitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employCode;

    public Employ() {
    }

    public Employ(Long id,
                  String name,
                  String email,
                  String jobtitle,
                  String phone,
                  String imageUrl,
                  String employCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobtitle = jobtitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.employCode = employCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployCode() {
        return employCode;
    }

    public void setEmployCode(String employCode) {
        this.employCode = employCode;
    }
}
