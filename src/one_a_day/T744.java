package one_a_day;

//char类型的值用单引号引起来的单个字符
//        如: char a = 'b'
//
//        而java中的双引号 表示字符串 一个或多个字符
//        如 String c = "abc"
//        String d="a"
//        和char d=‘a’

public class T744 {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length-1;i++){
            if(letters[i]<=target&&letters[i+1]>target){
                return letters[i+1];
            }
        }
        return letters[0];

    }
    public static void main(String[] args){
        T744 a=new T744();
        char[] letters = new char[]{'c', 'f', 'j'};
//        letters =["c", "f", "j"];
        char target = 'c';
        System.out.print(a.nextGreatestLetter(letters,target));

    }
}
