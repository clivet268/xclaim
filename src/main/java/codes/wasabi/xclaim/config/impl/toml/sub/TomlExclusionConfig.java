package codes.wasabi.xclaim.config.impl.toml.sub;

import codes.wasabi.xclaim.config.impl.toml.TomlConfig;
import codes.wasabi.xclaim.config.impl.toml.helpers.TomlGroupableValue;
import codes.wasabi.xclaim.config.struct.helpers.ConfigComparators;
import codes.wasabi.xclaim.config.struct.sub.EditorConfig;
import codes.wasabi.xclaim.config.struct.sub.ExclusionConfig;
import codes.wasabi.xclaim.config.struct.sub.RulesConfig;
import com.moandjiezana.toml.Toml;
import org.bukkit.permissions.Permissible;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnknownNullability;

public final class TomlExclusionConfig extends TomlConfig implements ExclusionConfig {

    private final TomlGroupableValue.Int exclusioncenterx;
    private final TomlGroupableValue.Int exclusioncenterz;
    private final TomlGroupableValue.Int exclusionradius;
    public TomlExclusionConfig(@Nullable Toml table) {
        super(table);
        this.exclusioncenterx = new TomlGroupableValue.Int(table, "exclusion-center-x", ConfigComparators.INT_NATURAL_OR_INF);
        this.exclusioncenterz = new TomlGroupableValue.Int(table, "exclusion-center-y", ConfigComparators.INT_NATURAL_OR_INF);
        this.exclusionradius = new TomlGroupableValue.Int(table, "exclusion-radius", ConfigComparators.INT_NATURAL_OR_INF);
    }

    public @UnknownNullability Boolean useExclusion() {
        return this.getBoolean("use-exclusion");
    }

    //TODO Permissible needed?
    public @UnknownNullability Integer exclusionCenterX(@Nullable Permissible target) {
        return this.exclusioncenterx.get(target);
    }

    //TODO Permissible needed?
    public @UnknownNullability Integer exclusionCenterZ(@Nullable Permissible target) {
        return this.exclusioncenterz.get(target);
    }

    //TODO Permissible needed?
    public @UnknownNullability Integer exclusionRadius(@Nullable Permissible target) {
        return this.exclusionradius.get(target);
    }

}
