import java.util.ArrayList;

public class EventDataBase
{//starts clas
  private  ArrayList<Event> database= new ArrayList<Event>();


  

  public void addEvent(Event task){
    database.add(task);
  }

  public int size(){
    return database.size();
  }

  public Event get(int i){
    return database.get(i);
  }

  public void removeEvent(Event task){
    int j=database.size();
    for(int i=0; i<database.size(); i++){
      if(database.get(i).toString().equals(task.toString())){
        database.remove(i);
        System.out.println("Event removed");
        break;
      }//ends if statement
    }//ends for loop
    if(j==database.size()){
      System.out.println("No Event exists");
    }//ends if statement
  }//ends method


  public String findEvent(String word){
    for(int i=0; i<database.size(); i++){
      if(database.get(i).getName().equals(word)==true){
        return database.get(i).toString();
          }//ends if statement
    }//ends loop
    return "Event not found";
  }//ends method

  public void findDuplicate(String name, int hour, int min, String AMorPM, String day){
    int j=0;
    for(int i=0; i<database.size(); i++){
      if(database.get(i).getName().equals(name)==true && hour==database.get(i).getHour() && min==database.get(i).getMinute() && AMorPM.equals(database.get(i).getAMorPM()) && day.equals(database.get(i).getDay())){
        j++;
      }//ends else if statement
    }//ends for loop
  if(j==0){
        System.out.println("Event does not exist.");
      }//ends if statement
 
  else if(j==1){
        System.out.println("Event does not have any duplicates");
              }//ends else if statement
  
  else{
      System.out.println("Here are the duplicate events:"); 
      for(int k=0; k<database.size();k++){
          if(database.get(k).getName().equals(name)==true){
            System.out.println(database.get(k));
          }//ends if statement
        }//ends for loop
      }//ends else statement
  }//ends method

  public void deleteDuplicate(Event one){
    int j=0;
    for(int i=0; i<database.size(); i++)
    {
      if(one.toString().equals(database.get(i).toString()) && j==0)
        j++;
      
      else if(one.toString().equals(database.get(i).toString()) && j>0){
        database.remove(i);
        System.out.println("Event deleted.");
        j++;
      } //ends if statement
      
    }//ends for loop  
  }//ends method

  public void conflict(int clockHour, int clockMinute, String Morning, String date){
    int k=0;
    System.out.println("Here are your conflicts:");
    for(int i=0; i<database.size(); i++){
      if(clockHour==database.get(i).getHour() && clockMinute==database.get(i).getMinute() && Morning.equals(database.get(i).getAMorPM()) && date.equals(database.get(i).getDay())){
        System.out.println(database.get(i));
        k++;
      }//ends if statement
    }//ends for loop
    if(k==1)
      System.out.println("There are no conflcits. Only 1 event is listed for that date and time.");
    if(k==0)
      System.out.println("There are no conflicts. No events are scheduled for that date and time.");
  }//ends method

  
  
}//ends class



