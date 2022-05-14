public class TesteDeTracinho {
    public static void main (String[] args)
    {
        //teste 1 construtor
        try
        {
            Tracinhos t1 = new Tracinhos (-1);
            System.out.println ("teste 1: Deu certo construir o metodo construtor com valor negativo");
        }
        catch (Exception erro)
        {
            System.err.println ("teste 1: Deu erro construir o metodo construtor com valor negativo");
            System.err.println (erro);
        }
        //teste 2 construtor
        try
        {
            Tracinhos t2 = new Tracinhos (1);
            System.out.println ("teste 2: Deu certo construir o metodo construtor com valor positivo ");

        }
        catch (Exception erro)
        {
            System.err.println ("teste 2: Deu erro construir o metodo construtor com valor positivo");
            System.err.println (erro);
        }
        //teste 3 revele
        try
        {
            Tracinhos t3 = new Tracinhos(1);
            t3.revele(-1,'a');
            System.out.println ("teste 3: Deu certo testar o metodo revele com valor negativo");
        }
        catch (Exception erro)
        {
            System.err.println ("teste 3: Deu erro testar o metodo revele com valor negativo");
            System.err.println (erro);
        }
        //teste 4 revele
        try
        {
            Tracinhos t3 = new Tracinhos(1);
            t3.revele(2,'a');
            System.out.println (" teste 4: Deu certo testar o metodo revele com valor maior que texto.lenght");
        }
        catch (Exception erro)
        {
            System.err.println ("teste 4: Deu erro testar o metodo revele com valor maior que texto.lenght");
            System.err.println (erro);
        }
        //teste 5 revele
        try
        {
            Tracinhos t3 = new Tracinhos(1);
            t3.revele(0,'a');
            System.out.println ("teste 5: Deu certo testar o metodo revele com valor igual a texto.lenght");
        }
        catch (Exception erro)
        {
            System.err.println ("teste 5: Deu erro testar o metodo revele com valor igual a texto.lenght");
            System.err.println (erro);
        }
        //teste 6 isAindaComTracinhos
        try
        {
            Tracinhos t4 = new Tracinhos(2);
            t4.revele(0,'b'); //posicao 0 temos a letra b na posicao 1 temos tracinho
            System.out.println ("teste 6: Deu certo testar o metodo isAindaComTracinhos " + t4.isAindaComTracinhos());
        }
        catch (Exception erro)
        {
            System.err.println ("teste 6: Deu erro testar o metodo revele com valor igual a texto.lenght");
            System.err.println (erro);
        }
        //teste 7 isAindaComTracinhos
        try
        {
            Tracinhos t5 = new Tracinhos(1);
            t5.revele(0,'b');
            System.out.println ("teste 7: Deu certo testar o metodo isAindaComTracinhos " + t5.isAindaComTracinhos());
        }
        catch (Exception erro)
        {
            System.err.println ("teste 7: Deu erro testar o metodo isAindaComTracinhos");
            System.err.println (erro);
        }
        //teste 8 toString
        try
        {
            Tracinhos t6 = new Tracinhos(1);
            t6.revele(0,'c');
            System.out.println ("teste 8: Deu certo testar o metodo toString "+ t6);
        }
        catch (Exception erro)
        {
            System.err.println ("teste 8: Deu erro testar o metodo toString");
            System.err.println (erro);
        }
        //teste 9 toString/equals
        Tracinhos t7 = null;

        try
        {
            t7 = new Tracinhos(1);
            t7.revele(0,'y');
            System.out.println ("teste 9: Deu certo testar o metodo toString "+t7.toString());

        }
        catch (Exception erro)
        {
            System.err.println ("teste 9: Deu erro testar o metodo toString");
            System.err.println (erro);
        }
        //teste 10 toString/equals
        Tracinhos t8 = null;

        try
        {
            t8 = new Tracinhos(1);
            t8.revele(0,'z');

            System.out.println ("teste 10: Deu certo testar o metodo toString "+t8.toString());

        }
        catch (Exception erro)
        {
            System.err.println ("teste 10: Deu erro testar o metodo toString");
            System.err.println (erro);
        }
        //teste 11
        System.out.println ("teste 11: " + t7 + " é o que estamos testando");
        //teste 10 equals
        System.out.println ("teste 12: Eh "+t7.equals(null)+" que \"y\" eh igual (pelo equals) a null");
        //teste 11 equals
        System.out.println ("teste 13: Eh "+t7.equals(t7)+" que \"y\" eh igual (pelo equals) a si mesmo");
        // teste 12
        System.out.println ("teste 14: Eh "+t7.equals('y')+" que \"y\" eh igual (pelo equals) ao Char \"y\""); //COMOASSIMMDS?
        // teste 13
        System.out.println ("teste 15: Eh "+t7.equals(t8)+" que \"y\" eh igual (pelo equals) a \"z\"");
        // teste 14
        System.out.println ("teste 16: Eh "+(t7.hashCode()==t8.hashCode())+" que o hashCode de um \"f,g,t\" eh igual ao hashCode de outro \"f,g,t\"");
        // teste 15
        System.out.println ("teste 17: Eh "+(t7.hashCode()==t7.hashCode())+" que o hashCode de um \"f,g,t\" eh igual ao hashCode de outro \"f,g,t\"");

        // teste 16 construtor de copia
        try
        {
            Tracinhos t9 = new Tracinhos(t7);

            System.out.println ("teste 18: Deu certo usar o construtor de cópia "+t7);
            System.out.println(t7);
            System.out.println(t9);
        }
        catch (Exception erro)
        {
            System.err.println ("teste 18: Deu erro ao usar o construtor de cópia");
            System.err.println (erro);

        }
        // teste 17 construtor de copia

        try
        {
            Tracinhos t9 = new Tracinhos(null);

            System.out.println ("teste 19: Deu certo usar o construtor de cópia "+t7);

        }
        catch (Exception erro)
        {
            System.err.println ("teste 19: Deu erro ao usar o construtor de cópia");
            System.err.println (erro);
        }
        // teste 18 clone
        try
        {
            Tracinhos t10 = (Tracinhos)t8.clone();

            System.out.println ("teste 20: Deu certo usar o clone "+t8);
            System.out.println(t8);
            System.out.println(t10);
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro ao clonar");
            System.err.println (erro);
        }

    }
}
