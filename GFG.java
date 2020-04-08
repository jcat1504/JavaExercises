//CURRYING FUNCTIONS
//the concept of breaking a function with many arguments into many functions with single argument in such a way that the output is the same
//the technique of simplifying a multi-valued argument function into a single valued argument multi-functions
import java.util.function.Function;

public class GFG {
    public static void main(String args[]){
        Function<Integer,
        Function<Integer, Integer> >
        curryAdder = u -> v -> u + v;
        //calling the curried functions

        //calling curried function for adding u & v
        System.out.println("Add 2, 3 :"
        + curryAdder
        .apply(2)
        .apply(3));
    }
}