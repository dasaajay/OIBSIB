import java.util.Scanner;

class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite subject: ");
        String subject = scanner.nextLine();

        System.out.println("Hello, my name is \"" + name + "\" and my roll number is \"" + rollNumber + "\"");
        System.out.println("My favourite subject is \"" + subject + "\"");
    }
}
