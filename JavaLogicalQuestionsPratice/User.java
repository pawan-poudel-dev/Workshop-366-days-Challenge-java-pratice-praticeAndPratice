public class User {
    String username;
    boolean active;
    User(String username, boolean active) {
        this.username = username;
        this.active = active;
    }
    public static void main(String [] args){
        User s1 = new User("Pawan",false);
        System.out.println(s1.username);
        System.out.println(s1.active);
    }
}
