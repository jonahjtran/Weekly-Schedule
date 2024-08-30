public class Event{
 
  private String event;
  private int timeOne;
  private int timeTwo;
  private String sun;
  private String date;

  
  public Event(String name, int hour, int minute, String light, String day){
    event=name;
    timeOne=hour;
    timeTwo=minute;
    sun=light;
    date=day;
  }


  public String getName(){
    return event;
  }//ends method

  public void changeName(String name){
    event= name;
  }

  public int getHour(){
    return timeOne;
  }

  public void changeHour(int num){
    timeOne= num;
  }

  public int getMinute(){
    return timeTwo;
  }

  public void changeMinute(int num2){
    timeTwo= num2;
  }

  public String getAMorPM(){
   return sun; 
  }

  public void changeAMorPM(String word){
    sun= word;
  }

  public String getDay(){
    return date;
  }

  public void changeDay(String word2){
    date= word2;
  }


  public String toString(){
 if(timeTwo<10)
    return event + "- " + timeOne + ":0" + timeTwo + " " + sun + " on " + date;
  else
    return event + "- " + timeOne + ":" + timeTwo + " " + sun + " on " + date;
  }
  
}