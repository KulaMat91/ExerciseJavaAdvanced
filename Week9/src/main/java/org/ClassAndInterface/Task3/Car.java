package org.ClassAndInterface.Task3;

public class Car {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    class Engine {
        private String typeEngine;

        public void setEngine(String type) {
            this.typeEngine = switch (type) {
                case "economy" -> "diesel";
                case "luxury" -> "electric";
                default -> "petrol";
            };
        }
    }
}
