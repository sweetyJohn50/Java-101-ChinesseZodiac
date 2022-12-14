package Zodiac;
import  java.util.Scanner;
public class Zodiac {
    
    public static void main(String[] args) {
        
        int year ,zodiac;
        String burc = "";

        Scanner i = new Scanner(System.in);

        System.out.print("Lütfen doğum yılınızı giriniz : ");

        year = i.nextInt();
        
        i.close();

        zodiac = year % 12;
       
       if(year >= 1 && year <= 9999){
        switch(zodiac){
            
            case 0:
               burc = "Maymun";
            break;

            case 1:
               burc = "Horoz";
            break;

            case 2:
               burc = "Köpek";
            break;

            case 3:
               burc = "Domuz";
            break;

            case 4:
               burc = "Fare";
            break;

            case 5:
               burc = "Öküz";
            break;

            case 6:
               burc = "Kaplan";
            break;

            case 7:
               burc = "Tavşan";
            break;

            case 8:
               burc = "Ejderha";
            break;

            case 9:
               burc = "Yılan";
            break;
            
            case 10:
               burc = "At";
            break;

            case 11:
               burc = "Koyun";
            break;

            

        }
       } else{
           System.out.println("Hatalı Bir yıl girdiniz!! min = 1 max = 9999 arasında bir değer giriniz");
       }
       
       System.out.println("Çin Zodyağı burcunuz : "+ burc);
    }
}
       // Hakan Çoban 
       // https://app.patika.dev/hknxx