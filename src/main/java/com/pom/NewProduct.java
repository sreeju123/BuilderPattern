package com.pom;

/**
 * @author Sreej
 */
public class NewProduct {

    private String name;
    private Integer price;
    private String manufacturer;
    private String category;
    private String description;
    private String tags;

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getTags() {
        return tags;
    }


    public NewProduct(String name, Integer price, String manufacturer, String category, String description, String tags) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.category = category;
        this.description = description;
        this.tags = tags;
    }

    public static NewProductBuilder builder() {
        return new NewProductBuilder();
    }

    public static class NewProductBuilder {
        private String name;
        private Integer price;
        private String manufacturer;
        private String category;
        private String description;
        private String tags;

        public NewProduct build() {
            return new NewProduct(name, price, manufacturer, category, description, tags);
        }

        public NewProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public NewProductBuilder setPrice(Integer price) {
            this.price = price;
            return this;
        }

        public NewProductBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public NewProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public NewProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public NewProductBuilder setTags(String tags) {
            this.tags = tags;
            return this;
        }


    }

}
