package Phone;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneMain {
    public static void main(String[] args) {
        Phone wafi = new WafiPhone("wafi","+249967663750","ATG");
        wafi.call();
        wafi.call();
        wafi.text();
        wafi.text();
        wafi.showCallHistory();
        wafi.showTextHistory();
    }
}


class WafiPhone extends SimplePhone {

    public WafiPhone(String username, String phoneNumber, String serviceProvider) {
        super(username, phoneNumber, serviceProvider);
    }
}

interface Phone {
    void call();
    void text();
    void showCallHistory();
    void showTextHistory();
}

abstract class SimplePhone implements Phone {
    Scanner sc = new Scanner(System.in);
    String username;
    String phoneNumber;
    String serviceProvider;
    ArrayList<Call> callHistory;
    ArrayList<Text> textHistory;
    public SimplePhone(String username, String phoneNumber, String serviceProvider) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.serviceProvider = serviceProvider;
        callHistory = new ArrayList<Call>();
        textHistory = new ArrayList<Text>();
    }
    @Override
    public void call() {
        System.out.print("who do you want to call (enter name): ");
        String name = sc.nextLine();
        System.out.print("who do you want to call (enter number): ");
        String number = sc.nextLine();
        callHistory.add(new Call(name,number, (int)(Math.random()*20+1)));
    }

    @Override
    public void text() {
        System.out.print("who do you want to text (enter name): ");
        String name = sc.nextLine();
        System.out.print("who do you want to text (enter number): ");
        String number = sc.nextLine();
        System.out.print("Message: ");
        String message = sc.nextLine();
        textHistory.add(new Text(name,number,message));
    }

    @Override
    public void showCallHistory() {
        System.out.println();
        System.out.println("showing call history:");
        for (Call call : callHistory) {
            System.out.println(call);
        }
        System.out.println("-");
    }

    @Override
    public void showTextHistory() {
        System.out.println();
        System.out.println("showing text history:");
        for (Text text : textHistory) {
            System.out.println(text);
            System.out.println("-");
        }
    }
}
class Call {
    public String username, phoneNumber;
    public int callLength;
    public Call(String username, String phoneNumber, int callLength) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.callLength = callLength;
    }
    @Override
    public String toString() {
        return "caller name: " + username + ", phone number: " + phoneNumber + ", call length: " + callLength + " minutes";
    }
}
class Text{
    public String from,to,text;
    public Text(String from, String to, String text) {
        this.from = from;
        this.to = to;
        this.text = text;
    }
    @Override
    public String toString() {
        return "from: " + from + "\nto: " + to + "\n\ttext: " + text;
    }
}

//Create Interface and implement it via abstract class
//
//-> Create Phone Interface, it should have call, text, showCallHistory and showTextHistory functions.
//-> Create SimplePhone abstract classes and implement those functions. When you use call function it should ask who you want to call then should store it, if you text it should ask your text message and who you text with.
//
//-> Create YourNamePhone(HuseyinPhone) and inherit the SimplePhone and test your codes.
//
//NOTE: You can add related information or some necessary information to your classes.
//
//
//Deadline : 4.15pm

