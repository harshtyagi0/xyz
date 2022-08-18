package training_Lecture_9;
import java.util.*;

public class Shoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Products{
	String Name;
	Products(String name){
		this.Name = name;
	}
}
class ListItem{
	private int id;
	private int quantity;
	private Products p;
	
	ListItem(int id, int quantity, Products p){
		this.id=id;
		this.quantity=quantity;
		this.p=p;
	}
}
class Order{
	private String name;
	private int id;
	private List<ListItem> lineItems;
	
	Order(int id, String name){
		super();
		this.id=id;
		this.name=name;
		this.lineItems = new ArrayList<ListItem>();
	}
}
