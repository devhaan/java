package oops_lab_session_2.library;

public class Main {

    public static void main(String[] args) {

        Member user1 = new Member();
        Member user2 = new Member("Devendra", "9111283017");
        Member user3 = new Member(user2);

        System.out.println(user1.userId + " " +  user1.name + " " + user1.contactInfo);
        System.out.println(user2.userId + " " +  user2.name + " " + user2.contactInfo);
        System.out.println(user3.userId + " " +  user3.name + " " + user3.contactInfo);



    }
}
