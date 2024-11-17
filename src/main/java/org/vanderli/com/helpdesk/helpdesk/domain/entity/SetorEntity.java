package org.vanderli.com.helpdesk.helpdesk.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SetorEntity {

    private Long idSetor;
    private String nomeSetor;
    private String descricaoSetor;
    private String localizcaoSetor;

}
