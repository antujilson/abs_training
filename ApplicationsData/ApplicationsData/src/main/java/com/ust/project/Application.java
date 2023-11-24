package com.ust.project;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Application_Bio")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="age")
    private Integer age;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private Integer phone;
    @Column(name="education")
    private String education;
    @Column(name="dob")
    private Date dob;

    //Getters and Setters
    public Application(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    //Constructors

    public Application(Long id, String firstName, String lastName, Integer age, String email, Integer phone, String education, Date dob) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.education = education;
        this.dob = dob;
    }

    //toString

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", education='" + education + '\'' +
                ", dob=" + dob +
                '}';
    }
}
