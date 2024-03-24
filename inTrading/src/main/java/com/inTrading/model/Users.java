package com.inTrading.model;
//        CreateDatetime      DateTime
//        UpdateDatetime      DateTime
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Users {
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private int id;
    private int age, role;
    private String firstName, middleName, surname, username, password, gender, adharNo, panNo, phoneNo, dateOfBirth;
    private boolean active;
    private Date createDateTime, updateDateTime;

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getRole() {
        return role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getAdharNo() {
        return adharNo;
    }

    public String getPanNo() {
        return panNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isActive() {
        return active;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public Date getUpdateDateTime() {
        return updateDateTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAdharNo(String adharNo) {
        this.adharNo = adharNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public void setUpdateDateTime(Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public Users() {
    }

    public Users(int id, int age, int role, String firstName, String middleName, String surname, String username, String password, String gender, String adharNo, String panNo, String phoneNo, String dateOfBirth, boolean active, Date createDateTime, Date updateDateTime) {
        this.id = id;
        this.age = age;
        this.role = role;
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.adharNo = adharNo;
        this.panNo = panNo;
        this.phoneNo = phoneNo;
        this.dateOfBirth = dateOfBirth;
        this.active = active;
        this.createDateTime = createDateTime;
        this.updateDateTime = updateDateTime;
    }

}
