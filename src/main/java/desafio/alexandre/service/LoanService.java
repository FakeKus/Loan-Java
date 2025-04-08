package desafio.alexandre.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import desafio.alexandre.dto.RequestDTO;
import desafio.alexandre.form.loan.Loan;
import desafio.alexandre.form.loan.enums.LoanEnum;

@Service    //Indica que esta classe é um componente do Spring e será gerenciada pelo Spring Container
public class LoanService {

    //Lista que será usada para processar os tipos de empréstimos
    private final List<Loan> loansList;

    //Construtor que inicializa a lista de empréstimos
    public LoanService(List<Loan> loansList) {
        this.loansList = loansList;
    }

    //Método que retorna uma lista de tipos de empréstimos com base no RequestDTO fornecido
    public List<LoanEnum> getLoans(RequestDTO requestDTO) {
        //Lista para armazenar os tipos de empréstimos que serão retornados
        List<LoanEnum> loansTypeList = new ArrayList<>();

        //Itera sobre a lista de empréstimos e verifica o tipo de empréstimo para o RequestDTO
        for (Loan loan : loansList) {
            //Chama o método getLoan de cada objeto Loan para determinar o tipo de empréstimo
            LoanEnum type = loan.getLoan(requestDTO);
            //Se não for nulo, adiciona à lista de tipos de empréstimos
            if (type != null) {
                loansTypeList.add(type);
            }
        }
        
        //Retorna a lista de tipos de empréstimos
        return loansTypeList;
    }
}