package com.learning_api.entities.reason;

import java.util.Date;

public final class ReasonEntityBuilder {
    private String id;
    private String name;
    private String description;
    private String creator;
    private Date createdAt;
    private Date updatedAt;

    public ReasonEntityBuilder setId(final String id) {
        this.id = id;
        return this;
    }

    public ReasonEntityBuilder setName(final String name) {
        this.name = name;
        return this;
    }

    public ReasonEntityBuilder setDescription(final String description) {
        this.description = description;
        return this;
    }

    public ReasonEntityBuilder setCreator(final String creator) {
        this.creator = creator;
        return this;
    }

    public ReasonEntityBuilder setCreatedAt(final Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ReasonEntityBuilder setUpdatedAt(final Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public ReasonEntity build() {
        return new ReasonEntity(
                this.id,
                this.name,
                this.description,
                this.creator,
                this.createdAt,
                this.updatedAt);
    }
}
