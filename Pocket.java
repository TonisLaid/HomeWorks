package AmirEric0613.dogAndPocket;
import java.util.Scanner;

public class Pocket {
    // Add field „ money ”, create constructor , getter and setter
    private Integer money;

    // Add verification for both getter and setter. Getter should result in returning as much
    //money, as the user asked for. It should return 0 if money <=10.
    public Integer getMoney(int money) {
        if (money<=10){
            return 0;}
        return money;
    }

    // Setter should not accept values below 0 and greater than 3000. It may print a message
    //like „I don’t have enough space in my pocket for as much money
    public void setMoney(Integer money) {
        if (money > 0 && money < 3000){
        this.money = money;}
        System.out.println("I don’t have enough space in my pocket for as much money");
    }
}
