import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day, month;
        String monthErrorMessage="Ayı Hatalı Girdiniz!!!", dayErrorMessage ="Günü Hatalı Girdiniz!!!",
                koc = "Burcunuz: Koç", boga = "Burcunuz: Boğa", ikizler = "Burcunuz: İkizler", yengec = "Burcunuz: Yengec",
                aslan = "Burcunuz: Aslan", basak = "Burcunuz: Başak", terazi = "Burcunuz: Terazi", akrep = "Burcunuz: Akrep",
                yay = "Burcunuz: Yay", oglak = "Burcunuz: Oğlak", kova = "Burcunuz: Kova", balik = "Burcunuz: Balık";

        System.out.print("Kaçıncı ayda doğduğunuzu giriniz: ");
        month = input.nextInt();

        System.out.print("Ayın kaçıncı gününde doğduğunuzu giriniz: ");
        day = input.nextInt();

        if (month == 1) {
            if (day>0 && day <= 21) {
                System.out.println(oglak);
            }
            else if (day>=22 && day<=31){
                System.out.println(kova);
            }
            else{
                System.out.println(dayErrorMessage);
            }
        }
        else if (month==2){
            if (day>0 && day<=19){
                System.out.println(kova);
            }
            else if (day>=20 && day<=29){
                System.out.println(balik);
            }
            else{
                System.out.println(dayErrorMessage);
            }
        }
        else if (month==3){
            if (day>0 && day<=20){
                System.out.println(balik);
            }
            else if (day>=21 && day<=31){
                System.out.println(koc);
            }
            else{
                System.out.println(dayErrorMessage);
            }
        }
        else if (month==4){
            if (day>0 && day<=20){
                System.out.println(koc);
            }
            else if (day>=21 && day<=30){
                System.out.println(boga);
            }
            else{
                System.out.println(dayErrorMessage);
            }
        }
        else if (month==5){
            if (day>0 && day<=21){
                System.out.println(boga);
            }
            else if (day>=22 && day<=31){
                System.out.println(ikizler);
            }
            else{
                System.out.println(dayErrorMessage);
            }
        }
        else if (month==6){
            if (day>0 && day<=22){
                System.out.println(ikizler);
            }
            else if (day>=23 && day<=30){
                System.out.println(yengec);
            }
            else {
                System.out.println(dayErrorMessage);
            }
        }
        else if(month==7){
            if (day>0 && day<=22){
                System.out.println(yengec);
            }
            else if (day>=23 && day<=31){
                System.out.println(aslan);
            }
            else {
                System.out.println(dayErrorMessage);
            }
        }
        else if (month==8){
            if (day>0 && day<=22){
                System.out.println(aslan);
            }
            else if (day>=23 && day<=31){
                System.out.println(basak);
            }
            else {
                System.out.println(dayErrorMessage);
            }
        }
        else if (month==9){
            if (day>0 && day<=22){
                System.out.println(basak);
            }
            else if (day>=23 && day<=30){
                System.out.println(terazi);
            }
            else {
                System.out.println(dayErrorMessage);
            }
        }
        else if (month==10){
            if (day>0 && day<=22){
                System.out.println(terazi);
            }
            else if (day>=23 && day<=31){
                System.out.println(akrep);
            }
            else {
                System.out.println(dayErrorMessage);
            }
        }
        else if (month==11){
            if (day >0 && day<=21){
                System.out.println(akrep);
            }
            else if (day>=22 && day<=30){
                System.out.println(yay);
            }
            else {
                System.out.println(dayErrorMessage);
            }
        }
        else if (month==12){
            if (day > 0 && day<=21){
                System.out.println(yay);
            }
            else if (day>=22 && day<=31){
                System.out.println(oglak);
            }
            else {
                System.out.println(dayErrorMessage);
            }
        }
        else {
            System.out.println(monthErrorMessage);
        }
    }
}
