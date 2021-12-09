import java.util.Scanner;

public class Testing {
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

    public static void main(String[] args){
        find_word();
    }
}

