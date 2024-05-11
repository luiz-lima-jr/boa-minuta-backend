package br.com.bomtransporte.boaminuta.model;

import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListarFrete {

    private Long qtd;
    private List<FreteEntity> fretes;

}
