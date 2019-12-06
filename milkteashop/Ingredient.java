package milkteashop;

import java.util.Calendar;

public abstract class Ingredient {
	protected String name;
	protected Calendar productDay;
	protected int day;//保质期
	public abstract boolean isOutDate();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getProductDay() {
		return productDay;
	}

	public void setProductDay(Calendar productDay) {
		this.productDay = productDay;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

}
