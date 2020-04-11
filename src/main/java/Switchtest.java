public class Switchtest {
    public static void main(String[] args) {
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You are an admin");
                break;

            case "moderator":
                System.out.println("You are an moderator");
                break;
            default:
                System.out.println("You are a guest");
                break;
        }
    }
}