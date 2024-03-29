package milkteashop;

public class MilkTea {
	private String name;
	private Ingredient ingredient;
	private String ingreName;

	public MilkTea(String name) {
		this.name = name;
	}

	public String getIngreName() {
		return ingreName;
	}
	public void setIngreName(String ingreName) {
		this.ingreName = ingreName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Ingredient getIngredient() {
		return ingredient;
	}
	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	@Override
	public String toString() {
		return "MilkTea{" +
				"name='" + name + '\'' +
				", 配料=" + ingredient +
				", ingreName='" + ingreName + '\'' +
				'}';
	}
}
