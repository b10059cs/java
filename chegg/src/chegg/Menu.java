package chegg;

public class Menu {

	/*Variable declaration*/
	static final int MAX_ITEMS=50;
	/*array of menu*/
	Object menuItems[];
	/*Default constructor */
	public Menu() {
		menuItems=new Object[MAX_ITEMS];
	}
	/*Add Item into Menu array*/
	public void addItem(MenuItem menuItem,int position){
		menuItems[position]=menuItem;
	}
	/*Getting item from array and printing details*/
	public void getItem(int position){

		MenuItem menuItem=(MenuItem) menuItems[position];
		if(menuItem!=null){
		System.out.println(" Name: "+menuItem.getName()+"\n Description: "+menuItem.getDescription()+"\n Price: "
				+menuItem.getPrice());
		}
	}
	/*Removing Element from array if exist*/
	public void removeItem(String name){
		MenuItem menuItem;
		for(int i=0;i<menuItems.length;i++){
			menuItem=(MenuItem) menuItems[i];
			if(menuItem!=null && menuItem.getName().equals("name")){
				menuItems[i]=null;
				break;
			}

		}
	}
	/*Printing Element of array*/
	public void printAllElement(){
		MenuItem menuItem;
		for(int i=0;i<menuItems.length;i++){
			menuItem=(MenuItem) menuItems[i];
			if(menuItem!=null){
				System.out.println(" Name: "+menuItem.getName()+"\n Description: "+menuItem.getDescription()+"\n Price: "
						+menuItem.getPrice());
			}
		}
	}
	/*Returning Size of an array*/
	public int size(){
		int count=0;
		MenuItem menuItem;
		for(int i=0;i<menuItems.length;i++){
			menuItem=(MenuItem) menuItems[i];
			if(menuItem!=null){
				count++;
			}
		}
		return count;
	}
	/*Updating Description of item if exist in array*/
	public void updateDescription(String name,String newDescription){
		MenuItem menuItem;
		for(int i=0;i<menuItems.length;i++){
			menuItem=(MenuItem) menuItems[i];
			if(menuItem!=null && menuItem.getName().equals(name)){
				menuItem.setDescription(newDescription);
				break;
			}
		}
	}
	/*Updating Price of item if already exist in array*/
	public void updatePrice(String name,double newPrice) throws Exception{
		MenuItem menuItem;
		for(int i=0;i<menuItems.length;i++){
			menuItem=(MenuItem) menuItems[i];
			if(menuItem!=null && menuItem.getName().equals(name)){
				menuItem.setPrice(newPrice);
				break;
			}
		}
	}
	/*Add Item into Menu array  if item exist at given position then we shift this element to 
	 * other position if there are no element exist*/
	public void addToOrder(MenuItem menuItem,int position){
		MenuItem menuItem1=(MenuItem) menuItems[position];
		if(menuItem1==null){
			menuItems[position]=menuItem;
		}else{
			MenuItem testItem;
			for(int i=0;i<menuItems.length;i++){
				testItem=(MenuItem) menuItems[i];
				if(testItem==null){
					menuItems[i]=menuItems[position];
					menuItems[position]=menuItem;
					break;
				}
			}
		}
	}
	/*Removind order from array*/
	public void removeOrder(int position){
		menuItems[position]=null;		

	}
	/*Printing Order from array*/
	public void printOrder(){
		MenuItem menuItem;
		for(int i=0;i<menuItems.length;i++){
			menuItem=(MenuItem) menuItems[i];
			if(menuItem!=null){
				System.out.println(" Name: "+menuItem.getName()+"\n Description: "+menuItem.getDescription()+"\n Price: "
						+menuItem.getPrice());
			}
		}
	}

}
