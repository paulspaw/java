
/*
 * @Description: static 的作用
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-27 18:33:45
 * @LastEditTime: 2019-03-28 22:50:05
 */

public class DefStatic {
    public static void main(String[] args) {
        // Role bei = new Role("liubei", "shu");
        // Role yun = new Role("guanyu", "shu");
        // Role fei = new Role("zhangfei", "shu"); // 所有人的country都是“shu” 会造成内存的浪费
        Role bei = new Role("liubei");
        Role yun = new Role("guanyu");
        Role fei = new Role("zhangfei"); // 依然会输出蜀国
        // 静态方法区：存储的是静态变量和类信息(方法) -- country = "shu"
        System.out.println(bei.getInfo());
        System.out.println(yun.getInfo());
        System.out.println(fei.getInfo());
        System.out.println(Role.country);// static属性直接用类名调用
        // 直接用类名调用静态方法
        Role.setCountry("wu");
        System.out.println(Role.getCountry());
        bei = null;
        yun = null;
        fei = null;

    }
}

// 角色类
class Role {
    private String name;
    static String country = "shu"; // 将country变成静态的（全局变量）

    public String getInfo() {
        return "name = " + name + ", country = " + country;
    }

    // 初始化
    public Role() {
    }

    public Role(String name) { // 因为country是全局变量 就不要country了
        this.name = name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // 静态方法不能访问非静态的数据
    public static void setCountry(String country) {
        Role.country = country;
    }
    /*
     * public void setCountry(String country) { this.country = country; }
     */

    // getter
    public String getName() {
        return name;
    }

    public static String getCountry() {
        return country;
    }
    /*
     * public String getCountry() { return country; }
     */
}