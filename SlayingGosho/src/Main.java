import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);


        System.out.println("SLAYING GOSHO THE DRAGON");
        wait(2000);
        System.out.println("Welcome hero! Tell me, what is your name?");

        String playerName = scan.next();

        System.out.println("Welcome, " + playerName + " to this humble adventure!");
        wait(3000);

        System.out.println("Today, you embark on a quest to slay a dragon and claim its treasure as your own!");
        wait(5000);

        System.out.println("Let's get started!");
        wait(1000);

        System.out.println("As you enter the cave, you check your bag. Good thing you took your handy-dandy sword along! You also have two Health potions.");
        wait(5000);


        int healthPotion = 2;
        int playerHP = 100;
        String action;

        System.out.println("Venturing into the cave, you come upon a dimly lit hall, a whole pig skewered over a fire in the hall's center.");
        wait(5000);

        System.out.println("And sitting next to the fire, an Ogre!");
        wait(3000);

        System.out.println("Oh, no! The Ogre has noticed you! Draw your sword! Time to fight!");
        wait(4500);

        System.out.println("You can attack by typing the name of the weapon you want to use.");
        wait(4500);

        System.out.println("If your health is low, you can use a Health potion by typing 'pot'.");
        wait(4500);

        int ogreHP = 100;
        while (ogreHP > 0) {

            System.out.println("What would you like to do?");

            action = scan.next();

            if (action.equals("pot") && healthPotion > 0) {
                playerHP = 100;
                healthPotion = healthPotion - 1;
                continue;
            } else if (healthPotion <= 0 && action.equals("pot")) {
                System.out.println("You're out of health potions!");
                continue;
            } else if (action.equals("sword")) {
                ogreHP = damageCalc(action, ogreHP);
                if (ogreHP > 0) {
                System.out.println("The Ogre has " + ogreHP + " health left!");
                } else {
                    System.out.println("The Ogre has been slain!");
                    wait(3000);
                    break;
                }
            } else {
                System.out.println("This is not a valid choice! I ask again: What would you like to do?");
                continue;
            }
            wait(2000);

            playerHP = playerHP - 15;
            System.out.println("The Ogre attacks! You have " + playerHP + " health left!");
            wait(2000);
        }

        System.out.println("Good job! As the Ogre falls to ground, it drops its axe! You pick it up and can now use it in combat!");
        wait(5000);

        System.out.println("Rummaging through the Ogre's coffer, you also find a health potion!");
        wait(4000);

        healthPotion = healthPotion + 1;

        System.out.println("You continue down the cave system. Before long you come upon a great gate!");
        wait(4000);

        System.out.println("Guarding the gate is a Black Knight! He sees you and draws a heavy, rusted blade!");
        wait(5000);

        System.out.println("'None shall enter the lair of my master, the mighty dragon, Gosho!");
        wait(4000);

        System.out.println("The Black Knight attacks! Prepare yourself!");
        wait(3000);

        int blackKnightHp = 200;
        while (blackKnightHp > 0) {
            System.out.println("What would you like to do?");
            action = scan.next();

            if (action.equals("pot") && healthPotion > 0) {
                playerHP = 100;
                healthPotion = healthPotion - 1;
                continue;
            } else if (healthPotion <= 0 && action.equals("pot")) {
                System.out.println("You're out of health potions!");
                continue;
            } else if (action.equals("sword") || action.equals("axe")) {
                blackKnightHp = damageCalc(action, blackKnightHp);
                if (blackKnightHp > 0) {
                    System.out.println("The Black Knight has " + blackKnightHp + " health left!");
                } else {
                    System.out.println("The Black Knight has been slain!");
                    wait(3000);
                    break;
                }
            } else {
                    System.out.println("This is not a valid choice! I ask again: What would you like to do?");
                    continue;
            }

            playerHP = playerHP - 20;
            if (playerHP <= 0) {
                System.out.println("The Black Knight attacks! You scream as his blade plunges into your heart. You fall to your knees as everything goes black...");
                System.out.println("GAME OVER!");
                System.exit(0);
            }
            wait(2000);
            System.out.println("The Black Knight attacks! You have " + playerHP + " health left!");
            wait(2000);
        }

        System.out.println("Very well done! Nearby is a chest in which you find a bow, some arrows and another health potion!");
        wait(4000);

        healthPotion = healthPotion + 1;

        System.out.println("The time has come. Beyond the gate lies Gosho! The mighty fire-breathing dragon!");
        wait(4000);

        System.out.println("With all your might, you push open the heavy metal gate.");
        wait(4000);

        System.out.println("Atop a veritable mountain of golden coins, jewels and other treasures lies Gosho, the dreaded dragon!");
        wait(4000);

        System.out.println("It would seem the sound of the heavy gate opening has stirred him from his slumber!");
        wait(4000);

        System.out.println("'Who dares wake Gosho, the dread?! Who dares interrupt my nap?!' The dragon's ire-brimming eyes fixate on you!");
        wait(4000);

        System.out.println("'YOU! Foolish mortal! You have come for my treasure! But you shall end as my snack!'");
        wait(4000);

        System.out.println("Get ready! GOSHO, the horrid attacks!");
        wait(4000);

        System.out.println(" <>=======()");
        System.out.println("(/\\___   /|\\\\          ()==========<>_");
        System.out.println("      \\_/ | \\\\        //|\\   ______/ \\)");
        System.out.println("        \\_|  \\\\      // | \\_/");
        System.out.println("          \\|\\/|\\_   //  /\\/");
        System.out.println("           (oo)\\ \\_//  /");
        System.out.println("          //_/\\_\\/ /  |");
        System.out.println("         @@/  |=\\  \\  |");
        System.out.println("              \\_=\\_ \\ |");
        System.out.println("                \\==\\ \\|\\_");
        System.out.println("             __(\\===\\(  )\\");
        System.out.println("            (((~) __(_/   |");
        System.out.println("                 (((~) \\  /");
        System.out.println("                 ______/ /");
        System.out.println("                 '------'");


        int dragonHp = 400;
        while (dragonHp >= 200) {
            System.out.println("What would you like to do?");
            action = scan.next();

            if (action.equals("pot") && healthPotion > 0) {
                playerHP = 100;
                healthPotion = healthPotion - 1;
                continue;
            } else if (healthPotion <= 0 && action.equals("pot")) {
                System.out.println("You're out of health potions!");
                continue;
            } else if (action.equals("sword") || action.equals("axe") || action.equals("bow")) {
                dragonHp = damageCalc(action, dragonHp);
                if (dragonHp >= 200) {
                    System.out.println("GOSHO, the Dragon has " + dragonHp + " health left!");
                } else {
                    System.out.println("GOSHO, the Dragon has " + dragonHp + " health left!");
                    wait(3000);
                    System.out.println("GOSHO, the Dragon flies up into the air, out of reach of your melee weapons!");
                    wait(3000);
                    break;
                }
            } else {
                System.out.println("This is not a valid choice! I ask again: What would you like to do?");
                continue;
            }

            playerHP = playerHP - 25;
            if (playerHP <= 0) {
                System.out.println("GOSHO, the Dragon attacks! Fire engulfs you and you can feel your very flesh melting!");
                System.out.println("GAME OVER!");
                System.exit(0);
            }
            wait(2000);
            System.out.println("GOSHO, the Dragon attacks! You have " + playerHP + " health left!");
            wait(2000);
        }
        while (dragonHp > 0) {
            System.out.println("What would you like to do?");
            action = scan.next();

            if (action.equals("pot") && healthPotion > 0) {
                playerHP = 100;
                healthPotion = healthPotion - 1;
                continue;
            } else if (healthPotion <= 0 && action.equals("pot")) {
                System.out.println("You're out of health potions!");
                continue;
            } else if (action.equals("bow")) {
                dragonHp = damageCalc(action, dragonHp);
                if (dragonHp >= 0) {
                    System.out.println("GOSHO, the Dragon has " + dragonHp + " health left!");
                } else {
                    System.out.println("GOSHO, the Dragon has been slain!!!");
                    wait(3000);
                    break;
                }
            } else if (action.equals("sword") || action.equals("axe")) {
                System.out.println("Melee weapons have no effect on GOSHO while he's airborne!");
            } else {
                System.out.println("This is not a valid choice! I ask again: What would you like to do?");
                continue;
            }

            playerHP = playerHP - 25;
            if (playerHP <= 0) {
                System.out.println("GOSHO, the Dragon attacks! Fire engulfs you and you can feel your very flesh melting!");
                System.out.println("GAME OVER!");
                System.exit(0);
            }
            wait(2000);
            System.out.println("GOSHO, the Dragon attacks! You have " + playerHP + " health left!");
            wait(2000);

        }

        System.out.println("It is done! The mighty dragon lies dead and his treasure is yours!");
        wait(4000);
        System.out.println("CONGRATULATIONS! YOU WIN!");

    }

    static int damageCalc (String weapon, int hp) {
        Random RNGDmg = new Random();
        int hpLeft = hp;
        switch (weapon) {
            case ("sword"):
                hpLeft = hp - (30 + RNGDmg.nextInt(10));
                break;

            case ("axe"):
                hpLeft = hp - (20 + RNGDmg.nextInt(50));
                break;

            case ("bow"):
                hpLeft = hp - (15 + RNGDmg.nextInt(25));
                break;
            default :
                hpLeft = hp;
        }

        return hpLeft;
    }
     static void wait (int time) throws InterruptedException {
        Thread.sleep(time);
    }
    
   // java 14 method suggested by java as a replacement for if variant (see below) 
   /* static int damageCalc (String weapon, int hp)
    {
        Random RNGDmg = new Random();
        int hpLeft = switch (weapon) {
            case "sword" -> hp - (30 + RNGDmg.nextInt(10));
            case "axe" -> hp - (20 + RNGDmg.nextInt(50));
            case "bow" -> hp - (15 + RNGDmg.nextInt(25));
            default -> hp;
        };

        return hpLeft;
    }
    
    // alternative method for damage calculation using if instead of switch
    static int damageCalc (String weapon, int hp) {
        Random RNGDmg = new Random();
        int hpLeft = hp;
        if (weapon.equals("sword")) {
            hpLeft = hp - (30 + RNGDmg.nextInt(10));
        }
        else if (weapon.equals("axe")) {
            hpLeft = hp - (20 + RNGDmg.nextInt(50));
        }  
        else if (weapon.equals("bow")) {
            hpLeft = hp - (15 + RNGDmg.nextInt(25));
        }  
        return hpLeft;
    } */ 
}
