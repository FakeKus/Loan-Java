package desafio.alexandre.dto;

import desafio.alexandre.form.loan.enums.LoanEnum;

public record LoanDTO(LoanEnum type, int interestRate) {
}