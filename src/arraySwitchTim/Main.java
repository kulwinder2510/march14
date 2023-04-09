package arraySwitchTim;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TimItem[] titem = new TimItem[100];
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();

        int counter = 0;
        double price = 0.0;

        for (int i = 0; i < titem.length; i++) {
            System.out.println("Please give your input\n1. Tim Merchendise\n2. Tim Consumable\n3. Done Ordering");
            if (choice == 1) {
                System.out.println("1. Mugs \n2. Coffee Powder \n3. Gift Cards \n4. Hockey Cards");
                switch (choice) {
                    case 1:
                        Mugs mugs = new Mugs();
                        System.out.println("Name: " + mugs.toString());
                        System.out.println("Features: " + mugs.getFeature());
                        System.out.println("\n Please enter choice \n1. Order this \n2. Choose again");
                        if (choice == 1) {
                            titem[i] = new Mugs();
                            counter++;
                            break;
                        }
                        if (choice == 2) {
                            break;
                        }
                    case 2:
                        CoffeePowder cofeepowder = new CoffeePowder();
                        System.out.println("Name: " + cofeepowder.toString());
                        System.out.println("Features: " + cofeepowder.getFeature());
                        System.out.println("\n Please enter choice \n1. Order this \n2. Choose again");

                        if (choice == 1) {
                            titem[i] = new CoffeePowder();
                            counter++;
                            break;
                        }
                        if (choice == 2) {
                            break;
                        }
                    case 3:
                        GiftCards giftcards = new GiftCards();
                        System.out.println("Name: " + giftcards.toString());
                        System.out.println("Features: " + giftcards.getFeature());

                        System.out.println("\n Please enter choice \n1. Order this \n2. Choose again");
                        if(choice == 1) {
                            titem[i] = new GiftCards();
                            counter++;
                            break;
                        }
                        if (choice == 2) {
                            break;
                        }
                    default:
                        System.out.println("please select again");
                        break;
                }
            } else if (choice == 2) {
                System.out.println("1. Donut \n2. Bagel \n3. Coffee \n4. Wrap \n5. Sandwich");
                switch (choice) {
                    case 1:
                        Donut donut = new Donut();
                        System.out.println("Name: " + donut.toString());
                        System.out.println("Features: " + donut.getCalorie());
                        System.out.println("\n Please enter choice \n1. Order this \n2. Choose again");
                        if (choice == 1) {
                            titem[i] = new Donut();
                            counter++;
                            break;
                        }
                        if (choice == 2) {
                            break;
                        }
                    case 2:
                        Bagel bagel = new Bagel();
                        System.out.println("Name: " + bagel.toString());
                        System.out.println("Features: " + bagel.getCalorie());
                        System.out.println("\n Please enter choice \n1. Order this \n2. Choose again");
                        if (choice == 1) {
                            titem[i] = new Bagel();
                            counter++;
                            break;
                        }
                        if (choice == 2) {
                            break;
                        }
                    case 3:
                        Coffee coffee = new Coffee();
                        System.out.println("Name: " + coffee.toString());
                        System.out.println("Features: " + coffee.getCalorie());
                        System.out.println("\n Please enter choice \n1. Order this \n2. Choose again");
                        if (choice == 1) {
                            titem[i] = new Coffee();
                            counter++;
                            break;
                        }
                        if (choice == 2) {
                            break;
                        }
                    case 4:
                        Wrap wrap = new Wrap();
                        System.out.println("Name: " + wrap.toString());
                        System.out.println("Features: " + wrap.getCalorie());
                        System.out.println("\n Please enter choice \n1. Order this \n2. Choose again");
                        if (choice == 1) {
                            titem[i] = new Wrap();
                            counter++;
                            break;
                        }
                        if (choice == 2) {
                            break;
                        }
                    case 5:
                        Sandwich sandwich = new Sandwich();
                        System.out.println("Name: " + sandwich.toString());
                        System.out.println("Features: " + sandwich.getCalorie());
                        System.out.println("\n Please enter choice \n1. Order this \n2. Choose again");
                        if (choice == 1) {
                            titem[i] = new Sandwich();
                            counter++;
                            break;
                        }
                        if (choice == 2) {
                            break;
                        }
                        if (choice == 3) {
                            System.out.println("thanks for ordering");
                        }
                    default:
                        System.out.println("please select again");
                        break;
                }
            } else  {
                System.out.println("order completed");
                break;
            }
            for (int j = 0; j < counter; j++) {
                price = price + titem[i].getPrice();
                if (titem[i] instanceof Mugs) {
                    System.out.println("Item : Mug " + "Price : " +titem[i].getPrice()+"$");
                } else if (titem[i] instanceof CoffeePowder) {
                    System.out.println("Item : Coffee Powder " + "Price : " +titem[i].getPrice()+"$");
                } else if (titem[i] instanceof GiftCards) {
                    System.out.println("Item : Gift Cards " + "Price : " +titem[i].getPrice()+"$");
                } else if (titem[i] instanceof Donut) {
                    System.out.println("Item : Donut " + "Price : " +titem[i].getPrice()+"$");
                } else if (titem[i] instanceof Bagel) {
                    System.out.println("Item : Bagel " + "Price : " +titem[i].getPrice()+"$");
                } else if (titem[i] instanceof Coffee) {
                    System.out.println("Item : Coffee " + "Price : " +titem[i].getPrice()+"$");
                } else if (titem[i] instanceof Wrap) {
                    System.out.println("Item : Wrap " + "Price : " +titem[i].getPrice()+"$");
                } else if (titem[i] instanceof Sandwich) {
                    System.out.println("Item : Sandwich " + "Price : " +titem[i].getPrice()+"$");
                } else {

                }
                System.out.println("*********************");
                System.out.println("\nTotal ordered items= \n" + counter);
                System.out.println("\n***********************\n");
                System.out.println("Total Amount :" + price);
                System.out.println("\n***********************\n");
                System.out.println("### YOU HAVE BALANCE OF $" + price + "IN WALLET ###");
                System.out.println("please enter 12 digit credit card number");
            }
        }
    }
}

