import java.sql.SQLOutput;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite quantas pessoas serão digitas : ");
    int opcao , menores;

    opcao = sc.nextInt();

    Pessoa[] p = new Pessoa[opcao];

    for (int i = 0; i < opcao; i++) {
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();


        p[i] = new Pessoa(nome,idade,altura);
    }

    double somaAltura = 0.0;

    for(int i = 0; i < opcao; i++){
        somaAltura += p[i].getAltura();
    }
    double alturaMedia = somaAltura/opcao;

    System.out.println("Altura media dos nomes é " + alturaMedia);

    int cont = 0;
    for(int i = 0; i < opcao; i++){
        if(p[i].getIdade()<16){
            cont++;
        }
    }
    double percent = ((double)cont / opcao) * 100;


    System.out.printf("Pessoas com menos de 16 anos %.1f%%%n", percent);

    for(int i = 0; i < opcao; i++){
        if(p[i].getIdade()<16){
            System.out.println(p[i].getNome());
        }
    }
}

