# java-
java 实验五
java实验一 计202 宋明扬 2020310606
# 一、实验目的
1. 基本掌握IntelliJ IDEA Community Edition的使用方法
2. 掌握Java源程序命名、运行方法
3. 理解、掌握创建包的方法
4. 初步了解类的实例化方法
# 二、实验要求
1. 定义包
2. 组织类
3. 定义类的属性、方法
# 三、解题思路
## **步骤一**：
&emsp;&emsp;**给出了程序的源文件（如下面的三个源文件），阅读、理解其功能、含义，分析如下三个Java源程序文件的关系，理解以下三个源文件表达的实体业务逻辑关系（源文件分别描述了银行账户、存款人员、测试类）。**
## **步骤二**：
&emsp;&emsp;**在开发环境中组织代码并运行。**
## **步骤三**：
&emsp;&emsp;**在Customer类中新添加一个属性age，描述其年龄，并补充操作年龄的方法getAge。在测试类中调用这些方法。**
## **步骤四**：
&emsp;&emsp;**在理解上述程序的情况下，尝试从头分析并复写该程序。**
<br>&emsp;&emsp;对于该程序的理解：
1. 模拟了银行录入以及更改存款人信息的系统。
2. 首先建立类银行账户（Account），在里面设置属性余额（balance）。设置构造函数，能够接收输入的账户余额，设置函数getBalance获取余额，设置函数deposit用来增加余额数目，设置函数withdraw用来减少余额数目。在这其中，运用了boolean类型，进行了一下
3. 然后建立类存款人员（Customer）,在里面设置属性Account类account，字符串类型firstName，以及字符串类型lastName,和整型age。构造函数，用来接收存款人的姓名和年龄。设置函数getFirstName、getLastName分别获取姓和名,以及getAccount获取银行账户,getAge获取年龄，还设置了一个setAccount函数用来更改账户，因为一人可以有多个账户。
4. 最后设置一个测试类TestBanking用来测试前面两个类中的方法功能。设置main函数，创建新对象，通过调用前两个类里的函数来实现获取某个人员的姓名年龄，并且能够在执行一些账户交易，增加或减少一些价格，最后显示该人物的所有账户信息。
# 四、流程图
![avatar](https://github.com/songmingyang01/java-1/blob/main/%E6%B5%81%E7%A8%8B%E5%9B%BE.png)
# 五、关键代码
1. Account类里面，有两个函数用来实现存钱和取钱。通过布尔类型，来判断取钱的金额是否是这个账户能负担得起的。
```java 
    public double getBalance(){
        return balance;
    }
    public boolean deposit(double amount){
        balance=balance+amount;
        return true;
    }
    public boolean withdraw(double amount){
        boolean result=true;
        if(balance<amount){
            result=false;
        }
        else{
            balance=balance-amount;
        }
        return result;
    }
```
2. Customer类里面，添加age属性，与构造函数的参数相对应。
```
private int age;
```
3. TestBanking类里，采用如下方式，将Account和Customer实例化，并将两者联系在一起。
 ```
    Customer customer;
    Account account;
    customer.setAccount(new Account(500.00));
    account=customer.getAccount();
 ```
# 六、系统运行截图
&emsp;&emsp;下图是本实验主程序TestBanking.java的运行结果。
<br>![avatar](https://github.com/songmingyang01/java-1/blob/main/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C%E6%88%AA%E5%9B%BE.png)
# 七、感想与体会
&emsp;&emsp;本次实验是我们的第一次上机实验，我在实验过程中遇到了许多困难，但也通过自己的学习将这些困难解决，并对自己的能力有了提高。
<br>&emsp;&emsp;学习中，在程序阅读时，遇到了许多困难，有一点的吃力，但随着这些问题的出现，我也及时查找了相关资料，也都顺利解决了。在整个学习过程中，我有很多收获。首先是内容上，通读代码，的确帮助我更好地了解了文件的整体结构形式，以及处理一件事情的大体机制；同时，也通过自主学习学会了许多新的知识
<br>&emsp;&emsp;在学习的过程中我认识到了自己的不足，面对许多问题是无法解决，有时也需要寻求同学和网络的帮助，在今后的的学习中，我一定会在上课时认真听讲，课下寻找一些方法自主学习，不断提高自己的能力，使自己在Java方面的知识有更大的提高。
