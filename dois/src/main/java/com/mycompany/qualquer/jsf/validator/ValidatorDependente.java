package com.mycompany.qualquer.jsf.validator;


import com.mycompany.qualquer.Dependente;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 26/04/2019, 08:55:22
 */
@FacesValidator(value = "validator.Dependente")
public class ValidatorDependente implements Validator {

    @Override
    public void validate(
        FacesContext context,
        UIComponent component,
        Object value) throws ValidatorException {
        Dependente dep = (Dependente) value;

        if (dep.naoValido()) {
            FacesMessage facesMessage = new FacesMessage("dep inválido");
            throw new ValidatorException(facesMessage);
        }
    }

}
