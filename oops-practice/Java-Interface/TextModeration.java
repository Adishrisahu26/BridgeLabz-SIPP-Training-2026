interface TextModeration {

    boolean checkOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {

        return post.toLowerCase().contains("bad");
    }
}

interface SpamDetection {

    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("No spam posts allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    public boolean checkOffensive(String post) {

        return TextModeration.containsRestrictedWords(post);
    }

    public boolean checkSpam(String post) {

        return post.toLowerCase().contains("buy now");
    }

    public void displayModerationPolicy() {

        System.out.println("Posts should be respectful and spam-free.");
    }

    public static void main(String[] args) {

        String posts[] = {
                "Buy Now and get 50% OFF",
                "This is a bad product",
                "Welcome to our community",
                "Buy Now! Limited offer",
                "Have a nice day"
        };

        ContentModerator cm = new ContentModerator();

        cm.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            if (cm.checkSpam(post))
                System.out.println(post + " --> Spam");

            else if (cm.checkOffensive(post))
                System.out.println(post + " --> Offensive");

            else
                System.out.println(post + " --> Valid");
        }
    }
}