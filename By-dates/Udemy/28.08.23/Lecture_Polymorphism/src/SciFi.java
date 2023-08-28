public class SciFi extends Movie{
    public SciFi(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "sci-fi",
                "galaxy",
                "Layers");
    }
    public void watchScifi(){
        System.out.println("Watching an Sci-fi!");
    }
}

