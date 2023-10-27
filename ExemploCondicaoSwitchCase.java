public class ExemploCondicaoSwitchCase {

    public static void main(String[] args) {


        int numero1 = 11;

        switch (numero1) {

            case 8:
                System.out.println("O número é 8");
                break;
            case 9:
                System.out.println("O número é 9");
                break;
            case 10:
                System.out.println("O número é 10");
                break;
            default:
                System.out.println("O número não é 8, 9 ou 10");
                break;

        }
    }

}