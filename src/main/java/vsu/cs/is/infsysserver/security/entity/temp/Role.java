package vsu.cs.is.infsysserver.security.entity.temp;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static vsu.cs.is.infsysserver.security.entity.temp.Permission.*;

@Getter
@RequiredArgsConstructor
public enum Role {
    USER(Set.of(
            USER_READ,
            USER_CREATE,
            USER_UPDATE,
            USER_DELETE
    )),
    MODERATOR(
            Set.of(
                    USER_READ,
                    USER_CREATE,
                    USER_UPDATE,
                    USER_DELETE,
                    MODERATOR_READ,
                    MODERATOR_UPDATE,
                    MODERATOR_CREATE,
                    MODERATOR_DELETE
            )
    ),
    ADMIN(
            Set.of(
                    USER_READ,
                    USER_CREATE,
                    USER_UPDATE,
                    USER_DELETE,
                    MODERATOR_READ,
                    MODERATOR_UPDATE,
                    MODERATOR_CREATE,
                    MODERATOR_DELETE,
                    ADMIN_READ,
                    ADMIN_UPDATE,
                    ADMIN_DELETE,
                    ADMIN_CREATE)
    );

    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }
}
