
/*
 * @Description: 对象的一对一关系
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-27 18:07:45
 * @LastEditTime: 2019-03-28 22:50:42
 */
class RelationOneToOne {
    public static void main(String[] args) {
        Hero hero = new Hero("paul", 25);
        Weapon weapon = new Weapon("skysord", 1);

        // 把两个对象关联
        hero.setWeapon(weapon);
        weapon.setHero(hero);

        // 通过英雄获取他的信息
        String name = hero.getName();
        int age = hero.getAge();
        Weapon w = hero.getWeapon();
        System.out.println(
                "name is " + name + ", age is " + age + ", weapon is " + w.getName() + ", grade is " + w.getGrage());

    }
}

// 英雄类
class Hero {
    private String name;
    private int age;
    private Weapon weapon; // 一对一的关系

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    // 初始化类
    public Hero() {
    }

    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
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

}

// 兵器类
class Weapon {
    private String name;
    private int grade;
    private Hero hero;

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Hero getHero() {
        return hero;
    }

    // 初始化类
    public Weapon() {
    }

    public Weapon(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrage(int grade) {
        this.grade = grade;
    }

    public int getGrage() {
        return grade;
    }
}