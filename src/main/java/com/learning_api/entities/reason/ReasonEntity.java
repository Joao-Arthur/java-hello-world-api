package com.learning_api.entities.reason;

import java.util.Date;

public final class ReasonEntity {
    public final String id;
    public final String name;
    public final String description;
    public final String creator;
    public final Date createdAt;
    public final Date updatedAt;

    public ReasonEntity(
            final String id,
            final String name,
            final String description,
            final String creator,
            final Date createdAt,
            final Date updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creator = creator;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
