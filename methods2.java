

public class methods2 {

    public static int ikiilecarp(int a){
        return a*2;
    }

    public static int ikiiletopla(int a){
        return a+2;
    }

    public static int dortilecarp(int a){
        return a*4;
    }

    /*Void dış dünyaya bir şey döndürmez. Bu yüzden voidi silip int yazdık.
    *Return, bize fonksiyondan çıktı almamızı sağlar. Return olmasaydı bu çıktıyı başka bir fonksiyonda kullanamazdık.
    * Aynı zamanda return, fonksiyonun bitiş noktasıdır. Sonrasında hiçbir şey yazılmaz.*/

    public static void main(String[] args) {

        System.out.println(dortilecarp(ikiiletopla(ikiilecarp(8))));

    }
}

