import java.util.*;

class Station{
    int stationId;
    String stationName;

    Station(int stationId,String stationName){
        this.stationId=stationId;
        this.stationName=stationName;
    }
    void display(){
        System.out.println(stationId);
        System.out.println(stationName);
    }
}
public class LinkedList1 {
     static LinkedList<Station> route=new LinkedList<>();
     static void addStation(int id,String Name){
        Station station=new Station(id, Name);
        route.add(station);
        
     }
     static void removeStation(int id){
        for(Station station:route){
            if(station.stationId==id){
                route.remove(station);

            }
        }
     }
     static void displayRoute(){
        if(route.isEmpty()){
            System.out.println("No route");
            return;
        }
        for(Station station:route){
            station.display();
        }
     }
     static void searchstation(int id){
       for(Station station:route){
        if(station.stationId==id){
            System.out.println("Station found");
            station.display();
            return;
        }
        System.out.println("Not found");
       }
     }
     static void findNextStation(int id){
        for(int i=0;i<route.size();i++){
            if(route.get(i).stationId==id){
                if(i==route.size()-1){
                    System.out.println("Last");

                }
                else{
                   route.get(i+1).display();
                }
            
            return;
            }
        }
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-Add station");
        System.out.println("2-Remove station");
        System.out.println("3-Display Route");
        System.out.println("4-Search station");
        System.out.println("5-Find next station");
        int n=sc.nextInt();
        switch(n){
            case 1:
                int id=sc.nextInt();
                String name=sc.nextLine();
                addStation(id, name);
                break;
            case 2:
                int removeid=sc.nextInt(); 
                removeStation(removeid);
                break;
            case 3:
                displayRoute();
                break;
            case 4:
                int searchid=sc.nextInt();
                searchstation(searchid);
                break;
            case 5:
                int nextid=sc.nextInt();
                findNextStation(nextid);
                break;
            default:
                System.out.println("Invalid");

        }
     }
}
