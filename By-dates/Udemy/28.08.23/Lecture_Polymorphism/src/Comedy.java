public class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Funny",
                "Funny Music",
                "Happy Ending");
    }
    public void watchComedy(){
        System.out.println("Watching an Comedy!");
    }
}
