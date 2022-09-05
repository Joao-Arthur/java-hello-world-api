package com.learning_api.core.uniqueIdentifier;

import java.util.UUID;

public class UniqueIdentifier {
    public static final String create() {
        return UUID
                .randomUUID()
                .toString();
    }
}
