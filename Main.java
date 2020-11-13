import java.util.*;



public class Main
{ 
  public static void main(String[] args)
  {




    
    OpenChat bot = new OpenChat();          // creates OpenChat object
    Scanner scan = new Scanner(System.in);  // creates Scanner object
    String topic = bot.topic;



    System.out.println("To stop chatting with the bot simply type \"Bye\".\n");
    System.out.println(bot.welcomeResponse());
    String userMessage = scan.nextLine();



    while (!bot.goodbyeStatement.equals(userMessage))
    {
      if (topic != "")
      {
        System.out.println(bot.generateResponse(userMessage, topic));
        userMessage = scan.nextLine();
      } 
      else
      {
        System.out.println(bot.generateResponse(userMessage));
        userMessage = scan.nextLine();
      }
      
    }



    System.out.println(bot.goodbyeResponse());
    scan.close();



  }

}
