//journalApp/src/main/java/net/engineeringdigest/journalApp/entity/User.java

package net.engineeringdigest.journalApp.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;

@Document(collection = "users")
@Data
@Builder
public class User {
    @Id
    private ObjectId id;

    @Indexed(unique = true)
    @NonNull
    private String userName;

    @NonNull
    private String password;

    @Builder.Default
    @DBRef
    private List<JournalEntry> journalEntries = new ArrayList<>();

    private List<String> roles;
}
