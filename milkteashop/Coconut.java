package milkteashop;

import java.util.Calendar;

public class Coconut extends Ingredient {

	public Coconut() {
		super();
	}
	public Coconut(Calendar calendar) {
		setName("Coconut");
		setProductDay(calendar);
		setDay(5);
	}

	@Override
	public String toString() {
		return "Coconut{" +
				"	名称：'" + name + '\'' +
				", 生产日期=" + productDay.get(Calendar.YEAR)+"-"
				+(productDay.get(Calendar.MONTH)+1)+"-"+productDay.get(Calendar.DATE)+
				", 保质期=" + day +
				'}';
	}

	@Override
	public boolean isOutDate() {
		return DateUtils.calculateDay(productDay,day);
	}
}
