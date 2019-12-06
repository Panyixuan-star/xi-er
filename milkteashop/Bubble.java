package milkteashop;

import java.util.Calendar;
import java.util.logging.SimpleFormatter;

public class Bubble extends Ingredient{

	public Bubble() {
		super();
	}
	public Bubble(Calendar calendar) {
		setName("Bubble");
		setProductDay(calendar);
		setDay(7);
	}

	@Override
	public String toString() {

		return "Bubble{" +
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

