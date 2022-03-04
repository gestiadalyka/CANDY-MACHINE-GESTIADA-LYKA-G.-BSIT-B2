public class CandyMachine {
   public static void verse1() {
      System.out.println("Welcome to Candy Machine!");
      System.out.println("(All candy provided is available.)");
   }

   public static void verse2() {
      Scanner console = new Scanner(System.in);
      System.out.print("How much money do you have? >"); // prompts for a whole number
      double money = console.nextDouble();
      System.out.printf("65, that's all?", money);
   }

   public static void verse3() {
      System.out.println("Well, let me tell you what we got here.");
      System.out.println("A 65 Candies");
      System.out.println("B 50 Chips");
      System.out.println("C 75 Gum");
      System.out.println("D 65 Cookies");
   }

   public static void verse4() {
      Scanner input = new Scanner(System.in);
      System.out.print("So, What do you want? >"); // prompts for a whole number
      String a = input.next();
      if (a.equals("A"))
         if (money > 65)
            System.out.println("Thank you for buying come again");
   }
}