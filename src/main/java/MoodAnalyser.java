/**
 * purpose : analyse and respond Happy or Sad Mood
 *@author : Sirin
 * since : 04-04-2022
 */

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        this.message = null;
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.toLowerCase().contains("happy") || message.toLowerCase().contains("any")) {
            return "HAPPY";
        }
        else if (message.toLowerCase().contains("sad")) {
            return "SAD";
        }
        else {
            return null;
        }
    }

    public static void main(String args[]) {
        System.out.println("Mood Analyser");

        MoodAnalyser moodAnalyser = new MoodAnalyser();

        moodAnalyser.setMessage("I am Happy");
        System.out.println(moodAnalyser.analyseMood());

        moodAnalyser.setMessage("I am Sad");
        System.out.println(moodAnalyser.analyseMood());
    }

}

