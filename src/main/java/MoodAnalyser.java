/**
 * purpose : analyse and respond Happy or Sad Mood
 *@author : Sirin
 * since : 04-04-2022
 */

public class MoodAnalyser {
    public static void main(String args[]) {
        System.out.println("Mood Analyser");

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String message = moodAnalyser.analyseMood("I am Happy");
        System.out.println(message);
        message = moodAnalyser.analyseMood("I am Sad");
        System.out.println(message);
    }
    public String analyseMood(String message) {
        if (message.toLowerCase().contains("happy")) {
            return "HAPPY";
        } else if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return null;
        }
    }
}

