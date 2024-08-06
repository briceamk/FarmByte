package cm.xenonbyte.farmbyte.uom.vo;

import jakarta.annotation.Nonnull;

import java.util.Objects;
import java.util.UUID;

/**
 * @author bamk
 * @version 1.0
 * @since 06/08/2024
 */
public final class UomCategoryId {
    private final UUID id;

    private UomCategoryId(@Nonnull UUID id) {
        this.id = Objects.requireNonNull(id);
    }

    @Nonnull
    public static UomCategoryId generate(@Nonnull UUID uuid) {
        return new UomCategoryId(Objects.requireNonNull(uuid));
    }

    @Nonnull
    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UomCategoryId that = (UomCategoryId) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
