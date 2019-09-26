## Notes of Java
### 小点
java的main函数是固定的:
```JAVA
public static void main(String[] args) {...}
```
### 关键字
关键字所有的字母都是小写

### 标识符
1. 数字，符号不能开头
2. 严格区分大小写
3. 不能包含空格
4. 不能单独使用关键字和保留字，可以包括

### 命名规范
1. 包名: 所有字母小写 xxxyyyzzz
2. 类名、接口名: 所有单词的首字母要大写 XxxYyyZzz
3. 变量名、方法名: 第一个字母小写 xxxYyyZzz
4. 常量名: 所有字母大写并以下划线间隔 XXX_YYY_ZZZ

### 变量定义
###### 数据类型 变量名 = 变量的值; int i = 1;
变量储存在内存中

### 数据类型
1. 基本数据类型 8种
   - 整数类型: byte(1) short(2) int(4) long(8)
   - 浮点类型: float(4) double(8)
   - 字符: char(2) 单引号
   - 布尔类型: boolean b = true;
   - 注意: long：i = 10l, float： i = 1.2f
2. 引用数据类型 其他
   - String类 String str = "hello";
   - 注意：所有引用类型，都可以初始化为null

### 数组
#### 一维数组
声明
> 数据类型[] 变量名称;
> int[] ii; # 声明int类型的数组ii

初始化
> 数据类型[] 变量名称 = new 数据类型[长度];

> int[] ii = new int[4]; // 默认值为0

> int[] ii = new int[]{1,2,3,4}; // 已经存放了4个数值

> 声明能放4个int的数组

数组长度
> ii.length
#### 二维数组
声明和初始化(动态)
> 数据类型[][] 变量名 = new 数据类型[一维长度][二维长度];

只定义第一维的长度
> int[][] arr = new int[3][];
#### 特殊写法
> int[] x,y[];

> x是一维数组， y是二维数组

#### 数组操作
复制
```java
int[] copy = new int[arr.length];
```

赋值
```java
int[] copy = arr;
```
反转
```java
int[] tmp = new int[arr.length];
for(int i = arr.length; i >= 0; i--){
    tmp[k] = arr[i];
    k++;
}
```

#### 数组排序
冒泡排序
```java
public static void main(String[] args){
  int tmp = 0;
  for(int i = 0; i < arr.lenght-1;i++){ //循环轮次，数组长度-1
      for(int j = 0; j < arr.lenght-1-i; j++){ //每一轮次的数字对比排序,轮次长度-1-i
        if(arr[j] > arr[j+1]){
            tmp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = tmp;
        }  
      }
  }
}
```

### 面向对象
#### 三大特征
> 封装
> 继承
> 多态

#### java类及类成员
> 属性(Field)：对应类中的成员变量
 - 可以先声明，后初始化，自带默认值
> 行为(Method)：对应类中的成员方法

#### 类
实例化类
> 类名 变量名 = new 类名();

private
> 可以在本类内使用 不可以在外部使用

变量的分类
> 1.成员变量
  - 实例变量（不以static修饰）
  - 类变量（以static修饰）
> 2.局部变量
  - 形参（方法签名中定义的变量）
  - 方法局部变量（在方法内定义）
  - 代码块局部变量（在代码块内定义）
 
#### 对象
匿名对象 
> 使用情况
 - 只需要一次调用
 - 作为实参传递给一个方法
 
> new 类名().方法名(形参);
> new Person().showInfo();

#### 方法
##### 方法的重载(OVERLOAD)
概念
> 在同一个类中，允许存在一个以上的同名方法，只要其中一个不同：
   - 参数个数
   - 参数类型



方法参数传递
> java中的参数传递只有：值传递

> 形参是基本数据类型，实参向形参传递参数时，就是直接传递值，栈内存
> 中的值就是那个数值

> 形参是对象，，实参向形参传递参数时，传递实参在栈内存的值，
> 也就是引用对象的地址

可变个数的参数
> 第一种，数组方式
```java
public void Info(String[] args){
  for(int i = 0; i < args.length;i++){
      System.out.println(args[i]);
  }
}

public void Info(int[] args){
  for(int i = 0; i < args.length;i++){
      System.out.println(args[i]);
  }
}
```

> 第二种，java特有
```java
public void Info(String... args){
  for(int i = 0; i < args.length;i++){
      System.out.println(args[i]);
  }
}
```

> 注意：可变参数作为形参，在方法中一定要放在最后