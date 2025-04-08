package desafio.alexandre.form.loan.types;

import org.springframework.stereotype.Component;

import desafio.alexandre.dto.RequestDTO;
import desafio.alexandre.form.loan.Loan;
import desafio.alexandre.form.loan.enums.LoanEnum;

@Component  //Indica que esta classe é um componente Spring e pode ser injetada em outros locais
public class Consignment implements Loan {

    //Método que determina o tipo de empréstimo com base na renda fornecida no RequestDTO
    @Override
    public LoanEnum getLoan(RequestDTO requestDTO) {
        double income = requestDTO.income();    //Obtém a renda do objeto RequestDTO
        
        //Verifica se a renda é maior ou igual a 5000
        if (income >= 5000) {
            //Retorna o enum correspondente ao empréstimo consignado
            return LoanEnum.CONSIGNMENT;    
        }

        //Retorna null caso a renda não atenda aos critérios
        return null;
    }
}
