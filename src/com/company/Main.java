package com.company;

import javax.swing.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static boolean isFinish = true;
    private static int[] arr = new int[]{1, 1, 1};

    public static void main(String[] args) throws IOException, ParseException {

        Budget budget = new Budget();
        Business business = new Business();
        Gaming gaming = new Gaming();

        System.out.println("\tMENU\n№1 Gaming\n№2 Budget\n№3 Business\n№4 print\n№5 exit");
        Scanner in = new Scanner(System.in);
        while (isFinish) {
            System.out.print("Enter number: ");
            String _nameClass = in.next();


            if(_nameClass.equals("2"))
            {
                budget = (Budget) createObject(_nameClass);
            }
            else if(_nameClass.equals("3"))
            {
                business = (Business) createObject(_nameClass);
            }
            else if(_nameClass.equals("1"))
            {
                gaming = (Gaming) createObject(_nameClass);
            }
            else if(_nameClass.equals("4"))
            {
                budget.print();
                business.print();
                gaming.print();
            }
            else if(_nameClass.equals("5"))
            {
                isFinish = false;
            }
            else System.out.println("You entered the wrong laptop class name !!!");

        }



    }


    public static Laptop createObject(String _nameClass)
    {
        Gaming gaming;
        Budget budget;
        Business business;
        switch (_nameClass) {
            case "1" -> {
                if(arr[0] > 0) {
                    gaming = new Gaming("Asus Tuf Gaming", "FX505DD", "DOS", "Taiwan", "Asus", "level_IPS", 15.7, "FullHD", "120Hz", "AMD Ryzen 5 3550H", 8, "HDD", 1000, "GeForce GTX 1050", "Discrete", 3, "1x USB 2.0 Type-A. 2x USB 3.2 Gen 1 Type-A//1x 3.5mm Combo Audio Jack. 1x HDMI 2.0.", "Wi-Fi 5 (802.11ac), Bluetooth", "no", "yes", "yes", "yes", 4140, 14, "Laptop, charger, manual", 1.75, ColorNewLaprtom.BLACK, "yes", "yes", "RGB");
                    System.out.println("Object created!");
                    arr[0] = 0;
                    return gaming;
                }
                else
                    System.out.println("An object of this type has been created!");
            }
            case "2" -> {
                if(arr[1] > 0) {
                    budget = new Budget("ACER ASPIRE 3", "A315-22 A441TUN", "Windows 10 Home", "China", "Acer", "LED", 15.7, "HD", "60Hz", "AMD A4-9120e", 2, "HDD", 500, "AMD", "Built in", 2, "1x USB 2.0 Type-A. 2x USB // 1x HDMI 2.0.", "Wi-Fi 5 (802.11ac)", "no", "no", "yes", "yes", 4840, 8, "Laptop, charger, manual", 1.94, ColorNewLaprtom.AQUA, "yes");
                    System.out.println("Object created!");
                    arr[1] = 0;
                    return budget;
                }
                else
                    System.out.println("An object of this type has been created!");
            }
            case "3" -> {
                if(arr[2] > 0) {
                    business = new Business("LENOVO IDEAPAD 3", "I581TMW", "Linux Ment", "China", "Lenovo", "TN", 15.6, "FullHD+", "60Hz", "Intel® Core™ i5-10210U", 8, "SSD", 550, "nVidia GeForce MX", "Discrete", 2, "4-in-1 card reader x 1; 1 USB 2.0 port;", "WLAN 11ac. Bluetooth: 5.0.", "no", "no", "yes", "yes", 3560, 10, "Laptop, charger, manual", 1.85, ColorNewLaprtom.BLUE, "yes","yes");
                    System.out.println("Object created!");
                    arr[2] = 0;
                    return business;
                }
                else
                    System.out.println("An object of this type has been created!");
            }
            default -> System.out.println("You entered the wrong laptop class name !!!");
        }
        return null;
    }

}
