package com.leonardofuchs.dslist.projections;

public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();

    // O PROJETION ELE É USADO POIS NÃO PODEMOS ACESSAR OS ATRIBUTOS QUANDO A GENTE FAZ UMA CONSULTA NO JPA QUE SEJA SQL. PQ O JPA USA OUTRA FORMA DE CONSULTA
    // ENTÃO JÁ QUE VAMOS USAR O SQL, PRECISAMOS DO PROJECTION.
}
