package il.co.techmobile.jokesprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jokes {

    private final List<String> jokes = new ArrayList<>();

    public Jokes() {
        if (!jokes.isEmpty()) {
            jokes.clear();
        }
        jokes.add("I asked my French friend if she likes to play video games. She said, \"Wii.\"");
        jokes.add("If anyone needs an ark, I happen to Noah guy.\n");
        jokes.add("Yesterday, a clown held the door open for me. It was such a nice jester!");
        jokes.add("The machine at the coin factory just suddenly stopped working, with no explanation. It doesn't make any cents!");
        jokes.add("Did you see the movie about the hot dog? It was an Oscar wiener");
        jokes.add("Q. Why was King Arthur's army too tired to fight?\n" +
                "\n" +
                "A. It had too many sleepless knights.");
        jokes.add("Did you hear about the semi-colon that broke the law? He was given two consecutive sentences.\n" +
                "\n");
        jokes.add("Don't wake up mom! There are at least seven species who eat their young. Your mom may be one of them.\n" +
                "\n");
        jokes.add("Mother: (noun)\n" +
                "\n" +
                "One person who does the work of 20. For free\n");
        jokes.add("If you see a robbery at an Apple Store does that make you an iWitness?");

    }

    public String getJokes() {
        Random rn = new Random();
        int number = rn.nextInt(10);

        return jokes.get(number);
    }
}
