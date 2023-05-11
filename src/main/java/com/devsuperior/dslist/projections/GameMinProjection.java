package com.devsuperior.dslist.projections;

import jakarta.persistence.criteria.CriteriaBuilder;

public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();

}
