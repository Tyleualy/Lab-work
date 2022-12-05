package Lab2;

public class Ex1 {
    public static void main(String[] args) {

        String [] People = new String [10];

       // String [] mathQ ={ "1*2", "2*3", "3*4", "5*6", "6*7", "7*8", "8*9","9*9","1*1","2*2"};

        int [] a1= {1,2,3,4,5,6,7,8,9,10};
        int [] a2= {6,7,8,9,10,5,4,3,2,1};
        People [0] = "Ramazan";
        People [1] = "Say";
        People [2] = "Anuar";
        People [3] = "Arsen";
        People [4] = "Almas";
        People [5] = "Shaka";
        People [6] = "Adil";
        People [7] = "Aiman";
        People [8] = "jon";
        People [9] = "Josh";
        System.out.println("Hello, Welcome to Class");
        System.out.println("\nyour math questions: ");
        for ( int index = 0; index < 10; index = index + 1 )
        {
            System.out.println(People[index]);
            System.out.println("\t" + "Question : " + a1[index]+"*"+a2[index] +"= ?");

        }
        }}


