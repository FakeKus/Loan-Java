package desafio.alexandre.form.loan.enums;

public enum LoanEnum {
    //Define os tipos de empréstimos e suas taxas de juros
    PERSONAL(4),    //Empréstimo pessoal com taxa de juros 4%
    GUARANTEED(3),  //Empréstimo garantido com taxa de juros 3%
    CONSIGNMENT(2); //Empréstimo consignado com taxa de juros 2%

    //Campo que armazena a taxa de juros associada a cada tipo de empréstimo
    private final int interestRate;

    //Construtor que inicializa a taxa de juros para cada tipo de empréstimo
    LoanEnum(int interestRate) {
        this.interestRate = interestRate;
    }

    //Método público para obter a taxa de juros associada ao tipo de empréstimo
    public int getInterestRate() {
        return interestRate;
    }
}