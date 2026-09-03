package CP;

import TDAs.LinkedStack;

public class Practice02_FirstExercise {
    public static void main(String[] args) {
        LinkedStack<Integer> S = new LinkedStack();
        LinkedStack<Integer> T = new LinkedStack();
        S.push(5);
        S.push(6);
        S.push(7);
        S.push(8);
        S.push(9);
        S.push(10);
        System.out.println("S:");
        printStack(S);
        transfer(S,T);

        System.out.println("T:");
        printStack(T);




    }
    public static void transfer(LinkedStack<Integer> S, LinkedStack<Integer> T){
        LinkedStack<Integer> Scopy = new LinkedStack<>();

        while (!S.isEmpty()){
            int value = S.pop();
            T.push(value);
            Scopy.push(value);
        }
        while (!Scopy.isEmpty()){
            S.push(Scopy.pop());
        }

    }
    public static void printStack(LinkedStack<Integer> S){
        LinkedStack<Integer> Scopy = new LinkedStack();
        while (!S.isEmpty()){
            int value = S.pop();
            Scopy.push(value);
            System.out.println(value);

        }
        while (!Scopy.isEmpty()){
            S.push(Scopy.pop());
        }

    }


}
