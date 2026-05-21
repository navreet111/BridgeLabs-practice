import java.util.*;
class User{
    int userId;
    String userName;

User(int userId,String userName){
        this.userId=userId;
        this.userName=userName;
    }
    void display(){
        System.out.println(userId);
        System.out.println(userName);
    }
}
public class Combined {
    static ArrayList <User> user=new ArrayList<>();
    static LinkedList<String> songs=new LinkedList<>();
     static void addUser(int id,String name){
        User users=new User(id, name);
        user.add(users);
     }
     static void playSong(String song){
        songs.addFirst(song);
     }
     static void displayHistory(){
        if(songs.isEmpty()){
            System.out.println("no history");
            return;
        }
        for(String song:songs){
            System.out.println(song);
        }
     }
 static void searchsong(String song){
    if(songs.contains(song)){
        System.out.println("Found");
        
    }else{
        System.out.println("Not found");
    }
 }

 static void removeSong(String songName) {
    if (songs.remove(songName)) {
            System.out.println(songName + " removed from history.");
     } else {
            System.out.println(songName + " not found in history.");
        }
    }
 
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("1-Add user");
    System.out.println("2-play song");
    System.out.println("3-display play history");
    System.out.println("4-search song history");
    System.out.println("5-remove song from history ");
    int n=sc.nextInt();
    switch (n) {
        case 1:
            int id=sc.nextInt();
            String name=sc.nextLine();
            addUser(id, name);
            break;
        case 2:
            String song=sc.nextLine();
            playSong(song);
            break;
        case 3:
            displayHistory();
            break;
        case 4:
            String songname=sc.nextLine();
            searchsong(songname);
            break;
        case 5:
            String songremoved=sc.nextLine();
            removeSong(songremoved);
            break;
        default:
            System.out.println("Invalid");
    }
 }
}
