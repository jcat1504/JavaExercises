//try and guess the output:
// public class test {
//     public static void main(String[] args) {
//         System.out.print("Y" + "O");
//         System.out.print('L' + 'O')''
//     }
// }
//output: YO155
//when we use double quotes, the text is treated as a string but single quotes, characters L and O are converted to int. 
//^^Widening primitive conversion-- L is 76 and O is 79 = 155
//BUT this only happens if an operator like + is present and it expects an int on both sides

class Test  
{ 
    public static void main(String[] args)  
    { 
        System.out.print("Y" + "O"); 
        System.out.print('L'); 
        System.out.print('O'); 
    } 
} 