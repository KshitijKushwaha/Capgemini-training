public class Book {
    String title;
    int publicationYear;
    Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }

    public void display(){
        System.out.println("Title -> "+title);
        System.out.println("Publication Year -> "+publicationYear);  
        System.out.println();
              
    }

    public static void main(String[] args) {
        Book b=new Book("Treasure Island", 1883);
        b.display();
        Author a1=new Author("Jane Austen", "Jane Austen was an English novelist known primarily for her six novels, which implicitly interpret, critique, and comment on the English landed gentry at the end of the 18th century. Austen's plots often explore the dependence of women on marriage for the pursuit of favourable social standing and economic security. Her works are implicit critiques of the novels of sensibility of the second half of the 18th century and are part of the transition to 19th-century literary realism.[2][b] Her use of social commentary, realism, wit, and irony have earned her acclaim amongst critics and scholars.", "Pride and Prejudice", 1813);
        Author a2=new Author("Lewis Carroll", "Charles Lutwidge Dodgson better known by his pen name Lewis Carroll, was an English author, poet, mathematician, photographer and reluctant Anglican deacon. His most notable works are Alice's Adventures in Wonderland (1865) and its sequel Through the Looking-Glass (1871). He was noted for his facility with word play, logic, and fantasy. His poems Jabberwocky (1871) and The Hunting of the Snark (1876) are classified in the genre of literary nonsense. Some of Alice's nonsensical wonderland logic reflects his published work on mathematical logic.", "Alice's Adventures in Wonderland", 1865);
        a1.display();
        a2.display();
    }
}

class Author extends Book{
    String name,bio;
    Author(String name,String bio,String title,int publicationYear){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }

    public void display(){
        System.out.println("Name -> "+name);
        System.out.println("Bio -> "+bio);
        System.out.println("Title -> "+title);
        System.out.println("Publication Year -> "+publicationYear);
        System.out.println();
        
    }
}
