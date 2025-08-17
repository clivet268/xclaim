package codes.wasabi.xclaim.config.struct.sub;

import codes.wasabi.xclaim.config.struct.Config;
import org.bukkit.permissions.Permissible;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnknownNullability;

public interface ExclusionConfig extends Config {

    @UnknownNullability Boolean useExclusion();

    @UnknownNullability Integer exclusionCenterX(@Nullable Permissible target);

    @UnknownNullability Integer exclusionCenterZ(@Nullable Permissible target);

    @UnknownNullability Integer exclusionRadius(@Nullable Permissible target);

}
