package org.example;



import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class PreferenceService {
    private final List<FoodItem> preferences = new ArrayList<>();

    public void addPreference(FoodItem item) {
        if (!preferences.contains(item)) {
            preferences.add(item);
        }
    }

    public List<FoodItem> getPreferences() {
        return new ArrayList<>(preferences);
    }
}
