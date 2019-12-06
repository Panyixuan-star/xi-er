package milkteashop;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TeaShop implements Shop {
    List<Bubble> bubbleList = new ArrayList<Bubble>();
    List<Coconut> coconutList = new ArrayList<Coconut>();
    private List<MilkTea> milkTeas = new ArrayList<MilkTea>();

    private void addIn(Bubble b) {
        this.bubbleList.add(b);
        System.out.println("成功进货一份珍珠");
    }

    private void addIn(Coconut c) {
        this.coconutList.add(c);
        System.out.println("成功进货一份椰果");
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredient instanceof Bubble)
            addIn((Bubble) ingredient);
        if (ingredient instanceof Coconut)
            addIn((Coconut) ingredient);

    }


    public void makeTea(String ingreName) throws SoldOutException {

        MilkTea milkTea = new MilkTea("奶茶");
        if (ingreName.equals("bubble")) {
            if (this.bubbleList.size() != 0) {
                this.bubbleList = this.bubbleList.stream().filter(item -> !item.isOutDate()).collect(Collectors.toList());
                System.out.println("成功卖出一杯: 珍珠" + milkTea.getName() + ", 配料为: " + bubbleList.get(0) + "奶茶");
                bubbleList.remove(0);
            }
            if (this.bubbleList.size() == 0) {
                System.out.println("珍珠缺货");
                throw new SoldOutException();
            }
        } else if (ingreName.equals("coconut")) {
            if (this.coconutList.size() != 0) {
                this.coconutList = this.coconutList.stream().filter(item -> !item.isOutDate()).collect(Collectors.toList());
                System.out.println("成功卖出一杯: 椰果" + milkTea.getName() + ", 配料为: " + coconutList.get(0) + "奶茶");
                coconutList.remove(0);
            }
            if (this.coconutList.size() == 0) {
                System.out.println("椰果缺货");
                throw new SoldOutException();
            }
//
        }else {
            System.out.println("成功卖出一杯: " + milkTea.getName() + "无 配料为");
        }


    }

}

