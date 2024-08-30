import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("Hello world!");

   
    EventDataBase schedule= new EventDataBase();
    
    Event one;
    Event two;
    Event duplicateRemoval;
    String time;
    String name;
    String date;
    String nameFinder;
    String conflictDate;
    String duplicateName;
    String duplicateTime;
    String duplicateDate;
    String changeName;
    String changeTime;
    String changeDate;
    Event changeHolder;
    String newName;
    String newTime;
    String newDate;

    
    
    
    
    int stop=0;//method to stop the program

while(stop==0){
  System.out.println("\nSelect the number related to the action you would like to do. \n1. Add Event \n2. Remove Event \n3. Find Event \n4. Search for time conflicts \n5. Search for duplicate events \n6. Change event \n7. End Program");
  int response=scan.nextInt();
  
  if(response==7){
    stop++;
                  }
  if(response<1 || response>7){
    System.out.println("Please enter a valid number.");
    response=scan.nextInt();
                              }//ends if statement
  
  if(response==1){
    //System.out.println();
    System.out.println("What is the name of your Event?");
    scan.nextLine(); // clearing the buffer
    name=scan.nextLine();
    System.out.println("What hour is your event?");
    int hour= scan.nextInt();
    System.out.println("What minute is your event?");
    int min= scan.nextInt();
    System.out.println("Select the number that describes the time of your event: \n1. A.M. \n2. P.M.");
    int setting= scan.nextInt();
    while(setting!= 1 && setting!= 2){
      System.out.println("Please input a valid number.");
     setting= scan.nextInt();    
                                   }//ends while loop
   if(setting==1)
      time= "A.M.";
    else
      time= "P.M.";
    System.out.println("What day is your event?");
    //date= "No date";
      scan.nextLine();
      date= scan.nextLine();
 
    one= new Event(name, hour, min, time, date);
    schedule.addEvent(one);
      //  schedule.addEvent(one);
  }//ends response 1
  
if(response==2){
   System.out.println("What is the name of your Event?");
    scan.nextLine(); // clearing the buffer
    name=scan.nextLine();
    System.out.println("What hour is your event?");
    int hour= scan.nextInt();
    System.out.println("What minute is your event?");
    int min= scan.nextInt();
    System.out.println("Select the number that describes the time of your event: \n1. A.M. \n2. P.M.");
    int setting= scan.nextInt();
    while(setting!= 1 && setting!= 2){
      System.out.println("Please input a valid number.");
     setting= scan.nextInt();    
                                   }//ends while loop
   if(setting==1)
      time= "A.M.";
    else
      time= "P.M.";
    System.out.println("What day is your event?");
    //date= "No date";
      scan.nextLine();
      date= scan.nextLine();
 
    two= new Event(name, hour, min, time, date);
  schedule.removeEvent(two);
}//ends response 2
  
if(response==3){
  System.out.println("What is the name of your event?");
  scan.nextLine();//clearing the buffer
  nameFinder= scan.nextLine();
  System.out.println(schedule.findEvent(nameFinder));
}//ends response 3
  if(response==4){
    System.out.println("What is the hour of the conflict time you are searching for?");
    int hour= scan.nextInt();
    System.out.println("What is the minute of the conflict time you are searching for?");
    int minute= scan.nextInt();
    System.out.println("Select the number that describes the time of the conflict you are searching for: \n1. A.M. \n2. P.M.");
    int t= scan.nextInt();
    while(t!=1 && t!=2){
      System.out.println("Please input a valid number.");
      t=scan.nextInt();
    }
    System.out.println("What day is the conflict you are searching for?");
    scan.nextLine();
    conflictDate=scan.nextLine();

    if(t==1){
      schedule.conflict(hour, minute, "A.M.", conflictDate);
    }
    if(t==2){
      schedule.conflict(hour, minute, "P.M.", conflictDate);
    }
  }//ends response 4

  if(response==5){
    boolean removeDuplicate= false;
    System.out.println("If there are duplicate events, would you like to delete the copys of the duplicate event? (Select 1 if yes and 2 if not.)");
    int deleteduplicate= scan.nextInt();
    while(deleteduplicate != 1 && deleteduplicate != 2){
      System.out.println("Please enter a valid number.");
      deleteduplicate=scan.nextInt();
    }
    if(deleteduplicate==1){
      removeDuplicate= true;
    }//ends if statement
    else
      removeDuplicate= false;
  
    System.out.println("What is the name of the duplicate event?");
    scan.nextLine(); //clearing the buffer
      duplicateName= scan.nextLine();
    System.out.println("What hour of the duplicate event?");    
    int duplicateHour= scan.nextInt();
    System.out.println("What is the minute of the duplicate event?");
    int duplicateMinute= scan.nextInt();
   System.out.println("Select the number that describes the time of your event: \n1. A.M. \n2. P.M.");
    int duplicateSetting= scan.nextInt();
    while(duplicateSetting!= 1 && duplicateSetting!= 2){
      System.out.println("Please input a valid number.");
     duplicateSetting= scan.nextInt();    
                                   }//ends while loop
   if(duplicateSetting==1)
      duplicateTime= "A.M.";
    else
      duplicateTime= "P.M.";

    System.out.println("What day is the duplicate event?");
      scan.nextLine();//clearing the buffer
    duplicateDate= scan.nextLine();
    
    schedule.findDuplicate(duplicateName, duplicateHour, duplicateMinute, duplicateTime, duplicateDate);
  duplicateRemoval= new Event(duplicateName, duplicateHour, duplicateMinute, duplicateTime, duplicateDate);
  
     if(removeDuplicate==true){
       schedule.deleteDuplicate(duplicateRemoval);
     }//ends if statement
  }//ends response 5
  if(response==6){
    System.out.println("Please enter the original information of the event.");
    
    System.out.println("What is the name of the original event?");
    scan.nextLine(); //clearing the buffer
      changeName= scan.nextLine();
    System.out.println("What hour of the original event?");    
    int changeHour= scan.nextInt();
    System.out.println("What is the minute of the original event?");
    int changeMinute= scan.nextInt();
   System.out.println("Select the number that describes the time of your original event: \n1. A.M. \n2. P.M.");
    int changeSetting= scan.nextInt();
    while(changeSetting!= 1 && changeSetting!= 2){
      System.out.println("Please input a valid number.");
     changeSetting= scan.nextInt();    
                                   }//ends while loop
   if(changeSetting==1)
      changeTime= "A.M.";
    else
      changeTime= "P.M.";

    System.out.println("What day is the original event?");
      scan.nextLine();//clearing the buffer
    changeDate= scan.nextLine();
  changeHolder= new Event(changeName, changeHour, changeMinute, changeTime, changeDate);
    int j=-1;
for(int i=0; i<schedule.size(); i++){
  if(changeHolder.toString().equals(schedule.get(i).toString())){
    j=i;
          }//ends if statement
      }//ends for loop 
  if(j==-1){
    System.out.println("Event does not exist.");
    break;
  }
    else{
      System.out.println("Enter the name you want to change the event to.");
      newName= scan.nextLine();
      schedule.get(j).changeName(newName);
      System.out.println("What is the new hour you want the event to be?");
        int newHour= scan.nextInt();
      schedule.get(j).changeHour(newHour);
      System.out.println("What is the new minute you want the event to be?");
      int newMinute= scan.nextInt();
      schedule.get(j).changeMinute(newMinute);
      System.out.println("Select the number that describes the time of your new event: \n1. A.M. \n2. P.M.");
    int newSetting= scan.nextInt();
    while(newSetting!= 1 && newSetting!= 2){
      System.out.println("Please input a valid number.");
     newSetting= scan.nextInt();  
    }//ends while loop
      if(newSetting==1)
      newTime= "A.M.";
    else
      newTime= "P.M.";
    schedule.get(j).changeAMorPM(newTime);
    System.out.println("What day do you want the event to be?");
      scan.nextLine();//clearing the buffer
    newDate= scan.nextLine();
      schedule.get(j).changeDay(newDate);

  System.out.println("Here is the changed event: " + schedule.get(j).toString());
    }//ends else statement
  }//ends response 6
    
} //ends main while loop
    
  }//ends public static void
}//ends class