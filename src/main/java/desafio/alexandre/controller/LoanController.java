package desafio.alexandre.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.alexandre.dto.LoanDTO;
import desafio.alexandre.dto.RequestDTO;
import desafio.alexandre.dto.ReturnDTO;
import desafio.alexandre.form.loan.enums.LoanEnum;
import desafio.alexandre.service.LoanService;

@RestController
@RequestMapping("/customer-loans")  //Define o endpoint base para o controlador
public class LoanController {

    //Injeta o serviço responsável pela lógica de negócios
    private final LoanService loanService;

    //Construtor para injeção do LoanService
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping    //Define que este método responde a requisições HTTP POST
    public ResponseEntity<?> getLoans(@RequestBody RequestDTO requestDTO) {
        //Obtém a lista de empréstimos a partir do serviço
        List<LoanEnum> loansTypeList = loanService.getLoans(requestDTO);

        //Converte os tipos de empréstimos em objetos LoanDTO
        List<LoanDTO> loans = new ArrayList<>();
        for (LoanEnum type : loansTypeList) {
            loans.add(new LoanDTO(type, type.getInterestRate()));
        }
        //Cria um objeto ReturnDTO com o nome do cliente e a lista de empréstimos
        ReturnDTO response = new ReturnDTO(requestDTO.name(), loans);

        //Retorna a resposta HTTP com 0 corpo contendo o objeto ReturnDTO
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}