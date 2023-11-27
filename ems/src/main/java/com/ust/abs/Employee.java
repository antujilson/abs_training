package com.ust.abs;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private Long phone;
    @Column(name="gender")
    private String gender;
    @Column(name="place")
    private String place;
    public Employee(){}

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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(Long phone) {
        this.phone = phone;
    }public Long getPhone() {
        return phone;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public String getGender()
    {
        return gender;
    }
    public void setPlace(String place)
    {
        this.place=place;
    }
    public String getPlace()
    {
        return place;
    }

    public Employee(Long id, String firstName, String lastName, String email,Long phone,String gender,String place) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone=phone;
        this.gender=gender;
        this.place=place;
    }
}
