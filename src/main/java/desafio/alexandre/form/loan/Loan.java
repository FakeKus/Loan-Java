package desafio.alexandre.form.loan;

import desafio.alexandre.dto.RequestDTO;
import desafio.alexandre.form.loan.enums.LoanEnum;

public interface Loan {
    /**
     * Método que deve ser implementado pelas classes que determinam o tipo de empréstimo.
     * 
     * @param requestDTO Objeto que contém as informações necessárias (idade, renda, localização).
     * @return Um valor do enum LoanEnum que representa o tipo de empréstimo.
     */
    LoanEnum getLoan (RequestDTO requestDTO);
}