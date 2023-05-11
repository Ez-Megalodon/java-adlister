import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) throws JsonProcessingException {
        Album album1 = new Album(1, "The Beatles", "Abbey Road", 1969, 31.2, "Rock");
        Album album2 = new Album(2, "Michael Jackson", "Thriller", 1982, 66.0, "Pop");
        Album album3 = new Album(3, "Pink Floyd", "The Wall", 1979, 30.0, "Rock");
        Album album4 = new Album(4, "Queen", "A Night at the Opera", 1975, 16.0, "Rock");
        Album album5 = new Album(5, "Elvis Presley", "Elvis Presley", 1956, 19.0, "Rock and roll");

        Quote quote1 = new Quote("Oscar Wilde", "Be yourself; everyone else is already taken.", 1);
        Quote quote2 = new Quote("Nelson Mandela", "The greatest glory in living lies not in never falling, but in rising every time we fall.", 2);
        Quote quote3 = new Quote("Maya Angelou", "I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel.", 3);
        Quote quote4 = new Quote("Albert Einstein", "Try not to become a man of success. Rather become a man of value.", 4);
        Quote quote5 = new Quote("Steve Jobs", "Innovation distinguishes between a leader and a follower.", 5);

        Author author1 = new Author(1, "Ernest", "Hemingway");
        Author author2 = new Author(2, "Jane", "Austen");
        Author author3 = new Author(3, "Mark", "Twain");
        Author author4 = new Author(4, "Virginia", "Woolf");
        Author author5 = new Author(5, "F. Scott", "Fitzgerald");

        ArrayList<Quote> quoteArrayList = new ArrayList<>();
        quoteArrayList.add(quote1);
        quoteArrayList.add(quote2);
        quoteArrayList.add(quote3);
        quoteArrayList.add(quote4);
        quoteArrayList.add(quote5);

        ArrayList<Album> albumArrayList = new ArrayList<>();
        albumArrayList.add(album1);
        albumArrayList.add(album2);
        albumArrayList.add(album3);
        albumArrayList.add(album4);
        albumArrayList.add(album5);

        for (Quote quote: quoteArrayList){
            System.out.println(quote.getAuthor() + ":");
            System.out.println(quote.getContent());
            System.out.println("--------------------");
        }


        ObjectMapper mapper = new ObjectMapper();
        for (Album a: albumArrayList) {
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(a));
        }
    }
}
