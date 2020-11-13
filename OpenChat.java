import java.util.*;
import java.lang.Math;



/**
* An open source free to use/modify/redistribute chatbot
* @author: Cole Newkirk
* @version: 0.2.1
* @since 2020-11-08
*/



public class OpenChat
{



  String topic = "";



  ArrayList<String> entryKeywordsTopic1 = new ArrayList<String>(Arrays.asList("element1"));
  ArrayList<String> entryKeywordsTopic2 = new ArrayList<String>(Arrays.asList("element1"));
  ArrayList<String> entryKeywordsTopic3 = new ArrayList<String>(Arrays.asList("element1"));

  ArrayList<String> layer1QuestionsTopic1 = new ArrayList<String>(Arrays.asList("element1"));
  ArrayList<String> layer1QuestionsTopic2 = new ArrayList<String>(Arrays.asList("element1"));
  ArrayList<String> layer1QuestionsTopic3 = new ArrayList<String>(Arrays.asList("element1"));

  ArrayList<String> layer2QuestionsTopic1 = new ArrayList<String>(Arrays.asList("element1"));
  ArrayList<String> layer2QuestionsTopic2 = new ArrayList<String>(Arrays.asList("element1"));
  ArrayList<String> layer2QuestionsTopic3 = new ArrayList<String>(Arrays.asList("element1"));

  ConversationTopic topic1 = new ConversationTopic(entryKeywordsTopic1, layer1QuestionsTopic1, layer2QuestionsTopic1);
  ConversationTopic topic2 = new ConversationTopic(entryKeywordsTopic2, layer1QuestionsTopic2, layer2QuestionsTopic2);
  ConversationTopic topic3 = new ConversationTopic(entryKeywordsTopic2, layer1QuestionsTopic3, layer2QuestionsTopic3);




  String goodbyeStatement = "Bye";
  public String welcomeResponse()
  {
    String response = "";
    ArrayList<String> welcomeResponses = new ArrayList<String>(Arrays.asList("Hello!", "こんにちは! ~\\(≧▽≦)/~", "Kon'nichiwa!", "Hi!"));
    response = welcomeResponses.get(random(welcomeResponses.size()));
    return response;
  }



  public String goodbyeResponse()
  {
    String response = "";
    ArrayList<String> goodbyeResponses = new ArrayList<String>(Arrays.asList("Goodbye! Hope to chat again soon", "さようなら! (づ｡◕‿‿◕｡)づ", "Sayonara!", "Goodbye!!", "Hope to see you soon!"));
    response = goodbyeResponses.get(random(goodbyeResponses.size()));
    return response;
  }



  private int findKeyword(String userMessage, String goal) // for finding substring inside of string but ファンシー!!
  {
   String phrase = userMessage.trim();
       int psn = phrase.toLowerCase().indexOf(goal.toLowerCase());

       while (psn >= 0)
       {
              String before = " ", after = " ";
              if (psn > 0)
              {
                 before = phrase.substring(psn - 1, psn).toLowerCase();
              }
              if (psn + goal.length() < phrase.length())
              {
                 after = phrase.substring(
                                  psn + goal.length(),
                                      psn + goal.length() + 1)
                                      .toLowerCase();
              }
              if (((before.compareTo("a") < 0) ||
                   (before.compareTo("z") > 0))
                      && ((after.compareTo("a") < 0) ||
                          (after.compareTo("z") > 0)))
              {
                return psn;
              }
              psn = phrase.indexOf(goal.toLowerCase(),psn + 1);
       }
       return -1;
  } 



  private int random(int responseCount) //for easy random number generation
  {
    int randomNum = (int)(Math.random() * responseCount);
    return randomNum;
  } 



  public String generateResponse(String userMessage, String topic) // works for all topics
  {
    String response = "";
    if (findKeyword(userMessage, topic) >= 0)
    {
      // create a list of keywords and responses.. same amount for each topic.
      // must create after comming up with responses.



      
    }
    response = response.trim();
    return response;
  }



  public String generateResponse(String userMessage) // used for setting the topic
  {
    String response = "";

    ArrayList<String> keywords = topic1.entryKeywords; // Test topic1 keywords against userMessage
    for (int i = 0; i < keywords.size(); i++)
    {
      String keyword = keywords.get(i); 
      if (findKeyword(userMessage, keyword) >= 0)
      {
        topic = "topic1";
      }
    }

    keywords = topic2.entryKeywords; // Test topic2 keywords against userMessage
    for (int i = 0; i < keywords.size(); i++)
    {
      String keyword = keywords.get(i); 
      if (findKeyword(userMessage, keyword) >= 0)
      {
        topic = "topic2";
      }
    }

    keywords = topic3.entryKeywords; // Test topic3 keywords against userMessage
    for (int i = 0; i < keywords.size(); i++)
    {
      String keyword = keywords.get(i); 
      if (findKeyword(userMessage, keyword) >= 0)
      {
        topic = "topic3";
      }
    }
      


    response = response.trim();
    return response;
  }



}
