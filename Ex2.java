package Lab2;

public class Ex2 {
    public static void main(String[] args) {

        Ex2 ex2=new Ex2();
        ex2.Info();
    }
    private static void Info(){

        String [] country =new String[10];
        country[0]="Kazakhstan";
        country[1]="China";
        country[2]="Canada";
        country[3]=" Russia";
        country[4]="USA";
        country[5]="Brazil";
        country[6]=" Australia";
        country[7]="India";
        country[8]="Argentina";
        country[9]=" Saudi Arabia";
       long [] TheIncomeCountry={933774435L, 959896278L, 998467068L, 1712519146L, 952506736, 851576767, 768685047, 328726347, 278040057, 214969074};
        long [] Population={19169550L,1449070556L,37610000L,146267288L,321287000,203274458,27797000,1406497000,43131966,31521418};
        for ( int index = 0; index < 10; index = index + 1 )
        {
            System.out.println("Country: "+country[index]+
                    "\n The income of the country :"+TheIncomeCountry[index]+" $"+
                    "\n Population :"+Population[index]+" people");}
            System.out.println("==================================================");

        for ( int index = 0; index < 10; index = index + 1 )
        {
           // double result=TheIncomeCountry[index]/Population[index];
            System.out.println("Country: "+country[index]+
                    "\n GDP  : "+TheIncomeCountry[index]+" / "+Population[index]+" = "+TheIncomeCountry[index]/Population[index]+" $");}



    }



}
