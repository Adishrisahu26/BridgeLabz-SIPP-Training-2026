interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription Active");
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    public void streamMovie() {
        System.out.println("Streaming Movie...");
    }

    public void playGame() {
        System.out.println("Playing Game...");
    }

    public void showSubscriptionDetails() {

        System.out.println("Streaming + Gaming Subscription Active");
    }

    public static void main(String[] args) {

        String movies[] = {
                "Avengers",
                "Interstellar",
                "3 Idiots"
        };

        String games[] = {
                "FIFA",
                "Minecraft",
                "PUBG"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nMovies");

        for (String movie : movies)
            System.out.println(movie);

        System.out.println("\nGames");

        for (String game : games)
            System.out.println(game);
    }
}