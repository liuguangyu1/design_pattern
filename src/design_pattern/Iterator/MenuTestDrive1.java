package design_pattern.Iterator;

public class MenuTestDrive1 {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = 
				new Menu1("PANCAKE HOUSE MENU", "BREAKFAST");
		MenuComponent dinerMenu = 
				new Menu1("DINER MENU", "LUNCH");
		MenuComponent cafeMenu = 
				new Menu1("CAFE MENU", "Diner");
		MenuComponent dessertMenu = 
				new Menu1("DESSERT MENU", "Dessert of course");
		
		MenuComponent allMenus = new Menu1("ALL MENUS", "ALL Menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		dinerMenu.add(new MenuItem1(
				"Pasta",
				"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
				true,
				3.89));
		
		dinerMenu.add(dessertMenu); //添加子菜单
		
		dessertMenu.add(new MenuItem1(
				"Apple pie",
				"Apple pie with a flakey crust, topped with vanilla ice cream",
				true,
				1.59));
		
		//初始化Waitress, 并传入根菜单。
		Waitress1 waitress = new Waitress1(allMenus);
		waitress.printMenu();
	}
}
