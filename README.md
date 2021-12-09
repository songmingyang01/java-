# java-
java 实验五
<br>计202 宋明扬 2020310606
# 一、实验目的
掌握字符串String及其常用方法的使用
# 二、业务要求
&emsp;&emsp;有《长恨歌》古诗词，在经某程序处理后，被删去了非汉字部分，如标点符号、回车换行等。现请设计程序恢复。
<br>&emsp;&emsp;要求如下：
<br>&emsp;&emsp;1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”；
<br>&emsp;&emsp;2.允许提供输入参数，统计古诗中某个字或词出现的次数。
<br>输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>
<br>输出：
<br>汉皇重色思倾国，御宇多年求不得。
<br>杨家有女初长成，养在深闺人未识。
<br>天生丽质难自弃，一朝选在君王侧。
<br>回眸一笑百媚生，六宫粉黛无颜色。
<br>春寒赐浴华清池，温泉水滑洗凝脂。
<br>侍儿扶起娇无力，始是新承恩泽时。
<br>云鬓花颜金步摇，芙蓉帐暖度春宵。
<br>春宵苦短日高起，从此君王不早朝。
<br>............
# 三、解题思路
## **步骤一**：
&emsp;&emsp;**将所给古诗每隔七个字设定一个位置，在奇数位置加入“，”，在偶数位置加入“。”并进行换行。实现对古诗的加标点。**
## **步骤二**：
&emsp;&emsp;**读取所输入的要搜索的词，与古诗内容进行比较，输出出现的次数。**
# 四、关键代码
1.函数add_bd实现对古诗加标点。
```java 
   public static String add_bd(){
        System.out.println("请输入古诗");
        Scanner in = new Scanner(System.in);
        String poetry = in.nextLine();
        String poem = "";
        int j=0;
        for(int i =0;i<poetry.length();i+=7){
            String a = poetry.substring(i,i+7);
            boolean b = j % 2 == 0;
            if(b == true){
                poem = poem + a+"，";
            }
            else{
                poem = poem + a+"。\n";
            }
            j++;
        }
        System.out.println(poem);
        return poem;
    }

```
2. 函数find_word实现对所要搜索的内容进行查询。
```java
 public static void find_word(){
        Scanner in = new Scanner(System.in);
        System.out.println("是否需要对古诗加入标点（请输入“是”或者“否”）");
        String a = in.next();
        String needFind = "";
        if(a.equals("是")){
            needFind = Testing.add_bd();
        }
        else{
            System.out.println("请输入古诗");
            needFind = in.next();
        }
        System.out.println("请输入想要检测的单词");
        String word = in.next();
        int i = 0;
        while (needFind.indexOf(word) != -1 ){
            i++;
            needFind = needFind.substring(needFind.indexOf(word)+word.length());
        }
        System.out.println(word+"一共出现了"+i+"次");
    }
```
# 五、系统运行截图
&emsp;&emsp;下图是本实验程序的运行结果。
<br>![avatar](https://github.com/songmingyang01/java-1/blob/main/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C%E6%88%AA%E5%9B%BE.png)
# 六、感想与体会
&emsp;&emsp;本次实验实现了古诗的添加标点和搜索单词，较为简单，巩固了课上的所学知识，同时也自主搜索到了一些新的知识学习，对自己有了较大的提高。
