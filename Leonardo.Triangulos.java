
package classificacaotriangulos;

import java.util.Scanner;

public class ClassificacaoTriangulos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("--Identificador de Triângulos--");
        System.out.print("Insira o tamanho do 1º lado: ");
        int lado_1 = leitor.nextInt();
        System.out.print("Insira o tamanho do 2º lado: ");
        int lado_2 = leitor.nextInt();
        System.out.print("Insira o tananho do 3º lado: ");
        int lado_3 = leitor.nextInt();
       if (lado_1 == lado_2 && lado_2 == lado_3){
		System.out.println("Triangulo Equilatero, pois os três lado são iguais.");
	}else if(lado_1 == lado_2 || lado_2 == lado_3){
		System.out.println("Triângulo Isosceles, pois dois dos lados são iguais.");
		}else
		System.out.println("Triângulo Escaleno, pois os três lados tem medidas diferentetes.");
    }
    
}