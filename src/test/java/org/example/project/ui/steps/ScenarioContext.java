package org.example.project.ui.steps;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
        private static ScenarioContext instance;
        private Map<String, Object> data;

        private ScenarioContext() {
            data = new HashMap<>();
        }

        public static ScenarioContext getInstance() {
            if (instance == null) {
                instance = new ScenarioContext();
            }
            return instance;
        }

        public void saveData(String key, Object value) {
            data.put(key, value);
        }

        public <T> T getData(String key) { //TODO: Class <T> type , type.cast. DO WE NEED ANOTHER METHOD?
            return (T) data.get(key);
        }

        public void clearData() {
            data.clear();
        }
    }
    

