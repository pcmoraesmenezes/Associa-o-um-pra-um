import java.sql.SQLOutput;

public class PontoTeste {
    public static void main(String[] args) {
        //Declare duas variaveis do tipo ponto
        Ponto primeiroPonto;
        Ponto segundoPonto;

        //Atribua primeiroPonto a um objeto do tipo Ponto
        System.out.println("Criando o primeiro Ponto: ");
        primeiroPonto = new Ponto();
        System.out.println();

        //Atribua segundoPonto a um objeto do tipo ponto criado a partir do construtor. O primeiro valor de x é 400 e o de Y é 230
        System.out.println("Criando o Segundo Ponto: ");
        segundoPonto = new Ponto(400,230);
        System.out.println();;


        //Configure os valores de X, Y de primeiro ponto como 200, 200
        primeiroPonto.setX(200);
        primeiroPonto.setY(200);

        //Exiba no console as variaveis Ponto
        System.out.println("Coordenadas do Primeiro Ponto -> X:"+ primeiroPonto.getX()+ " Y:" + primeiroPonto.getY());
        System.out.println("Coordenadas do Segundo Ponto -> X:"+ segundoPonto.getX()+ " Y:" + segundoPonto.getY());
        System.out.println();

        //Declare uma nova variavel do tipo Ponto
        Ponto outroPonto;

        //Atribua a essa variavel a referencia representada pelo segundoPonto
        outroPonto = segundoPonto;

        //Atribua novos valores para os objetos instanciados da nova variavel
        outroPonto.setX(300);
        outroPonto.setY(200);

        //Imprima o conteudo da nova variavel e o conteudo do segundoPonto
        System.out.println("Coordenadas do novo Ponto -> X:"+ outroPonto.getX()+ " Y:" + outroPonto.getY());
        System.out.println("Coordenadas do Segundo Ponto -> X:"+ segundoPonto.getX()+ " Y:" + segundoPonto.getY());
        System.out.println();

        /*
        Note que como as variaveis apontavam para o mesmo local da heap, quando uma foi modificada, ocorreu a modificação em ambas
         */
    }

}
