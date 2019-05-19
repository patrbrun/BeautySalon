package com.grouptwo.saloon.model;

public class User {

    private int userId;
    private String userName;
    private String password;
    private String email;
    private int phoneNumber;
    private String userType;

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", userType='" + userType + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        User user = (User) object;
        return userId == user.userId &&
                phoneNumber == user.phoneNumber &&
                java.util.Objects.equals(userName, user.userName) &&
                java.util.Objects.equals(password, user.password) &&
                java.util.Objects.equals(email, user.email) &&
                java.util.Objects.equals(userType, user.userType);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), userId, userName, password, email, phoneNumber, userType);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
