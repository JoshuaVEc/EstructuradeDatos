package CP;

import TDAs.LinkedStack;

public class Practice02_transferST {

    static void main(String[] args){

        LinkedStack<Integer> S = new LinkedStack<>();
        LinkedStack<Integer> T = new LinkedStack<>();

        S.push(3);
        S.push(2);
        S.push(1);



        transfer(S,T);

        System.out.println("A");



    }
    public static <T> void transfer(LinkedStack<T> s , LinkedStack<T> t){
        LinkedStack<T> copy = new LinkedStack<T>();
        T temporal;
        T temporal2;

        while(!s.isEmpty()){
            temporal = s.pop();
            t.push(temporal);
            copy.push(temporal);
        }


        while(!copy.isEmpty()){
            temporal2 = copy.pop();
            s.push(temporal2);
        }

    }



}
