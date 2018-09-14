package com.magarex.jokeprovider;

import java.util.Random;

public class JokeProvider {

    public static String getRandomJoke() {
        Random random = new Random();
        int a = random.nextInt(jokes.length);
        return jokes[a];
    }

    private static String jokes[] = {
            " Boss: Where were you born?\nSardar: India ..\nBoss: which part?\nSardar: What which part? Whole body was born in India.",

            " 2 sardar were fixing a bomb in a car.\nSardar 1: What would you do if the bomb\nexplodes while fixing.\nSardar 2: Dont worry, I have one more.",

            "Sardar: What is the name of your car?\nLady: I forgot the name, but is starts with 'T'.\nSardar: Oh, what a strange car, starts with Tea. All cars that I know start with petrol.",

            "Sardar joined new job. 1st day he worked till late evening on the computer. Boss was happy and asked what you did till evening.\nSardar: Keyboard alphabets were not in order, so I made it alright.",

            "At the scene of an accident a man was crying: O God! I have lost my hand, oh!\nSardar: Control yourself. Don't cry. See that man. He has lost his head. Is he crying?",

            "Sardar: U cheated me.\nShopkeeper: No, I sold a good radio to u.\nSardar: Radio label shows Made in Japan but radio says this is 'All India Radio! '",

            "In an interview, Interviewer: How does an electric motor run?\nSardar: Dhhuuuurrrrrrrrrr. .....\nInteviewer shouts: Stop it.\nSardar: Dhhuurrrr dhup dhup dhup...",

            "Tourist: Whose skeleton is that?\nSardar: An old king's skeleton.\nTourist: Who's that smaller skeleton next to it?\nSardar: That was same king's skeleton when he was a child."
    };
}
