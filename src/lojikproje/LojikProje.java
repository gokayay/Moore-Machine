package lojikproje;

import java.util.Scanner;

public class LojikProje {

    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);
        String dizi = new String();

        int counter=0;
        int z=0;
        int check=1;

        while(check!=0){
            System.out.print("x'i Gir= ");
            int eklenecekSayi = UserInput.nextInt();
            
            if(eklenecekSayi == 1){
                dizi=dizi.concat("1");
                ++counter;
            }
            else if(eklenecekSayi == 0){
                dizi=dizi.concat("0");
                ++counter;
            }
            else{
                System.out.println("İzin Verilmeyen İşlem! 0 Ya Da 1 Giriniz.");
                continue;
            }

            if(counter>=3){
                if(dizi.charAt(counter-1)== '0' && dizi.charAt(counter-2)== '0' && dizi.charAt(counter-3)== '1'){
                    z=0;
                    System.out.println("z= "+ z);
                    System.out.println("dizi: " + dizi);
                    System.out.println("Makine Sonlandırıldı");
                    break;
                }
                else if(dizi.charAt(counter-1)== '1' && dizi.charAt(counter-2)== '1' && dizi.charAt(counter-3)== '0'){
                    z=1;
                }
                else{
                    z=0;
                }

            }

            System.out.println("z="+ z);
            System.out.println("dizi: " + dizi +"\n");
        }

    }
}
