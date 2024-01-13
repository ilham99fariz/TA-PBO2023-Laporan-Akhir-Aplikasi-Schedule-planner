import java.util.Scanner;
// Kelas utama untuk aplikasi
public class ScheduleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek User
        User user = new User("username", "password");

        // Meminta pengguna untuk login
        System.out.print("Masukkan username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String enteredPassword = scanner.nextLine();

        // Melakukan login
        if (user.login(enteredUsername, enteredPassword)) {
            System.out.println("Login berhasil!");

            // Membuat objek SchedulePlanner dan ScheduleReminder
            SchedulePlanner schedulePlanner = new SchedulePlanner();
            ScheduleReminder scheduleReminder = new ScheduleReminder();

            // Menampilkan menu utama
            while (true) {
                System.out.println("\nMenu Utama:");
                System.out.println("1. Schedule Planner");
                System.out.println("2. Schedule Reminder");
                System.out.println("3. Lainnya");
                System.out.println("4. Keluar");

                System.out.print("Pilih menu: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline

                switch (choice) {
                    case 1:
                        // Schedule Planner
                        schedulePlanner.showMenu();
                        System.out.print("Pilih submenu Schedule Planner: ");
                        int plannerChoice = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan newline

                        switch (plannerChoice) {
                            case 1:
                                schedulePlanner.planKeuangan();
                                break;
                            case 2:
                                schedulePlanner.kesehatan();
                                break;
                            case 3:
                                schedulePlanner.investasi();
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                        break;

                    case 2:
                        // Schedule Reminder
                        scheduleReminder.showMenu();
                        System.out.print("Pilih submenu Schedule Reminder: ");
                        int reminderChoice = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan newline

                        switch (reminderChoice) {
                            case 1:
                                scheduleReminder.pengingatKesehatan();
                                break;
                            case 2:
                                scheduleReminder.olahraga();
                                break;
                            case 3:
                                scheduleReminder.jamIstirahat();
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                        break;

                    case 3:
                        // Lainnya
                        System.out.println("1. Setting");
                        System.out.println("2. Update Aplikasi");
                        System.out.println("3. Bantuan");

                        System.out.print("Pilih submenu Lainnya: ");
                        int otherChoice = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan newline

                        // Logika untuk submenu Lainnya
                        break;

                    case 4:
                        // Keluar
                        System.out.println("Terima kasih! Keluar dari aplikasi.");
                        System.exit(0);

                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }

        // Menutup Scanner
        scanner.close();
    }
}