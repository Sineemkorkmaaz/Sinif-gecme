import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {
        int mat,fiz,bio,turk,kim ;


        Scanner input =new Scanner(System.in);
        System.out.print("Matematik notunuz:");
        mat =input.nextInt();
        mat=(mat>0 && mat<101)?mat:0;

        System.out.print("Fizik notunuz:");
        fiz= input.nextInt();
        fiz=(fiz>0 && fiz<101)?fiz:0;

        System.out.print("Biyoloji notunuz:");
        bio = input.nextInt();
        bio=(bio>0 && bio<101)?bio:0;

        System.out.print("Türkçe notunuz:");
        turk =input.nextInt();
        turk=(turk>0 &&turk<101)?turk:0;

        System.out.print("Kimya notunuz:");
        kim = input.nextInt();
        kim=(kim>0 && kim<101)?kim:0;

        double avarage = (mat+fiz+bio+turk+kim)/5 ;
        if (avarage<55) {
            System.out.println("Sınıfta kaldınız.");
        }else {
            System.out.println("Tebrikler sınıfı geçtiniz :)");
        }

        System.out.println("Not ortalamanız :" + avarage);
    }

}
