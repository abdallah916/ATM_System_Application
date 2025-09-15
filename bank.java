package src;
import java.util.HashMap;
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner atm = new Scanner(System.in);
        String pincode;
        String card_number = "";
        user currentuser = null;
        boolean loggedIn = false;
        double depositAmount;
        double newb;
        double withdrawAmount;
        String targetCard;
        HashMap<String, user> user1 = new HashMap<>();

        user u1 = new user("Ahmed", "Cairo", "Engineer", "Deposit 1000", 5000.0, 22, "1111");
        user u2 = new user("Mona", "Giza", "Doctor", "Withdraw 200", 8000.0, 30, "2222");
        user u3 = new user("Omar", "Alex", "Teacher", "Deposit 1500", 12000.0, 28, "3333");
        user u4 = new user("Sara", "Luxor", "Nurse", "Withdraw 300", 6000.0, 26, "4444");
        user u5 = new user("Khaled", "Aswan", "Driver", "Deposit 700", 4500.0, 35, "5555");
        user u6 = new user("Laila", "Cairo", "Lawyer", "Deposit 2000", 20000.0, 32, "6666");
        user u7 = new user("Hassan", "Giza", "Engineer", "Withdraw 1000", 9000.0, 27, "7777");
        user u8 = new user("Nadia", "Alex", "Accountant", "Deposit 500", 7500.0, 29, "8888");
        user u9 = new user("Youssef", "Cairo", "Student", "Deposit 300", 2000.0, 20, "9999");
        user u10 = new user("Salma", "Cairo", "Pharmacist", "Deposit 1000", 11000.0, 31, "1010");

        user u11 = new user("Mahmoud", "Cairo", "Teacher", "Withdraw 400", 6500.0, 33, "1112");
        user u12 = new user("Aya", "Giza", "Designer", "Deposit 2500", 18000.0, 25, "1212");
        user u13 = new user("Mostafa", "Alex", "Engineer", "Deposit 3500", 22000.0, 40, "1313");
        user u14 = new user("Nour", "Cairo", "Doctor", "Withdraw 1200", 10000.0, 29, "1414");
        user u15 = new user("Hany", "Luxor", "Driver", "Deposit 600", 5000.0, 36, "1515");
        user u16 = new user("Dina", "Cairo", "Nurse", "Deposit 400", 3200.0, 24, "1616");
        user u17 = new user("Amr", "Aswan", "Engineer", "Withdraw 900", 7200.0, 28, "1717");
        user u18 = new user("Farida", "Giza", "Teacher", "Deposit 1300", 8900.0, 27, "1818");
        user u19 = new user("Ola", "Alex", "Doctor", "Deposit 1500", 13400.0, 34, "1919");
        user u20 = new user("Walid", "Cairo", "Lawyer", "Deposit 1800", 19500.0, 38, "2020");

        user u21 = new user("Eman", "Cairo", "Nurse", "Deposit 700", 5600.0, 26, "2121");
        user u22 = new user("Karim", "Giza", "Engineer", "Deposit 2200", 17000.0, 29, "2222");
        user u23 = new user("Huda", "Alex", "Designer", "Withdraw 800", 7600.0, 32, "2323");
        user u24 = new user("Samir", "Luxor", "Teacher", "Deposit 900", 6400.0, 45, "2424");
        user u25 = new user("Rana", "Cairo", "Student", "Deposit 200", 1500.0, 19, "2525");
        user u26 = new user("Tamer", "Aswan", "Driver", "Deposit 1000", 4800.0, 37, "2626");
        user u27 = new user("Esraa", "Giza", "Accountant", "Deposit 400", 6000.0, 28, "2727");
        user u28 = new user("Ibrahim", "Alex", "Engineer", "Withdraw 1200", 8300.0, 35, "2828");
        user u29 = new user("Mariam", "Cairo", "Doctor", "Deposit 3000", 25000.0, 30, "2929");
        user u30 = new user("Fady", "Cairo", "Lawyer", "Deposit 700", 7200.0, 33, "3030");

        user u31 = new user("Sherif", "Cairo", "Teacher", "Deposit 1200", 8500.0, 36, "3131");
        user u32 = new user("Yara", "Giza", "Pharmacist", "Deposit 900", 9600.0, 29, "3232");
        user u33 = new user("Magdy", "Alex", "Engineer", "Withdraw 500", 7200.0, 34, "3334");
        user u34 = new user("Layla", "Cairo", "Nurse", "Deposit 400", 3100.0, 27, "3434");
        user u35 = new user("Adel", "Luxor", "Lawyer", "Deposit 2000", 18000.0, 41, "3535");
        user u36 = new user("Noha", "Cairo", "Doctor", "Withdraw 1500", 12000.0, 30, "3636");
        user u37 = new user("Othman", "Giza", "Teacher", "Deposit 1600", 9100.0, 28, "3737");
        user u38 = new user("Rasha", "Aswan", "Accountant", "Deposit 700", 6500.0, 25, "3838");
        user u39 = new user("Fouad", "Alex", "Engineer", "Withdraw 1000", 8700.0, 39, "3939");
        user u40 = new user("Heba", "Cairo", "Designer", "Deposit 2500", 15000.0, 31, "4040");

        user u41 = new user("Tarek", "Giza", "Engineer", "Deposit 1400", 9900.0, 36, "4141");
        user u42 = new user("Malak", "Cairo", "Student", "Deposit 300", 1800.0, 20, "4242");
        user u43 = new user("Sameh", "Luxor", "Driver", "Deposit 800", 5600.0, 38, "4343");
        user u44 = new user("Nadine", "Cairo", "Teacher", "Withdraw 600", 7400.0, 29, "4445");
        user u45 = new user("Galal", "Aswan", "Doctor", "Deposit 2700", 21000.0, 44, "4545");
        user u46 = new user("Hossam", "Giza", "Engineer", "Withdraw 1200", 9600.0, 33, "4646");
        user u47 = new user("Manar", "Alex", "Nurse", "Deposit 500", 4200.0, 27, "4747");
        user u48 = new user("Mostafa", "Cairo", "Lawyer", "Deposit 1900", 17000.0, 40, "4848");
        user u49 = new user("Nermine", "Cairo", "Designer", "Deposit 2100", 16000.0, 26, "4949");
        user u50 = new user("Osama", "Giza", "Pharmacist", "Withdraw 1300", 11500.0, 37, "5050");

        user1.put("10000000000001", u1);
        user1.put("10000000000002", u2);
        user1.put("10000000000003", u3);
        user1.put("10000000000004", u4);
        user1.put("10000000000005", u5);
        user1.put("10000000000006", u6);
        user1.put("10000000000007", u7);
        user1.put("10000000000008", u8);
        user1.put("10000000000009", u9);
        user1.put("10000000000010", u10);
        user1.put("10000000000011", u11);
        user1.put("10000000000012", u12);
        user1.put("10000000000013", u13);
        user1.put("10000000000014", u14);
        user1.put("10000000000015", u15);
        user1.put("10000000000016", u16);
        user1.put("10000000000017", u17);
        user1.put("10000000000018", u18);
        user1.put("10000000000019", u19);
        user1.put("10000000000020", u20);
        user1.put("10000000000021", u21);
        user1.put("10000000000022", u22);
        user1.put("10000000000023", u23);
        user1.put("10000000000024", u24);
        user1.put("10000000000025", u25);
        user1.put("10000000000026", u26);
        user1.put("10000000000027", u27);
        user1.put("10000000000028", u28);
        user1.put("10000000000029", u29);
        user1.put("10000000000030", u30);
        user1.put("10000000000031", u31);
        user1.put("10000000000032", u32);
        user1.put("10000000000033", u33);
        user1.put("10000000000034", u34);
        user1.put("10000000000035", u35);
        user1.put("10000000000036", u36);
        user1.put("10000000000037", u37);
        user1.put("10000000000038", u38);
        user1.put("10000000000039", u39);
        user1.put("10000000000040", u40);
        user1.put("10000000000041", u41);
        user1.put("10000000000042", u42);
        user1.put("10000000000043", u43);
        user1.put("10000000000044", u44);
        user1.put("10000000000045", u45);
        user1.put("10000000000046", u46);
        user1.put("10000000000047", u47);
        user1.put("10000000000048", u48);
        user1.put("10000000000049", u49);
        user1.put("10000000000050", u50);

        System.out.println("Welcom");
        System.out.println("Enter 14 number on your card");
        card_number = atm.nextLine().trim();//  التريم تقوم بحذف اي مسافات اول واخر القيمه !! ولا تقوم بحذف اي مسافه داخل القيمه

        if (user1.containsKey(card_number)) {
            currentuser = user1.get(card_number);// روح شاور علي الرقم اللي بيحمله الكارد نمبر وهاتلي البايانات
                                                 // بتاعتهcurrentuser هنا انا بقول للاوبجيكت اللي اسمو
            for (int x = 0; x < 3; ++x) {
                System.out.println("Enter pin code");
                pincode = atm.nextLine();
                if (pincode.equals(currentuser.getpin())) {// هل الرقم اللي كتبه العميل = الرقم السري المخزون في البيانات
                                                           // الأوبجيكت اللي ماسكه currentuser؟
                    System.out.println("✅ Login Successful");
                    loggedIn = true; // ولو دخل البين كود صح احسب الفاريبل ده ب ترو
                    break;// اخرج من اللوب
                } else {
                    if (x < 2) {
                        System.out.println("❌ Wrong PIN, try again. Attempts left: " + (2 - x));
                    } else {
                        System.out.println("❌ Card blocked after 3 wrong attempts!");
                    }
                }
            }

        } else {
            System.out.println("❌ Card Number not found");
        }

        if (loggedIn) {// هنا لما الفاريبل الللي اسمو لوج إين يبق ب ترو شغل إيف دي
            boolean exitmenu = false;
            while (!exitmenu) {// دي هتفضل تشتغل طالما الاكسيت منيو ب فلس
                System.out.println("====== Main Menu ======");
                System.out.println("1.Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4.Transfer");
                System.out.println("5.Others");
                System.out.println("6. Exit");
                int choice;
                String choicestr = atm.nextLine().trim();
                try {
                    choice = Integer.parseInt(choicestr);
                } catch (NumberFormatException e) {
                    System.out.println("❌ Invalid input. Enter number 1-6.");
                    continue;
                }
                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to withdraw: ");
                        withdrawAmount = atm.nextDouble();
                        atm.nextLine(); // حل مشكلة تخطي الإدخال
                        if (withdrawAmount > currentuser.getbalance()) {
                            System.out.println("❌ Insufficient balance!");
                        } else {
                            currentuser.setbalance(currentuser.getbalance() - withdrawAmount);
                            System.out.println("✅ Withdrawal successful. New balance: " + currentuser.getbalance());
                        }
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        depositAmount = atm.nextDouble();
                        atm.nextLine(); // حل مشكلة تخطي الإدخال
                        newb = currentuser.getbalance() + depositAmount;
                        currentuser.setbalance(newb);
                        System.out.println("✅ Deposit successful. New balance: " + currentuser.getbalance());
                        break;
                    case 3:
                        System.out.println("📊 Your current balance: " + currentuser.getbalance());
                        currentuser.displayinfo();
                        break;
                    case 4:
                        System.out.print("Enter target card number: ");
                        targetCard = atm.nextLine();
                        if (user1.containsKey(targetCard)) {
                            System.out.print("Enter amount to transfer: ");
                            double transferAmount = atm.nextDouble();
                            atm.nextLine(); // حل مشكلة تخطي الإدخال
                            if (transferAmount <= currentuser.getbalance()) {
                                currentuser.setbalance(currentuser.getbalance() - transferAmount);
                                user targetUser = user1.get(targetCard);
                                targetUser.setbalance(targetUser.getbalance() + transferAmount);
                                System.out.println("✅ Transfer successful!");
                            } else {
                                System.out.println("❌ Insufficient balance for transfer!");
                            }
                        } else {
                            System.out.println("❌ Target card not found!");
                        }
                        break;
                    case 5:
                        System.out.print("Enter new PIN: ");
                        String newPin = atm.nextLine();
                        currentuser.setpin(newPin);
                        System.out.println("✅ PIN changed successfully.");
                        break;
                    case 6:
                        System.out.println("👋 Thank you for using our ATM!");
                        exitmenu = true;
                        break;
                    default:
                        System.out.println("❌ Invalid option, try again.");
                        break;
                }

            }

        }
        atm.close();

    }
}
