package oops_lab_session_2.library;

import java.util.UUID;

// Marked User as abstract
public abstract class User {
    String userId, name, contactInfo;

    public User() {
        userId = this.generateUniqueId();
    }
    public User(String name, String contactInfo) {
        userId = this.generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User user) {
        this.userId = generateUniqueId();
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String generateUniqueId(){
        return "0";
    }


    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}
