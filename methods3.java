

public class methods3 {

    public static boolean asalmi(int sayi){

        for (int i = 2; i < sayi; i++){
            if (sayi % i == 0){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        for (int a = 2; a < 1000; a++){
            if(asalmi(a) == true){
                System.out.println(a);
            }

        }
    }
}




/*TAMAMEN AYNI ÇIKTIYI VEREN BIR KOD:


public class methods3 {


    public static boolean asalmi(int sayi){

        boolean isAsal = true;

        for(int i = 2; i < sayi; i++){
            if ((sayi % i) == 0)
            {
                isAsal = false;
                break;
            }
        }

        return isAsal;
    }



    public static void main(String[] args) {
        for (int a = 2; a < 1000; a++){
            if(asalmi(a) == true){
                System.out.println(a);
            }

        }
    }
}

 */