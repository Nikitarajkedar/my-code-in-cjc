package demoedu;


import java.util.ArrayList;
import java.util.List;


class Customer{
	String name;
	int numberOfRoom;
	public Customer(String name ,int numberOfRoom) {
		this.name=name;
		this.numberOfRoom=numberOfRoom;
	}	
}

class Hotel
{
List<String> customerName=new ArrayList<String>();
int totalRooms=10;
int roomsBooked=0;
public String checkIn(Customer customer) {
	  if (roomsBooked + customer.numberOfRoom <= totalRooms) {
          for (int i = 0; i < customer.numberOfRoom; i++) {
        	  customerName.add(customer.name);
          }
          roomsBooked += customer.numberOfRoom;
          return "Checked in";
      } else {
          return "No rooms available";
      }
}
	  public String checkRooms(Customer customer) {
	        if (roomsBooked + customer.numberOfRoom >= totalRooms) {
	            return "Yes";
	        } else {
	            return "No";
	        }
}
}



public class Test {
	public static void main(String[] args) {
		  Customer cust = new Customer("nikita",4);
	      Hotel hotel = new Hotel();

	      String result = hotel.checkIn(cust);
	      System.out.println(result); // Output: Checked in
	      String str=hotel.checkRooms(cust);
	      System.out.println(str);
		}
}
