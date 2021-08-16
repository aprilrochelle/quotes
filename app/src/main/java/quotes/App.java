/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;
import com.google.gson.Gson;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.ArrayList;
import com.google.gson.reflect.TypeToken;

public class App {
    public String getGreeting() {
        String greeting;
        try {
            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get("/Users/aprilwatson/workspace/Java/quotes/recentquotes.json"));
            ArrayList<Quote> quotes = new Gson().fromJson(reader, new TypeToken<ArrayList<Quote>>() {}.getType());

            Random rand = new Random();
            Quote randomQuote = quotes.get(rand.nextInt(quotes.size()));

            greeting = randomQuote.author + " once said, " + randomQuote.text;
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            greeting = ex.getMessage();
        }
        return greeting;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
