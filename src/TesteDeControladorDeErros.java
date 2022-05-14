public class TesteDeControladorDeErros {

    public static void main (String[] args)
    {
        //teste 1 num negativos
        try
        {
            ControladorDeErros e1 = new ControladorDeErros (-1);
            System.out.println ("teste 1: Deu certo construir o metodo construtor com valor negativo");
        }
        catch (Exception erro)
        {
            System.err.println ("teste 1: Deu erro construir o metodo construtor com valor negativo");
            System.err.println (erro);
        }
        //teste 2 num negativos
        try
        {
            ControladorDeErros e2 = new ControladorDeErros (1);
            System.out.println ("teste 2: Deu certo construir o metodo construtor com valor positivo");
        }
        catch (Exception erro)
        {
            System.err.println ("teste 2: Deu erro construir o metodo construtor com valor positivo");
            System.err.println (erro);
        }
        //teste 3 registre
        try
        {
            ControladorDeErros e3 = new ControladorDeErros (1);
            e3.registreUmErro();
            System.out.println ("teste 3: Deu certo construir caracteres positivos válidos!");
        }
        catch (Exception erro)
        {
            System.err.println ("teste 3: Deu erro construir caracteres positivos válidos!");
            System.err.println (erro);
        }
        //teste 4 registre
        try
        {
            ControladorDeErros e4 = new ControladorDeErros (1);
            e4.registreUmErro();
            e4.registreUmErro();
            System.out.println ("teste 4: Deu certo construir caracteres positivos válidos!");
        }
        catch (Exception erro)
        {
            System.err.println ("teste 4: Deu erro construir caracteres positivos válidos!");
            System.err.println (erro);
        }
        //teste 5 isAtingidoMaximoDeErros
        try
        {
            ControladorDeErros e5 = new ControladorDeErros (1);
            e5.registreUmErro();
            System.out.println ("teste 5: Deu certo testar o metodo  isAtingidoMaximoDeErros !"+ e5.isAtingidoMaximoDeErros());

        }
        catch (Exception erro)
        {
            System.err.println ("teste 5: Deu erro testar o metodo  isAtingidoMaximoDeErros !");
            System.err.println (erro);
        }
        //teste 6 isAtingidoMaximoDeErros
        try
        {
            ControladorDeErros e6 = new ControladorDeErros (2);
            e6.registreUmErro();
            System.out.println ("teste 6: Deu certo testar o metodo  isAtingidoMaximoDeErros !"+ e6.isAtingidoMaximoDeErros());

        }
        catch (Exception erro)
        {
            System.err.println ("teste 6: Deu erro testar o metodo  isAtingidoMaximoDeErros !");
            System.err.println (erro);
        }
        //teste 7 toString
        try
        {
            ControladorDeErros e7 = new ControladorDeErros (1);
            e7.registreUmErro();
            System.out.println ("teste 7: Deu certo testar o metodo toString" + e7.toString());

        }
        catch (Exception erro)
        {
            System.err.println ("teste 7: Deu erro testar o metodo toString!");
            System.err.println (erro);
        }

        ControladorDeErros e8 = null;
        //teste 8 equals
        try
        {
            e8 = new ControladorDeErros(1);
            e8.registreUmErro();
            System.out.println ("teste 8: Deu certo testar o metodo toString" + e8.toString());
        }
        catch (Exception erro)
        {
            System.err.println ("teste 8: Deu erro testar o metodo toString!");
            System.err.println (erro);
        }
        ControladorDeErros e9 = null;
        //teste 9 equals
        try
        {
            e9 = new ControladorDeErros(2);
            e9.registreUmErro();
            System.out.println ("teste 9: Deu certo testar o metodo toString" + e9.toString());
        }
        catch (Exception erro)
        {
            System.err.println ("teste 9: Deu erro testar o metodo toString!");
            System.err.println (erro);
        }
        System.out.println (e8 + " são as letras que estamos testando");
        //teste 10 equals
        System.out.println ("teste 10: Eh "+e8.equals(null)+" que \"1,2\" eh igual (pelo equals) a null");
        //teste 11 equals
        System.out.println ("teste 11: Eh "+e8.equals(e8)+" que \"1,2\" eh igual (pelo equals) a si mesmo");
        // teste 12
        System.out.println ("teste 12: Eh "+e8.equals("1,2")+" que \"1,2\" eh igual (pelo equals) ao String \"1,2\""); //CORRIGIR
        // teste 13
        System.out.println ("teste 13: Eh "+e8.equals(e9)+" que \"1,2\" eh igual (pelo equals) a \"3\"");
        // teste 14
        System.out.println ("teste 14: Eh "+(e8.hashCode()==e9.hashCode())+" que o hashCode de um \"1,2\" eh igual ao hashCode de outro \"2,4\"");
        // teste 15
        System.out.println ("teste 15: Eh "+(e8.hashCode()==e8.hashCode())+" que o hashCode de um \"1,2\" eh igual ao hashCode de outro \"1,2\"");
        // teste 16

        try //teste 17 construtor de copia
        {
            ControladorDeErros e10 = new ControladorDeErros(e8);

            System.out.println ("teste 16: Deu certo usar o construtor de cópia "+e8);
            System.out.println(e8);
            System.out.println(e10);
        }
        catch (Exception erro)
        {
            System.err.println ("teste 16: Deu erro ao usar o construtor de cópia");
            System.err.println (erro);
        }

        // teste 17 construtor de copia
        try
        {
            ControladorDeErros e10 = new ControladorDeErros(null);

            System.out.println ("teste 17: Deu certo usar o construtor de cópia "+e8);

        }
        catch (Exception erro)
        {
            System.err.println ("teste 17: Deu erro ao usar o construtor de cópia");
            System.err.println (erro);
        }
        // teste 18 clone
        try
        {
            ControladorDeErros e11 = (ControladorDeErros) e9.clone();

            System.out.println ("teste 18: Deu certo usar o clone "+e9);
            System.out.println(e9);
            System.out.println(e11);
        }
        catch (Exception erro)
        {
            System.err.println ("teste 18: Deu erro ao clonar");
            System.err.println (erro);
        }
    }
}