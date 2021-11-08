package booksPackage;

// NAME: EYLUL APPAK
// STUDENT ID: 19070006015

public class Book {
    private String id, title, category, author, award, rating, year, numOfPages, description;
    
    public Book(String id, String title, String category, String author, String award, 
                String rating, String year, String numOfPages, String description){
        this.id = id;
        this.title = title;
        this.category = category;
        this.author = author;
        this.award = award;
        this.rating = rating;
        this.year = year;
        this.numOfPages = numOfPages;
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public String getAward() {
        return award;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getNumOfPages() {
        return numOfPages;
    }

    public String getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }
    
    
    
}
