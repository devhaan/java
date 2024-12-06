package oops_lab_session_2.library;

public class Main {

    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User("Devendra", "9111283017");
        User user3 = new User(user2);

        System.out.println(user1.userId + " " +  user1.name + " " + user1.contactInfo);
        System.out.println(user2.userId + " " +  user2.name + " " + user2.contactInfo);
        System.out.println(user3.userId + " " +  user3.name + " " + user3.contactInfo);



    }
}
