package desafio.alexandre.form.loan.types;

import org.springframework.stereotype.Component;

import desafio.alexandre.dto.RequestDTO;
import desafio.alexandre.form.loan.Loan;
import desafio.alexandre.form.loan.enums.LoanEnum;

@Component  //Indica que esta classe é um componente Spring e pode ser injetada em outros locais
public class Personal implements Loan {

    //Método que determina o tipo de empréstimo com base nas informações fornecidas no RequestDTO
    @Override
    public LoanEnum getLoan(RequestDTO requestDTO) {
        int age = requestDTO.age();                 //Obtém a idade do objeto RequestDTO
        double income = requestDTO.income();        //Obtém a renda do objeto RequestDTO
        String location = requestDTO.location();    //Obtém a localização do objeto RequestDTO

        //Verifica se a renda é menor ou igual a 3000
        if (income <= 3000) {
            //Retorna o enum correspondente ao empréstimo pessoal
            return LoanEnum.PERSONAL;

        //Verifica se a renda está entre 3000 e 5000, se idade é menor que 30 e a localização é "SP"
        } else if (income > 3000 && income < 5000 && age < 30 && location.equalsIgnoreCase("SP")){
            //Retorna o enum correspondente ao empréstimo pessoal
            return LoanEnum.PERSONAL;
        }

        //Retorna null caso nenhuma das condições seja atendida
        return null;
    }
}