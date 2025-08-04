public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author: Guido Fajardo
  Date: 2/19/2049
  */
  	public static void main(String[] args){
      String name1 = "Guido";
      String adjective1 = "beautiful";
      String adjective2 = "fast";
      String adjective3 = "smart";
      String verb1 = "run";
      String noun1 = "car";
      String noun2 = "cup";
      String noun3 = "building";
      String noun4 = "computer";
      String noun5 = "bag";
      String noun6 = "phone";
      String name2 = "Carlos";
      int number = 20;
      String place1 = "house";

      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }
}
