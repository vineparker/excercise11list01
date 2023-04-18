import java.util.Scanner;

class Main 
{
  /* Faça um Programa que peça 2 números inteiros e um número real. 
  Calcule e mostre: 
    1.o produto do dobro do primeiro com metade do segundo 
      2.A soma do triplo do primeiro com o terceiro.
        3.O terceiro elevado ao cubo.*/ 
  public static void main(String[] args) 
  {
    // input
    Scanner input = new Scanner(System.in);
    String textoUm = "Digite um número inteiro: ";
    String textoDois = "Digite OUTRO número inteiro: ";
    String textoTres = "Digite um número REAL: ";

    // informe o primeiro numero inteiro
    System.out.print(textoUm);
    int num1 = input.nextInt();

    // informe o segundo numero inteiro
    System.out.print(textoDois);
    int num2 = input.nextInt();

    // informe o terceiro numero 
    System.out.print(textoTres);
    float num3 = input.nextFloat();

    // calculos
    float produto = (num1 + num1) * (num2 - (num2 / 2));
    float soma = (num1 * 3) + num3;
    float potencia = (num3 * num3 * num3);


    System.out.println("O produto do dobro do primeiro número com a metade do segundo é igual a: " + produto );
    System.out.println("A soma do triplo do primeiro com o terceiro é igual a : " + soma);
    System.out.println("O terceiro número elevado ao cubo é igual a: " + potencia);

    input.close();
  }
}





