package eg.arraylist;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class SuperMarket{
	int number;
	int[] cost = new int[2];
	int[] stock = new int[2];
	String product[] = new String[2];
	
	Scanner in = new Scanner(System.in);
	
	public void showOptions() {
		int i =0;
		while(i==0){
			
			System.out.println("1.Seller");
			System.out.println("2.Buyer");
			System.out.println("3.Exit");
			i++;
		}
		System.out.println("Enter the number");
		number = in.nextInt();
		switch(number){
		case 1 : System.out.println("Add your item");
		               addItem();
		               break;
		case 2 : System.out.println("Enter the item to buy");
						buyItem(product, stock, cost);
						break;
		case 3 : System.exit(0);

		}
		
	}

	public void addItem() {
	for(int x=0;x<product.length;x++){
		System.out.println("Product  : ");
		product[x] = in.next();
		System.out.println("Stock  :  ");
		stock[x] =in.nextInt();
		System.out.println("Cost  :  ");
		cost[x] =in.nextInt();
	}
		showOptions();
	
		
	}
	public void buyItem(String[] product2, int[] stock2, int[] cost2) {
	
		System.out.println("Available products");
		for(int x=0;x<product.length;x++){
		System.out.println("  Product  :  "+product2[x]+" ||  Stock  :  "+stock2[x]+"  ||  COST   :  "+cost2[x]);
		}
		System.out.println("Enter product : ");
		String product1 = in.next();
		System.out.println("Enter Quantity : ");
		int quantity = in.nextInt();
		calculate(product1,quantity);
	}

		public void calculate(String product1, int quantity) {
			for(int x=0;x<product.length;x++){
				if(product[x].equalsIgnoreCase(product1)){
					int price = cost[x]*quantity;
					
		
					stock[x]=stock[x]-quantity;
					if(stock[x]>=0){
					System.out.println("Available stock of "+product[x]+ " is "+stock[x]);
					System.out.println("Price  :"+price);
					}
					else {
						System.out.println("SOLD OUT");
					}
			
				}
				
			
			}
			showOptions();
		
	}
	


		
}
public class InventorySystem {

	public static void main(String[] args) {

		
SuperMarket market = new SuperMarket();
market.showOptions();

}
}