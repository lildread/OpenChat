import java.util.ArrayList;



public class ConversationTopic
{



  ArrayList<String> entryKeywords = new ArrayList<>();
  ArrayList<String> layer1Questions = new ArrayList<>();
  ArrayList<String> layer2Questions = new ArrayList<>();



  public ConversationTopic(ArrayList<String> entryKeywords, ArrayList<String> layer1Questions, ArrayList<String> layer2Questions)
  {
    this.entryKeywords = entryKeywords;
    this.layer1Questions = layer1Questions;
    this.layer2Questions = layer2Questions;
  }

  

}
