package bookPackage;

class Book{
    private String name;
    private String author;
    private int year;
    public Book(String p_name, String p_author, int p_year){
        name=p_name;
        author=p_author;
        year=p_year;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public String getName(){
        return this.name;
    }
    public void setAuthor(String newAuthor){
        this.author=newAuthor;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setYear(int newYear){
        this.year=newYear;
    }
    public int getYear(){
        return this.year;
    }
}
