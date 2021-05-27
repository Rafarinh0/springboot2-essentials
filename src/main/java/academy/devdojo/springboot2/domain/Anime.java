package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
//gerar tabela no banco
@Entity
@NoArgsConstructor
public class Anime {
    @Id
    //o campo id tem que ser autogerado a cada inserção e eh chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

}
