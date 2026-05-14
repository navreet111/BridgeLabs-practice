class Booking{
    String guestName;
    String roomType;
    int  nights;
    Booking(){
        guestName="a";
        roomType="b";
        nights=1;
    }
    Booking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    Booking(Booking b){
      this.guestName=b.guestName;
      this.roomType=b.roomType;
      this.nights=b.nights;
    }
    void display(){
        System.out.println("Name "+guestName);
        System.out.println("RoomType: "+roomType);
        System.out.println("Night "+nights);
    }
}
public class HotelBooking {
    public static void main(String[] args) {
        Booking b1=new Booking();
        Booking b2=new Booking("Reet","AC",2);
        Booking b3=new Booking(b2);
        b1.display();
        b2.display();
        b3.display();
    }
}
