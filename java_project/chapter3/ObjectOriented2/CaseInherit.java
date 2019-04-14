import java.util.Arrays;

/*
 * @Description: 继承的应用示例，实现一个化妆品商城的化妆品管理 
 *              1.使用继承实现一个可按单价排序输出所有化妆品的功能
 *              2.使用继承实现一个只输出进口化妆品的功能
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-29 14:40:24
 * @LastEditTime: 2019-03-29 15:23:59
 */

public class CaseInherit {
    public static void main(String[] args) {
        ImportCosmeticManager cm = new ImportCosmeticManager();
        cm.add(new Cosmetic("Chanel", "entrance", 1500));
        cm.add(new Cosmetic("Lancome", "entrance", 1200));
        cm.add(new Cosmetic("DaBao", "domestic", 99));
        cm.add(new Cosmetic("Ysl", "entrance", 900));
        cm.add(new Cosmetic("Addidas", "entrance", 500));
        cm.printInfo();
    }
}

class SortCosmeticManager extends CosmeticManager { // 重写化妆品管理类中的 输出价格方法 从小到大
    @Override
    public void printInfo() { // 重写输出所有信息
        Cosmetic[] tmp = Arrays.copyOf(cs, count);
        // System.out.println(tmp.length);
        Cosmetic c = null;
        for (int i = 0; i < tmp.length - 1; i++) {
            for (int j = 0; j < tmp.length - i - 1; j++) {
                if (tmp[j].getPrice() > tmp[j + 1].getPrice()) {
                    c = tmp[j];
                    tmp[j] = tmp[j + 1];
                    tmp[j + 1] = c;
                }
            }
        }
        for (Cosmetic comestic : tmp) {
            System.out.println(comestic.getInfo());
        }
    }
}

class ImportCosmeticManager extends CosmeticManager { // 只输出进口化妆品
    public ImportCosmeticManager() {
    }

    @Override
    public void printInfo() { // 重写printInfo()
        for (int i = 0; i < count; i++) {
            if ("entrance".equals(cs[i].getType())) { // 比较两个字符串的值是否相等，不能使用 == ，使用equals()
                System.out.println(cs[i].getInfo());
            }
        }
    }
}

// 化妆品管理类 -- 父类
class CosmeticManager {
    public CosmeticManager() {
    }

    protected Cosmetic[] cs = new Cosmetic[4];
    protected int count = 0;

    public void add(Cosmetic c) { // 进货
        if (count >= cs.length) {
            int newLen = cs.length * 2;
            cs = Arrays.copyOf(cs, newLen);
        }
        cs[count++] = c;
    }

    public void printInfo() { // 输出所有信息
        for (int i = 0; i < count; i++) {
            System.out.println(cs[i].getInfo());
        }
    }

}

// 化妆品类
class Cosmetic {
    private String name;
    private String type;
    private int price;

    public Cosmetic() {
    }

    public Cosmetic(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getInfo() { // 返回所有信息
        return "name = " + name + ", type = " + type + ", price = " + price;
    }
}