package com.world.wild.news.service;

import com.world.wild.news.dto.NewsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    private static final List<NewsDto> news;

    static {
        news = List.of(new NewsDto("Bruno", "Banco de dados relacional",
                        """
                                A grande característica de um Banco de Dados Relacional é o fato dele possuir o que chamamos de chaves.
                                                                
                                Uma chave é um identificador único que pode ser atribuído a uma coluna de uma tabela do banco.
                                                                
                                Dois exemplos de chaves mais usadas são:
                                                                
                                1 – As “chaves primárias”: que são os identificadores únicos da própria tabela
                                                                
                                2 – As !chaves estrangeiras”: que são referências as chaves primárias de outras tabelas.
                                """, ""),
                new NewsDto("Eduardo", "Banco de dados não relacional",
                        """
                                Os Banco de Dados não Relacionais, também chamados de Banco de Dados NoSQL, não possuem chaves, tabelas e nem colunas.
                                                                
                                Ao invés disso, o Banco de Dados não Relacional usa um modelo de armazenamento otimizado para o tipo de dado que está sendo armazenado.
                                                                
                                Existem 4 tipos: O por Doumento utiliza uma string para denominar uma base de dados no formato JSON (que também pode ser encodada em outros formatos). Os documentos não precisam manter a estrutura idêntica, gerando um ganho em flexibilidade.
                                """, ""),
                new NewsDto("Gabriel", "NOTAS DA ATUALIZAÇÃO 6.07 DO VALORANT",
                        """
                                O Bind finalmente voltou. Vocês vão perceber algumas alterações significativas depois dessa longa ausência das filas Sem Classificação e Competitiva. Nos digam o que acharam.
                                                                
                                Ainda nessas Notas de Atualização: a Flecha Rastreadora do Sova sofreu algumas alterações e nosso sistema de intervenção para ociosidade/abandono de fila foi melhorado.
                                """, ""),
                new NewsDto("Murilo", "Introduction to the Angular docs",
                        """
                                Angular is an application-design framework and development platform for creating efficient and sophisticated single-page apps.
                                                                
                                These Angular docs help you learn and use the Angular framework and development platform, from your first application to optimizing complex single-page applications for enterprises. Tutorials and guides include downloadable examples to help you start your projects.
                                """, ""));
    }

    public ResponseEntity<List<NewsDto>> loadNews() {
        return ResponseEntity.ok().body(news);
    }
}
