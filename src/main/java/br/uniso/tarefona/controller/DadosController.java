package br.uniso.tarefona.controller;

import br.uniso.tarefona.model.entity.Dados;
import br.uniso.tarefona.model.repository.DadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DadosController {

    @Autowired
    private DadosRepository repository;

    //grava no banco
    @PostMapping("/dados")
    public boolean gravarDados(@RequestBody Dados dados){
        Dados gravado = repository.save(dados);
        if(gravado == null){
            //não gravou no banco
            return false;
        }
        else{
            //gravou no banco
            return true;
        }
    }

    //le dados do banco
    @GetMapping("/dados")
    public List<Dados> listardados(){
        return repository.findAll();
    }

    //Busca no banco pelo id
    @GetMapping("/dados/id")
    public Dados listarDadosPorId(@RequestParam int id){
        Dados retornado = repository.findDadosById(id);
        return retornado;
    }

    //atualiza no banco
    @PutMapping("/dados")
    public void atualizar (@RequestBody Dados dados){
        Dados gravado = repository.save(dados);
    }
    @DeleteMapping("/dados/{id}")

    void deleteDados(@PathVariable int id){
        repository.deleteById(id);
    }

}
