import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      /*  int a,b,c;
        Scanner value=new Scanner(System.in);+
    while (true){
        System.out.print("enter the 1st number: ");
        a=value.nextInt();

        System.out.print("enter the 2nd number: ");
        b= value.nextInt();

        System.out.println(a+b);
        System.out.println("enter the number 0 or 1");
        c= value.nextInt();

        if(c==1){
            break;
        }
    }*/
        /*
        String nam[]={"aravind ","is ","good boy "};
        String endnam="";
        for(int i=0;i < nam;i++){
            endnam=endnam.concat(nam[i]);
        }

        System.out.println(endnam);*/

        //String x ="10";
        //int y= 20;
        //System.out.println(y+y+x+x+y+y);
     /*   int age,height;

        System.out.println("enter your age: ");
        Scanner value =new Scanner(System.in);
        age=value.nextInt();

        System.out.println("enter your height: ");
        height=value.nextInt();

        if((age >= 18 && age <=50)&&(height >=150 && height<=200)){
            System.out.println("eligable");
        }else{
            System.out.println("not eligable");
        }
                                               ////Arrays
 */
        /*
        int a[][]=new int [2][2];
        a[0][0]=10;
        a[0][1]=20;
        a[1][0]=70;
        a[1][1]=40;

        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
         */                                     //////// OPPS
        car f1=new car();
        car f2=new car();
        car f3=new car();

        f1.brand="audi ";
        f2.brand="benz ";
        f3.brand="ferrai ";

        f1.price=140000;
        f2.price=130000;
        f3.price=120000;


        f1.hi();
        f2.hi();
        f3.hi();
    }
}
