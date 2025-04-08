package desafio.alexandre.dto;

import java.util.List;

public record ReturnDTO (String client, List<LoanDTO> loansList) {
}