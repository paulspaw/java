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