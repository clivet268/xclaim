package io.github.wasabithumb.xclaim.platform.data.sound;

import org.bukkit.Sound;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import static org.bukkit.Sound.*;

public record BukkitPlatformSound(
        @NotNull Sound handle
) implements PlatformSound {

    public static @NotNull Sound parseNamed(@NotNull NamedPlatformSound named) {
        return switch (named) {
            case MAGIC    -> BLOCK_ENCHANTMENT_TABLE_USE;
            case CLICK    -> Sound.UI_BUTTON_CLICK;
            case EXP      -> Sound.ENTITY_EXPERIENCE_ORB_PICKUP;
            case LEVEL    -> Sound.ENTITY_PLAYER_LEVELUP;
            case WILDCARD -> Sound.ENTITY_GHAST_AMBIENT;
        };
    }

    @Contract("_ -> new")
    public static @NotNull PlatformSound of(@NotNull Sound sound) {
        if (sound.equals(BLOCK_ENCHANTMENT_TABLE_USE)){
            return NamedPlatformSound.MAGIC;
        } else if (sound.equals(UI_BUTTON_CLICK)){
            return NamedPlatformSound.CLICK;
        } else if (sound.equals(ENTITY_EXPERIENCE_ORB_PICKUP)){
            return NamedPlatformSound.EXP;
        } else if (sound.equals(ENTITY_PLAYER_LEVELUP)){
            return NamedPlatformSound.LEVEL;
        } else if (sound.equals(ENTITY_GHAST_AMBIENT)){
            return NamedPlatformSound.WILDCARD;
        }
        return new BukkitPlatformSound(sound);
    }

    //

    @Override
    public @NotNull String name() {
        return this.handle.name();
    }

}
