
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object that){

        Book thatt = (Book) that; 
        
        if((this.name.equals(thatt.name)) && (this.publicationYear == thatt.publicationYear)){
            return true;
        }
        
        
        return false;
    }

}
