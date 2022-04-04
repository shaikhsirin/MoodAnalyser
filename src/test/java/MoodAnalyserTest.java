
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_IsProper_ShouldReturnSad(Assertions Assert) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actualResult = moodAnalyser.analyseMood("I am Sad in Mood");
        Assert.assertEquals("SAD", actualResult);
    }
    @Test
    public void analyseAnyMood(Assertions Assert) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actualResult = moodAnalyser.analyseMood("I am Any in Mood");
        Assert.assertEquals("HAPPY", actualResult);
    }

}

