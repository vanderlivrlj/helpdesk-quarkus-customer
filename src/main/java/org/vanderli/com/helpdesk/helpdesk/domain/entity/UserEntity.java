package org.vanderli.com.helpdesk.helpdesk.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.vanderli.com.helpdesk.helpdesk.domain.enums.PerfilUsuarioEnum;
import org.vanderli.com.helpdesk.helpdesk.domain.enums.StatusUsuarioEnum;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    Long idUsuario;
    //TODO: Ajustar o tipo dos atributos
    String nomeUsuario;
    String emailUsuario;
    String setorUsuario;
    StatusUsuarioEnum statusUsuario;
    PerfilUsuarioEnum perfilUsuario;
}
