package one_a_day;

import inorder.No_1;

public class T1047 {
    public String removeDuplicates(String S) {
        StringBuffer stack =new StringBuffer();

        int top =-1;
        for(int i =0;i<S.length();i++){
            char ch =S.charAt(i);
            if(top>=0&&stack.charAt(top)==ch){
                stack.deleteCharAt(top);
                top--;

            }
            else{
                stack.append(ch);
                top++;
            }
        }
        return stack.toString();
    }
    public static void main(String[] args){
        T1047 a=new T1047();
        String S="abbaca";
        System.out.print(a.removeDuplicates(S));

    }
}
