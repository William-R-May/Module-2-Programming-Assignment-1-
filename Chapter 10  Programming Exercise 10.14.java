public class TestMyDate {
    public static void main(String[] args) {
        // Create MyDate object for current date
        MyDate date1 = new MyDate();
        System.out.println("Current date:");
        System.out.println("Year: " + date1.getYear() +
                           ", Month: " + date1.getMonth() +
                           ", Day: " + date1.getDay());

        // Create MyDate object with elapsed time
        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("\nDate from elapsed time:");
        System.out.println("Year: " + date2.getYear() +
                           ", Month: " + date2.getMonth() +
                           ", Day: " + date2.getDay());
    }
}
