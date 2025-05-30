// journalApp/src/test/java/net/engineeringdigest/journalApp/service/UserArgumentsProvider.java

package net.engineeringdigest.service;

import net.engineeringdigest.journalApp.entity.User;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class UserArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of(User.builder().userName("shyam").password("shyam123").build()),
                Arguments.of(User.builder().userName("suraj").password("").build())
        );
    }
}