/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do veto
 */

void main() {
    
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       double[] number = new double[n];
       double values = 0;


       for (int i = 0; i < n; i++) {
           System.out.println("Digite um numero: ");
           number[i] = sc.nextDouble();

       }

       values += number[0];
       for (int i = 1; i < n; i++) {
           values += number[i];
       }

       for (int i = 0; i < n; i++) {
           System.out.println("Numeros digitados: " + number[i]);
       }

       double average = values / n;


    System.out.println("Valores somados: " + values);
    System.out.println("Media de valores: " + average);
    }

