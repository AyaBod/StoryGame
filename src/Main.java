import java.util.*;
public class Main {
    public static void main(String[] args) {
        //declare starting variable
        int bank = 0;
        int ansN;
        //create scanner objects; one for strings and one for integers
        Scanner input = new Scanner(System.in);
        Scanner Scan = new Scanner(System.in);
        System.out.println("When answering, use the first word of names, actions, or if prompt specifies");
        System.out.println("");
        //start of actual game; will return to starting path if wrong answer is imputed for first two paths
        while(true) {
            //ask which direction/cafe they want to go to
            System.out.println("Welcome to The Boiling Isles! Instead of standing in the middle of the road, how about we head to a cafe. \n We can go to North Nibbles, East Eatery, South Soup, or West Whipped Treats; which one do you want to go to? ");
            String ans = input.nextLine();
            //if north is chosen then next path is to order food
            if (ans.equals("North") || ans.equals("north")) {
                System.out.println("You made a nice choice! Let's go!");
                System.out.println("        (\n" +
                        "          )\n" +
                        "     __..---..__\n" +
                        " ,-='  /  |  \\  `=-.\n" +
                        ":--..___________..--;\n" +
                        " \\.,_____________,./");
                System.out.println("You made a nice choice! Let's go!");
                //ask for food that matches first letter of cafe name
                System.out.println("Now that we're here, here's the menu. Yeah, all the food items start with the letter N. What do you want to eat?");
                String food = input.nextLine();
                //check if first letter is correct, if not then restart
                String ff = food.substring(0, 1);
                if (ff.equals("n") || ff.equals("N")) {
                    System.out.println("That sounds yummy! Let's find out how much it is.");
                    //random price is given
                    int amt = randomNum();
                    //money game starts, answer math problems to get money
                    while (bank < amt) {
                        System.out.println("You only have " + bank + " dollar(s)");
                        System.out.println(" ");
                        System.out.println("Complete math problems to get money. The harder the level, the more money there is.");
                        System.out.println("Choose problem difficulty: easy, medium, or hard");
                        ans = input.nextLine();
                        //easy level
                        if (ans.equals("easy") || ans.equals("Easy")) {
                            int exp = easy();
                            if (exp == 5) {
                                do {
                                    System.out.print("What is 14-9: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 5);
                                bank = bank + 1;
                            } else {
                                do {
                                    System.out.print("What is 392-386: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 6);
                                bank = bank + 1;
                            }
                        //medium level
                        } else if (ans.equals("medium") || ans.equals("Medium")) {
                            int exp = medium();
                            if (exp == 13) {
                                do {
                                    System.out.print("What is 143/11: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 13);
                                bank = bank + 2;
                            } else {
                                do {
                                    System.out.print("What is 126/9: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 14);
                                bank = bank + 2;
                            }
                        //hard level
                        } else {
                            int exp = hard();
                            if (exp == 19) {
                                do {
                                    System.out.print("What is the square root of 361: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 19);
                                bank = bank + 3;
                            } else {
                                do {
                                    System.out.print("What is the square root of 441: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 21);
                                bank = bank + 3;
                            }
                        }
                    }
                    //shows bank money and if you can pay or not
                    System.out.println("You have "+ bank + " dollar(s)");
                    System.out.print("Yay, you can buy your " + food + "! Enjoy! ");
                    break;
                } else {
                    System.out.println("Please type a food that starts with the letter N next time.");
                }
            //if west is chosen then next path is to order food
            } else if (ans.equals("West") || ans.equals("west")) {
                System.out.println("      _\n" +
                        "        /> //  __\n" +
                        "    ___/ \\// _/ /\n" +
                        "  ,' , \\_/ \\/ _/__\n" +
                        " /    _/ |--\\  `  `~,\n" +
                        "' , ,/  /`\\ / `  `   `,\n" +
                        "|    |  |  \\> `  `  ` |\n" +
                        "|  ,  \\/ ' '    `  `  /\n" +
                        "`,   '  '    ' `  '  /\n" +
                        "  \\ `      '  ' ,  ,'\n" +
                        "   \\ ` ` '    ,  ,/\n" +
                        "    `,  `  '  , ,'\n" +
                        "      \\ `  ,   /        \n" +
                        "       `~----~'");
                System.out.println("Nice, let's go!");
                System.out.println("Now that we're here, here's the menu. Yeah, all the food items start with the letter W. What do you want to eat?");
                //ask for food that matches first letter of cafe name
                String food = input.nextLine();
                //check if first letter is correct, if not then restart
                String ff = food.substring(0, 1);
                if (ff.equals("w") || ff.equals("W")) {
                    System.out.println("Yum, let's find out how much it is.");
                    //random price is given to the food
                    int amt = randomNum();
                    //money game starts, answer math problems to get money
                    while (bank < amt) {
                        System.out.println("You only have " + bank + " dollar(s)");
                        System.out.println(" ");
                        System.out.println("Complete math problems to get money");
                        System.out.println("Choose problem difficulty: easy, medium, or hard");
                        ans = input.nextLine();
                        //easy level
                        if (ans.equals("easy") || ans.equals("Easy")) {
                            int exp = easy();
                            if (exp == 5) {
                                do {
                                    System.out.print("What is 14-9: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 5);
                                bank = bank + 1;
                            } else {
                                do {
                                    System.out.print("What is 392-386: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 6);
                                bank = bank + 1;
                            }
                        //medium level
                        } else if (ans.equals("medium") || ans.equals("Medium")) {
                            int exp = medium();
                            if (exp == 13) {
                                do {
                                    System.out.print("What is 143/11: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 13);
                                bank = bank + 2;
                            } else {
                                do {
                                    System.out.print("What is 126/9: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 14);
                                bank = bank + 2;
                            }
                        //hard level
                        } else {
                            int exp = hard();
                            if (exp == 19) {
                                do {
                                    System.out.print("What is the square root of 361: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 19);
                                bank = bank + 3;
                            } else {
                                do {
                                    System.out.print("What is the square root of 441: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 21);
                                bank = bank + 3;
                            }
                        }
                    }
                    //shows bank money and if you can pay or not
                    System.out.println("You have "+ bank + " dollar(s)");
                    System.out.print("Yay, you can buy your " + food + "! Enjoy! ");
                    break;
                } else {
                    System.out.println("Please type a food that starts with the letter W next time.");
                }
            //if south is chosen then next path is to order food
            } else if (ans.equals("South") || ans.equals("south")) {
                System.out.println("   (\\\n" +
                        "     \\ \\\n" +
                        " __    \\/ ___,.-------..__        __\n" +
                        "//\\\\ _,-'\\\\               `'--._ //\\\\\n" +
                        "\\\\ ;'      \\\\                   `: //\n" +
                        " `(          \\\\                   )'\n" +
                        "   :.          \\\\,----,         ,;\n" +
                        "    `.`--.___   (    /  ___.--','\n" +
                        "      `.     ``-----'-''     ,'\n" +
                        "         -.               ,-\n" +
                        "            `-._______.-'");
                System.out.println("Nice, let's go!");
                //ask for food that matches first letter of cafe name
                System.out.println("Now that we're here, here's the menu. Yeah, all the food items start with the letter S. What do you want to eat?");
                String food = input.nextLine();
                //check if first letter is correct, if not then restart
                String ff = food.substring(0, 1);
                if (ff.equals("s") || ff.equals("S")) {
                    System.out.println("Yum, let's find out how much it is.");
                    //random price is given to the food
                    int amt = randomNum();
                    //money game starts, answer math problems to get money
                    while (bank < amt) {
                        System.out.println("You only have " + bank + " dollar(s)");
                        System.out.println(" ");
                        System.out.println("Complete math problems to get money");
                        System.out.println("Choose problem difficulty: easy, medium, or hard");
                        ans = input.nextLine();
                        // easy level
                        if (ans.equals("easy") || ans.equals("Easy")) {
                            int exp = easy();
                            if (exp == 5) {
                                do {
                                    System.out.print("What is 14-9: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 5);
                                bank = bank + 1;
                            } else {
                                do {
                                    System.out.print("What is 392-386: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 6);
                                bank = bank + 1;
                            }
                        //medium level
                        } else if (ans.equals("medium") || ans.equals("Medium")) {
                            int exp = medium();
                            if (exp == 13) {
                                do {
                                    System.out.print("What is 143/11: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 13);
                                bank = bank + 2;
                            } else {
                                do {
                                    System.out.print("What is 126/9: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 14);
                                bank = bank + 2;
                            }
                        //hard level
                        } else {
                            int exp = hard();
                            if (exp == 19) {
                                do {
                                    System.out.print("What is the square root of 361: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 19);
                                bank = bank + 3;
                            } else {
                                do {
                                    System.out.print("What is the square root of 441: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 21);
                                bank = bank + 3;
                            }
                        }
                    }
                    //shows bank money and if you can pay or not
                    System.out.println("You have "+ bank + " dollar(s)");
                    System.out.print("Yay, you can buy your " + food + "! Enjoy! ");
                    break;
                } else {
                    System.out.println("Please type a food that starts with the letter S next time.");
                }
            //if east is chosen then next path is to order food
            } else if (ans.equals("East") || ans.equals("east")) {
                System.out.println("        _....._\n" +
                        "    _.:`.--|--.`:._\n" +
                        "  .: .'\\o  | o /'. '.\n" +
                        " // '.  \\ o|  /  o '.\\\n" +
                        "//'._o'. \\ |o/ o_.-'o\\\\\n" +
                        "|| o '-.'.\\|/.-' o   ||\n" +
                        "||--o--o-->|");
                System.out.println("You made a nice choice! Let's go!");
                //ask for food that matches first letter of cafe name
                System.out.println("Now that we're here, here's the menu. Yeah, all the food items start with the letter E. What do you want to eat?");
                String food = input.nextLine();
                //check if first letter is correct, if not then restart
                String ff = food.substring(0, 1);
                if (ff.equals("e") || ff.equals("E")) {
                    System.out.println("Yum, let's find out how much it is.");
                    //random price is given to the food
                    int amt = randomNum();
                    //money game starts, answer math problems to get money
                    while (bank < amt) {
                        System.out.println("You only have " + bank + " dollar(s)");
                        System.out.println(" ");
                        System.out.println("Complete math problems to get money");
                        System.out.println("Choose problem difficulty: easy, medium, or hard");
                        ans = input.nextLine();
                        // easy level
                        if (ans.equals("easy") || ans.equals("Easy")) {
                            int exp = easy();
                            if (exp == 5) {
                                do {
                                    System.out.print("What is 14-9: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 5);
                                bank = bank + 1;
                            } else {
                                do {
                                    System.out.print("What is 392-386: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 6);
                                bank = bank + 1;
                            }
                        //medium level
                        } else if (ans.equals("medium") || ans.equals("Medium")) {
                            int exp = medium();
                            if (exp == 13) {
                                do {
                                    System.out.print("What is 143/11: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 13);
                                bank = bank + 2;
                            } else {
                                do {
                                    System.out.print("What is 126/9: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 14);
                                bank = bank + 2;
                            }
                        //hard level
                        } else {
                            int exp = hard();
                            if (exp == 19) {
                                do {
                                    System.out.print("What is the square root of 361: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 19);
                                bank = bank + 3;
                            } else {
                                do {
                                    System.out.print("What is the square root of 441: ");
                                    ansN = Scan.nextInt();
                                } while (ansN != 21);
                                bank = bank + 3;
                            }
                        }
                    }
                    //shows bank money and if you can pay or not
                    System.out.println("You have "+ bank + " dollar(s)");
                    System.out.print("Yay, you can buy your " + food + "! Enjoy! ");
                    break;
                } else {
                    System.out.println("Please type a food that starts with the letter E next time.");
                }
            } else {
                System.out.println("Please enter a direction (first name of place :D )");
            }
        }
    }

    //creates the random price for the food the customer orders
    public static int randomNum(){
        int num = (int)(Math.random()*10 + 1);
        System.out.println("You owe " + num + " dollars.");
        return num;
    }

    //randomly gives an expected answer for the easy questions
    public static int easy(){
        int num = (int)(Math.random()*2);
        if (num == 0){
            return 6;
        } else {
            return 5;
        }

    }

    //randomly gives an expected answer for the medium questions
    public static int medium(){
        int num = (int)(Math.random()*2);
        if (num == 0){
            return 14;
            // 126/9
        } else {
            return 13;
            //143/11
        }
    }

    //randomly gives an expected answer for the hard questions
    public static int hard(){
        int num = (int)(Math.random()*2);
        if (num == 0){
            return 21;
        } else {
            return 19;
        }


    }
}