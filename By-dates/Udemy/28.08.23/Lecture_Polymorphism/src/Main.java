import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Movie theMovie = new Movie("Star Wars");
//        theMovie.watchMovie();

//        Movie theAdventure = new Adventure("Star Wars");
//        theAdventure.watchMovie();

//        Movie theMovie = Movie.getMovie("Science","Star Wars");
//        theMovie.watchMovie();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter Type ASC: ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }
    }
}
