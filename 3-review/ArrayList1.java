import java.util.*;
class MovieBooking{
    int movieId;
    String movieName;
    double ticketPrice;
    int availableSeats;

    MovieBooking(int movieId,String movieName,double ticketPrice,int availableSeats){
        this.movieId=movieId;
        this.movieName=movieName;
        this.ticketPrice=ticketPrice;
        this.availableSeats=availableSeats;
    }

    void displayMovie(){
        System.out.println(movieId);
        System.out.println(movieName);
        System.out.println(ticketPrice);
        System.out.println(availableSeats);
    }
}
public class ArrayList1 {
    static ArrayList<MovieBooking> movie=new ArrayList<>(); 
    static void addMovie(int id,String name,double price,int seats){
        MovieBooking movies=new MovieBooking(id, name, price, seats);
        movie.add(movies);
    }

    static void bookTicket(int id,int seats){
        for(MovieBooking movie:movie){
            if(movie.movieId==id){
                if(movie.availableSeats>=seats){
                    movie.availableSeats=movie.availableSeats-seats;
                    double total=seats*movie.ticketPrice;
                    System.out.println(total);
                }
                else{
                    System.out.println("not available");
                }
                return;
            }
        }
    }
    static void display(){
        if(movie.isEmpty()){
            System.out.println("No Movie");
            return;
        }
        for(MovieBooking movie:movie){
            movie.displayMovie();
        }
    }

    static void searchMovie(int id){
       for(MovieBooking movie:movie){
            if(movie.movieId==id){
                System.out.println("Found");
                movie.displayMovie();
                return;
            }

       }
       System.out.println("Not found");
    }
     static void cancelTicket(int id,int seats){
        for(MovieBooking movie:movie){
            if(movie.movieId==id){
                movie.availableSeats=movie.availableSeats+seats;
                System.out.println("cancelled");
                return;
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("1-Add movie");
        System.out.println("2-display movies");
        System.out.println("3-Search movie");
        System.out.println("4-Book Ticket");
        System.out.println("5-Cancel Ticket");
        // System.out.println("2-Book ticket");
        int n=sc.nextInt();
        switch(n){
            case 1:
                int id=sc.nextInt();
                String name=sc.nextLine();
                double price=sc.nextDouble();
                int seats=sc.nextInt();
                addMovie(id, name, price, seats);
                break;
            case 2:
                display();
                break;
            case 3:
              int searchid=sc.nextInt();
               searchMovie(searchid);
              break;
            case 4:
             int bookId=sc.nextInt();
             int bookseats=sc.nextInt();
             bookTicket(bookId, bookseats);
             break;

            case 5:
            int cancelid=sc.nextInt();
            int cancelseats=sc.nextInt();
            cancelTicket(cancelid, cancelseats);
            break;
            default:
                System.out.println("Invalid");
        }
    }
}
