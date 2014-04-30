package edu.gmu.bah;

/**
 * Created by student on 4/29/14.
 */
public class Book {

    private String _title;

    public Book() {
        // Empty constructor (not required)
    }

    public Book(String title) {
        _title = title;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

}
