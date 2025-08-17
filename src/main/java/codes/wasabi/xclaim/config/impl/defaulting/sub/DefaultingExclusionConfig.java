package codes.wasabi.xclaim.config.impl.defaulting.sub;

import codes.wasabi.xclaim.config.impl.filter.sub.FilterEditorConfig;
import codes.wasabi.xclaim.config.impl.filter.sub.FilterExclusionConfig;
import codes.wasabi.xclaim.config.struct.sub.EditorConfig;
import codes.wasabi.xclaim.config.struct.sub.ExclusionConfig;
import org.bukkit.permissions.Permissible;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnknownNullability;

public final class DefaultingExclusionConfig extends FilterExclusionConfig {

    public DefaultingExclusionConfig(@NotNull ExclusionConfig backing) {
        super(backing);
    }

    //TODO use universal default value here?
    @Override
    public @NotNull Boolean useExclusion() {
        return this.nullFallback(this.backing().useExclusion(), false);
    }

    //TODO use universal default value here?
    @Override
    public @NotNull Integer exclusionCenterX(@Nullable Permissible target) {
        return this.nullFallback(this.backing().exclusionCenterX(target), 0);
    }

    //TODO use universal default value here?
    @Override
    public @NotNull Integer exclusionCenterZ(@Nullable Permissible target) {
        return this.nullFallback(this.backing().exclusionCenterZ(target), 0);
    }

    //TODO use universal default value here?
    @Override
    public @NotNull Integer exclusionRadius(@Nullable Permissible target) {
        return this.nullFallback(this.backing().exclusionRadius(target), 10);
    }
}
