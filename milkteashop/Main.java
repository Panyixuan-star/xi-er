package milkteashop;

import java.util.Calendar;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		TeaShop shop = new TeaShop();
		add_random_num(5,shop);//随机进货
		try {
			// 奶茶无限供应
			while(true){
				shop.makeTea("");
				shop.makeTea("bubble");
				shop.makeTea("coconut");
			}
		} catch (SoldOutException e) {
			e.printStackTrace();
		}
	}
	public static void add_random_num ( int i,TeaShop teaShop)//i代表随机进货的数量
	{
		for (int n = 1; n <= i; n++) {
			Random r = new Random();
			// 随机生产配料
			if (r.nextBoolean()) {
				teaShop.addIngredient(new Bubble(Calendar.getInstance()));
			} else {
				teaShop.addIngredient(new Coconut(Calendar.getInstance()));
			}
		}
	}
}
