public class Main {
    public static void main(String[] args) {
        int ticket = 24_569;
        int bonus =  20;
        int miles = 1;

        int totalMiles = ticket / bonus * miles;

        System.out.println("Количество начисленных миль: " + totalMiles);
    }
}
