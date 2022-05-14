public class TesteDeControladorDeLetrasJaDigitadas {
    public static void main (String[] args)
    {
        // teste 1 contrutor
        try
        {
            ControladorDeLetrasJaDigitadas cl1 = new ControladorDeLetrasJaDigitadas ();
            System.out.println ("teste 1 : Deu certo construir palavra null");

        }
        catch (Exception erro)
        {
            System.err.println ("teste 1 : Deu erro construir palavra null");
            System.err.println (erro);
        }
        //teste 2 registre
        try
        {
            ControladorDeLetrasJaDigitadas cl2 = new ControladorDeLetrasJaDigitadas();
            cl2.registre('x');
            System.out.println ("teste 2 : Deu certo registrar uma letra");

        }
        catch (Exception erro)
        {
            System.err.println ("teste 2 : Deu erro ao registrar uma letra");
            System.err.println (erro);
        }
        //teste 3 registre de erro
        try
        {
            ControladorDeLetrasJaDigitadas cl10 = new ControladorDeLetrasJaDigitadas();
            cl10.registre('x');
            cl10.registre('x');
            System.out.println ("teste 3 : Deu certo registrar uma letra");

        }
        catch (Exception erro)
        {
            System.err.println ("teste 3 : Deu erro ao registrar uma letra");
            System.err.println (erro);
        }
        //teste 4 isJaDigitada

        try
        {
            ControladorDeLetrasJaDigitadas cl3 = new ControladorDeLetrasJaDigitadas();
            cl3.registre('x');
            System.out.println ("teste 4 : Deu certo procurar uma letra "+
                    cl3.isJaDigitada('a')
                    );

        }
        catch (Exception erro)
        {
            System.err.println ("teste 4 : Deu erro ao procurar uma letra");
            System.err.println (erro);
        }
        //teste 5 isJaDigitada
        try
        {

            ControladorDeLetrasJaDigitadas cl4 = new ControladorDeLetrasJaDigitadas();
            cl4.registre('x');
            System.out.println ("teste 5 : Deu certo procurar uma letra "+
                    cl4.isJaDigitada('x')
            );

        }
        catch (Exception erro)
        {
            System.err.println ("teste 5 :  Deu erro ao procurar uma letra");
            System.err.println (erro);
        }
        //teste 6 toString
        try
        {
            ControladorDeLetrasJaDigitadas cl5 = new ControladorDeLetrasJaDigitadas();
            cl5.registre('f');
            cl5.registre('g');
            cl5.registre('t');

            System.out.println ("teste 6 : Deu certo procurar uma letra "+cl5);

        }
        catch (Exception erro)
        {
            System.err.println ("teste 6 : Deu erro ao procurar uma letra");
            System.err.println (erro);
        }

        //teste 7 toString/equals
        ControladorDeLetrasJaDigitadas cl6 = null;

        try
        {
            cl6 = new ControladorDeLetrasJaDigitadas();
            cl6.registre('f');
            cl6.registre('g');
            cl6.registre('t');

            System.out.println ("teste 7 : Deu certo procurar uma letra "+cl6);

        }
        catch (Exception erro)
        {
            System.err.println ("teste 7 : Deu erro ao procurar uma letra");
            System.err.println (erro);
        }
        //teste 8 toString/equals
        ControladorDeLetrasJaDigitadas cl7 = null;

        try
        {
            cl7 = new ControladorDeLetrasJaDigitadas();
            cl7.registre('w');

            System.out.println ("teste 8 : Deu certo procurar uma letra "+cl7);

        }
        catch (Exception erro)
        {
            System.err.println ("teste 8 : Deu erro ao procurar uma letra");
            System.err.println (erro);
        }

        //teste 9 equals
        System.out.println ("teste 9 :"+ cl6 + " são as letras que estamos testando");
        //teste 10 equals
        System.out.println ("teste 10 :Eh "+cl6.equals(null)+" que \"f,g,t\" eh igual (pelo equals) a null");
        //teste 11 equals
        System.out.println ("teste 11 :Eh "+cl6.equals(cl6)+" que \"f,g,t\" eh igual (pelo equals) a si mesmo");
        // teste 12
        System.out.println ("teste 12 :Eh "+cl6.equals("f,g,t")+" que \"f,g,t\" eh igual (pelo equals) ao String \"f,g,t\"");//COMOASSIMMDS?
        // teste 13
        System.out.println ("teste 13 :Eh "+cl6.equals(cl7)+" que \"f,g,t\" eh igual (pelo equals) a \"w\"");
        // teste 14
        System.out.println ("teste 14 :Eh "+(cl6.hashCode()==cl7.hashCode())+" que o hashCode de um \"f,g,t\" eh igual ao hashCode de outro \"w\"");
        // teste 15
        System.out.println ("teste 15 :Eh "+(cl6.hashCode()==cl6.hashCode())+" que o hashCode de um \"f,g,t\" eh igual ao hashCode de outro \"f,g,t\"");
        // teste 16 construtor de copia

        try
        {
            ControladorDeLetrasJaDigitadas cl8 = new ControladorDeLetrasJaDigitadas(cl6);

            System.out.println ("teste 16 :Deu certo usar o construtor de cópia "+cl6);
            System.out.println(cl6);
            System.out.println(cl8);
        }
        catch (Exception erro)
        {
            System.err.println ("teste 16 :Deu erro ao usar o construtor de cópia");
            System.err.println (erro);
        }
        // teste 17 construtor de copia

        try
        {
            ControladorDeLetrasJaDigitadas cl8 = new ControladorDeLetrasJaDigitadas(null);

            System.out.println ("teste 17 :Deu certo usar o construtor de cópia "+cl6);

        }
        catch (Exception erro)
        {
            System.err.println ("teste 17 :Deu erro ao usar o construtor de cópia");
            System.err.println (erro);
        }
        // teste 18 clone
        try
        {
            ControladorDeLetrasJaDigitadas cl9 = (ControladorDeLetrasJaDigitadas)cl7.clone();

            System.out.println ("teste 18 :Deu certo usar o clone "+cl7);
            System.out.println(cl7);
            System.out.println(cl9);
        }
        catch (Exception erro)
        {
            System.err.println ("teste 18 :Deu erro ao clonar");
            System.err.println (erro);
        }
    }
}
