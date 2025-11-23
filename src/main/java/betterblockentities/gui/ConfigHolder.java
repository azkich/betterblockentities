package betterblockentities.gui;

public class ConfigHolder
{
    public boolean master_optimize = true;

    public boolean optimize_chests = true;
    public boolean optimize_signs = true;
    public boolean optimize_shulkers = true;
    public boolean optimize_beds = true;
    public boolean optimize_bells = true;
    public boolean optimize_decoratedpots = true;
    public boolean optimize_item_frames = true;
    public boolean optimize_rails = true;
    public boolean optimize_fences = true;
    public boolean optimize_campfires = true;
    public boolean optimize_furnaces = true;
    public boolean optimize_hoppers = true;
    public boolean optimize_sculk_sensors = true;
    public boolean optimize_comparators = true;
    public boolean optimize_anvils = true;
    public boolean optimize_pressure_plates = true;
    public boolean optimize_cauldrons = true;
    public boolean optimize_observers = true;
    public boolean optimize_levers = true;
    public boolean optimize_buttons = true;
    public boolean optimize_trapdoors = true;

    public boolean chest_animations = true;
    public boolean render_sign_text = true;
    public boolean shulker_animations = true;
    public boolean bell_animations = true;
    public boolean pot_animations = true;

    public int sign_text_render_distance = 16;
    public int updateType = 0;
    public int smoothness_slider = 25;

    public ConfigHolder copy() {
        ConfigHolder copy = new ConfigHolder();
        copy.master_optimize = master_optimize;
        copy.optimize_chests = optimize_chests;
        copy.optimize_signs = optimize_signs;
        copy.optimize_shulkers = optimize_shulkers;
        copy.optimize_beds = optimize_beds;
        copy.optimize_bells = optimize_bells;
        copy.optimize_decoratedpots = optimize_decoratedpots;
        copy.optimize_item_frames = optimize_item_frames;
        copy.optimize_rails = optimize_rails;
        copy.optimize_fences = optimize_fences;
        copy.optimize_campfires = optimize_campfires;
        copy.optimize_furnaces = optimize_furnaces;
        copy.optimize_hoppers = optimize_hoppers;
        copy.optimize_sculk_sensors = optimize_sculk_sensors;
        copy.optimize_comparators = optimize_comparators;
        copy.optimize_anvils = optimize_anvils;
        copy.optimize_pressure_plates = optimize_pressure_plates;
        copy.optimize_cauldrons = optimize_cauldrons;
        copy.optimize_observers = optimize_observers;
        copy.optimize_levers = optimize_levers;
        copy.optimize_buttons = optimize_buttons;
        copy.optimize_trapdoors = optimize_trapdoors;
        copy.chest_animations = chest_animations;
        copy.render_sign_text = render_sign_text;
        copy.shulker_animations = shulker_animations;
        copy.bell_animations = bell_animations;
        copy.pot_animations = pot_animations;
        copy.sign_text_render_distance = sign_text_render_distance;
        copy.updateType = updateType;
        copy.smoothness_slider = smoothness_slider;
        return copy;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ConfigHolder other)) return false;
        return master_optimize == other.master_optimize
                && optimize_chests == other.optimize_chests
                && optimize_signs == other.optimize_signs
                && optimize_shulkers == other.optimize_shulkers
                && optimize_beds == other.optimize_beds
                && optimize_bells == other.optimize_bells
                && optimize_decoratedpots == other.optimize_decoratedpots
                && optimize_item_frames == other.optimize_item_frames
                && optimize_rails == other.optimize_rails
                && optimize_fences == other.optimize_fences
                && optimize_campfires == other.optimize_campfires
                && optimize_furnaces == other.optimize_furnaces
                && optimize_hoppers == other.optimize_hoppers
                && optimize_sculk_sensors == other.optimize_sculk_sensors
                && optimize_comparators == other.optimize_comparators
                && optimize_anvils == other.optimize_anvils
                && optimize_pressure_plates == other.optimize_pressure_plates
                && optimize_cauldrons == other.optimize_cauldrons
                && optimize_observers == other.optimize_observers
                && optimize_levers == other.optimize_levers
                && optimize_buttons == other.optimize_buttons
                && optimize_trapdoors == other.optimize_trapdoors
                && chest_animations == other.chest_animations
                && render_sign_text == other.render_sign_text
                && shulker_animations == other.shulker_animations
                && bell_animations == other.bell_animations
                && pot_animations == other.pot_animations
                && sign_text_render_distance == other.sign_text_render_distance
                && updateType == other.updateType
                && smoothness_slider == other.smoothness_slider;
    }
}
