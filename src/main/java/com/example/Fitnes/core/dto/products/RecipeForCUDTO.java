package com.example.Fitnes.core.dto.products;

public class RecipeForCUDTO {
    private String title;
    private ProductDTO composition;

    public RecipeForCUDTO(String title, ProductDTO composition) {
        this.title = title;
        this.composition = composition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProductDTO getComposition() {
        return composition;
    }

    public void setComposition(ProductDTO composition) {
        this.composition = composition;
    }
}
