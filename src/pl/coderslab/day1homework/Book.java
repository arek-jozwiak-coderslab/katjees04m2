package pl.coderslab.day1homework;

public class Book {

    private User currentUser;
    private boolean available = true;


    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.available = false;
        this.currentUser = currentUser;
        this.currentUser.addBook(this);
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
