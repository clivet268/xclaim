package codes.wasabi.xclaim.config.impl.yaml.sub;

import codes.wasabi.xclaim.config.impl.yaml.YamlConfig;
import codes.wasabi.xclaim.config.struct.helpers.ConfigComparators;
import codes.wasabi.xclaim.config.struct.sub.EditorConfig;
import codes.wasabi.xclaim.config.struct.sub.ExclusionConfig;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.permissions.Permissible;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnknownNullability;

public final class YamlExclusionConfig extends YamlConfig implements ExclusionConfig {

    public YamlExclusionConfig(@Nullable ConfigurationSection section) {
        super(section);
    }

    @Override
    public @UnknownNullability Boolean useExclusion() {
        return this.getBoolean("use-exclusion");
    }

    @Override
    public @UnknownNullability Integer exclusionCenterX(@Nullable Permissible target) {
        assert section != null;
        return section.getInt( "exclusion-center-x");
    }

    @Override
    public @UnknownNullability Integer exclusionCenterZ(@Nullable Permissible target) {
        assert section != null;
        return section.getInt( "exclusion-center-z");
    }

    @Override
    public @UnknownNullability Integer exclusionRadius(@Nullable Permissible target) {
        assert section != null;
        return section.getInt( "exclusion-radius");
    }
}
