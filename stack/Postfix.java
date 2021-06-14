package stack;
import java.util.*;
public class Postfix {

    public int solve(String arg){
        String[] arr=arg.split(" ");
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            if(s.matches("\\d")){
                st.push(Integer.parseInt(s));
            }else{
                int x=st.pop();
                int y=st.pop();
                if(s.equals("+")){ 
                     st.push(x+y);
                }else if(s.equals("-")){
                     st.push(x-y);
                }else if(s.equals("*")){
                     st.push(x*y);
                }else{
                     st.push(x/y);
                }
            }
        }

        return st.pop();
    }



    public static void main(String[] args) {
        Postfix pf=new Postfix();
        System.out.println(pf.solve("2 4 5 + *"));
        
    }
    
}
