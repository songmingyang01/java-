 import java.util.Scanner;
public class Testing {
    public static String add_bd(){
        System.out.println("请输入古诗：");
        Scanner in = new Scanner(System.in);
        String s;
        s = in.nextLine();

        in.close();
        int i=1;
        char[] char_chg=s.toCharArray();//字符串转数组
        for(char hz:char_chg) {
            System.out.print(hz);
            if(i%7==0 && i%14!=0)
                System.out.print("，");
            if(i%14==0)
                System.out.println("。");
            i++;
        }
        return s;

    }

    public static void find_word(){
        Scanner in = new Scanner(System.in);
        System.out.println("是否需要分词（请输入“是”或者“否”）");
        String b = in.next();
        String needFind ;
        if(b.equals("是")){
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
            System.out.println(word+"出现第"+i+"次,位置在" + needFind.indexOf(word));
            needFind = needFind.substring(needFind.indexOf(word)+word.length());
            System.out.println("剩余的文字：" + needFind);
        }
        System.out.println(word+"一共出现了"+i+"次");
    }

    public static void main(String[] args){
        //add_bd();
        find_word();
    }
}