package com.example.Fitnes.core.dto.products;

public class PageOfRecipeDTO {
    private int number;
    private int size;
    private int total_pages;
    private int total_elements;
    private boolean first;
    private  int number_of_elements;
    private boolean last;
    private RecipeDTO content;

    public PageOfRecipeDTO(int number, int size, int total_pages, int total_elements, boolean first, int number_of_elements, boolean last, RecipeDTO content) {
        this.number = number;
        this.size = size;
        this.total_pages = total_pages;
        this.total_elements = total_elements;
        this.first = first;
        this.number_of_elements = number_of_elements;
        this.last = last;
        this.content = content;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal_elements() {
        return total_elements;
    }

    public void setTotal_elements(int total_elements) {
        this.total_elements = total_elements;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public int getNumber_of_elements() {
        return number_of_elements;
    }

    public void setNumber_of_elements(int number_of_elements) {
        this.number_of_elements = number_of_elements;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public RecipeDTO getContent() {
        return content;
    }

    public void setContent(RecipeDTO content) {
        this.content = content;
    }
}

