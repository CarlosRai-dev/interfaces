package Calculadora;
public class Main {
    public static void main(String[] args) {
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtracao = new Subtracao();
        OperacaoMatematica mutiplicacao = new Mutiplicacao();
        OperacaoMatematica divisao = new Divisao();
        
        double a = 18;
        double b = 2;
        
        
        System.out.println(soma.calcular(a, b));
        System.out.println(subtracao.calcular(a, b));
        System.out.println(mutiplicacao.calcular(a, b));
        System.out.println(divisao.calcular(a, b));
    }
    
}
