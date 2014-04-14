package app.controllers;

import app.models.Teste;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.ValidationMessage;

@Resource
public class TesteController {


    private Result result;
    private Validator validator;

    public TesteController(Result result, Validator validator) {
        this.result = result;
        this.validator = validator;
    }

    public void formulario(Teste t) {
        result.include("teste",t);
    }

    public void salvar(Teste teste) {

        if(teste.getId() == null) {
            validator.add(new I18nMessage("ID","teste.campo.obrigatorio","ID"));
        }

        if(teste.getNome() == null){
            validator.add(new I18nMessage("Nome","teste.campo.obrigatorio","nome"));
        }

        validator.onErrorRedirectTo(this).formulario(teste);

        result.include("message","teste salvo com sucesso");
        result.redirectTo(this).formulario(teste);
    }

}
