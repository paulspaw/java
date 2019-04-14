import java.util.Arrays;

/*
 * @Description: 使用对象数组实现多个Chickend的管理
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-28 11:36:08
 * @LastEditTime: 2019-03-28 22:51:27
 */

public class ObjectArrays {
    public static void main(String[] args) {
        ChickenManager cm = new ChickenManager(5);
        // 添加
        cm.add(new Chicken(1, "little", 10));
        cm.add(new Chicken(2, "little2", 7));
        cm.add(new Chicken(3, "little3", 5));
        cm.add(new Chicken(4, "little4", 3));
        cm.add(new Chicken(5, "little5", 1));
        // 多添加一个的话
        cm.add(new Chicken(6, "little6", 4));
        System.out.println("数组长度 = " + cm.Length());
        System.out.println("----------find---------");
        Chicken c = cm.find(6);
        c.print();
        System.out.println("----------printAll---------");
        cm.printAll();
        System.out.println("----------update---------");
        cm.update(new Chicken(1, "ironman", 20));
        c = cm.find(1);
        c.print();
    }
}

// 小鸡管理类
class ChickenManager {
    private Chicken[] cs = null;
    private int count = 0; // 记录当前数组的元素个数（下标）

    public ChickenManager(int size) {
        if (size > 0) {
            cs = new Chicken[size];
        } else {
            cs = new Chicken[5];
        }
    }

    public int Length() {
        return cs.length;
    }

    public void add(Chicken c) { // 添加
        if (count >= cs.length) { // 数组已满，需要扩充
            // 算法1:扩充原来数组大小的一半（odd+1）-> cd.length*3/2+1
            // 算法2:扩产原来数组大小的一倍（*2）-> cd.length*2
            int newLen = cs.length * 2;
            cs = Arrays.copyOf(cs, newLen);

        }
        cs[count++] = c; // 扩充以后也要添加操作
    }

    public void delete(int id) { // 删除
        // 删除一个后为nll 这个位置之后的元素往前提一个空出最后一个 确保前面是连续的
        for (int i = 0; i < count; i++) {
            if (cs[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    cs[j] = cs[j + 1];
                }
                cs[count - 1] = null; // 最后一个为null
                count--; // 下标-1
                break;
            }
        }
    }

    public void update(Chicken c) { // 更新
        Chicken tmp = find(c.getId());
        if (tmp != null) {
            tmp.setName(c.getName());
            tmp.setAge(c.getAge());
        }
    }

    public Chicken find(int id) { // 查找
        for (int i = 0; i < cs.length; i++) {
            if (cs[i].getId() == id) {
                return cs[i];
            }
        }
        return null;
    }

    public void printAll() { // 输出所有
        for (int i = 0; i < count; i++) {
            cs[i].print();
        }
    }
}

// 小鸡类（称为数据对象） 鸡舍实例实现对象数组
// 这种类叫做 Value Object(VO)
class Chicken {
    private int id;
    private String name;
    private int age;

    public Chicken() {
    }

    public Chicken(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println("id = " + id + ", name = " + name + ", age = " + age);
    }
}
