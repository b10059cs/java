package chegg;

import java.util.Scanner;

public class MenuOperations {
	/*Variable declaration*/
	static final int MAX_ITEMS=50;

	public static void main(String args[]){
		Menu menu=new Menu();
		MenuItem menuItem[]=new MenuItem[MAX_ITEMS];
		String name,description;
		double price;
		int i=0,position;
		/*menuItem.setName("Thali");
		menuItem.setDescription("North Thali");
		try {
			menuItem.setPrice(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		menu.addItem(menuItem, 0);
		menu.getItem(0);
	}*/

		Scanner scanner=new Scanner(System.in);
		while(true){		
			System.out.println("1. Add Item\n2.Get Item\n3.Remove Item\n4.Print All Item\n"
					+ "5.Size \n6. Update Description\n7. Update price\n8. Add to order\n9. "
					+ "remove from order\n10. View Order\n11. Quit\n");
			int choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice){
			case 1:
				System.out.println("Please Enter item name");
				name=scanner.nextLine();
				System.out.println("Please Enter item Description");
				description=scanner.nextLine();
				System.out.println("Please Enter item price");
				price=scanner.nextDouble();
				menuItem[i]=new MenuItem();
				menuItem[i].setName(name);
				menuItem[i].setDescription(description);
				try {
					menuItem[i].setPrice(price);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Please Enter position");
				position=scanner.nextInt();
				menu.addItem(menuItem[i], position);
				break;
			case 2:
				System.out.println("Please Enter the Position");
				position=scanner.nextInt();
				menu.getItem(position);
				break;
			case 3:
				System.out.println("Please Enter item name");
				name=scanner.nextLine();
				menu.removeItem(name);
				break;
			case 4:
				menu.printAllElement();
				break;
			case 5:
				System.out.println("Total number of items are: "+menu.size());
				break;
			case 6:
				System.out.println("Please Enter the name of item");
				name=scanner.nextLine();
				System.out.println("Please Enter new Description");
				description=scanner.nextLine();
				menu.updateDescription(name, description);
				break;
			case 7:
				System.out.println("Please Enter Item name");
				name=scanner.nextLine();
				System.out.println("Please Enter the New Item price");
				price=scanner.nextDouble();
				try {
					menu.updatePrice(name, price);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 8:
				System.out.println("Please Enter item name");
				name=scanner.nextLine();
				System.out.println("Please Enter item Description");
				description=scanner.nextLine();
				System.out.println("Please Enter item price");
				price=scanner.nextDouble();
				menuItem[i]=new MenuItem();
				menuItem[i].setName(name);
				menuItem[i].setDescription(description);
				try {
					menuItem[i].setPrice(price);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Please Enter position");
				position=scanner.nextInt();
				menu.addToOrder(menuItem[i], position);
				i++;
				break;
			case 9:
				System.out.println("Please Enter the position of item to be removed from order");
				position=scanner.nextInt();
				menu.removeOrder(position);
				break;
			case 10:
				menu.printOrder();
				break;
			case 11:
				System.exit(0);


			}
		}
	}
}
