package codes.wasabi.xclaim.config.impl.filter.sub;

import codes.wasabi.xclaim.config.impl.filter.FilterConfig;
import codes.wasabi.xclaim.config.struct.sub.EditorConfig;
import codes.wasabi.xclaim.config.struct.sub.ExclusionConfig;
import org.jetbrains.annotations.NotNull;

public abstract class FilterExclusionConfig extends FilterConfig implements ExclusionConfig {

    public FilterExclusionConfig(@NotNull ExclusionConfig backing) {
        super(backing);
    }

    @Override
    protected @NotNull ExclusionConfig backing() {
        return (ExclusionConfig) super.backing();
    }

}
