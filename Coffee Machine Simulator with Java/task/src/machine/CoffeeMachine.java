package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static int availableWater = 400;
    private static int availableMilk = 540;
    private static int availableBeans = 120;
    private static int amountOfCoffeeCups = 9;
    private static int amountOfMoney = 550;
    private static boolean isExit = false;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        while (!isExit) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            machine.readInputAction(sc.next());
        }
    }

    public void readInputAction(String inputAction) {
        switch (inputAction) {
            case "buy": {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String input = sc.next();
                if (resourceCheck(input) && !input.equals("back")) {
                    buyAction(input);
                    System.out.println("I have enough resources, making you a coffee!\n");
                }

                if (!resourceCheck(input)){
                    System.out.println("Sorry, not enough ingredients!");
                }
                break;
            }
            case "fill":
                fillAction();
                break;
            case "take":
                takeAction();
                break;
            case "remaining":
                printStatistics();
                break;
            case "exit":
                isExit = true;
                break;
            default:
                System.out.println("Can you try it again?");
                break;

        }
    }

    private void takeAction() {
        System.out.printf("I gave you $%d\n", amountOfMoney);
        amountOfMoney = 0;
    }

    private void buyAction(String inputOption) {
        switch (inputOption) {
            case "1":
                availableWater -= 250;
                availableBeans -= 16;
                amountOfCoffeeCups--;
                amountOfMoney += 4;
                break;
            case "2":
                availableWater -= 350;
                availableMilk -= 75;
                availableBeans -= 20;
                amountOfCoffeeCups--;
                amountOfMoney += 7;
                break;
            case "3":
                availableWater -= 200;
                availableMilk -= 100;
                availableBeans -= 12;
                amountOfCoffeeCups--;
                amountOfMoney += 6;
                break;
            default: {
                System.out.println("Can you try it again?");
                break;
            }
        }
    }

    private void fillAction() {
        System.out.println("Write how many ml of water you want to add:");
        availableWater += sc.nextInt(); // 200 ml per one coffee
        System.out.println("Write how many ml of milk you want to add:");
        availableMilk += sc.nextInt(); // 50 ml per one coffee
        System.out.println("Write how many grams of coffee beans you want to add:");
        availableBeans += sc.nextInt(); // 15 g per one coffee
        System.out.println("Write how many disposable cups you want to add:");
        amountOfCoffeeCups += sc.nextInt();
        System.out.println("\n");
    }

    private boolean resourceCheck(String coffeeType) {
        switch (coffeeType) {
            case "1": {
                return availableWater >= 250 && availableBeans >= 16 && amountOfCoffeeCups > 1;
            }
            case "2": {
                return availableWater >= 350 && availableMilk >= 75 && availableBeans >= 20 && amountOfCoffeeCups > 1;
            }
            case "3":{
                return availableWater >= 200 && availableMilk >= 100 && availableBeans >= 12 && amountOfCoffeeCups > 1;
            }
            default:
                return false;
        }
    }

    private void printStatistics() {
        System.out.printf("""
                The coffee machine has:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                %d disposable cups
                $%d of money
                
                """, availableWater, availableMilk, availableBeans, amountOfCoffeeCups, amountOfMoney);
    }
}

