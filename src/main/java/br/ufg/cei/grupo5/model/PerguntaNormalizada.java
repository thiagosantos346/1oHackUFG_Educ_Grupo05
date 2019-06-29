package br.ufg.cei.grupo5.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author Iago Bruno
 * @since 1.0
 */
@Data
@Entity
@Table(name = "perguntas_normalizadas")
public class PerguntaNormalizada extends BasicModel {

  @Column
  private String titulo;

  @Column
  private String pergunta;

  @ManyToOne
  @JoinColumn(name = "professor_id")
  private Usuario professor;

  @ManyToOne
  @JoinColumn(name = "pergunta_original_id")
  private PerguntaOriginal perguntaOriginal;

  @ManyToOne
  @JoinColumn(name = "resposta_normalizada_id")
  private RespostaNormalizada respostaNormalizada;

}
