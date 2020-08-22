package view;

import model.Reader;

public class ConsoleHelper {
    BookView bookView = new BookView();
    ReaderView readerView = new ReaderView();

    public void getView(){
         bookView.showBookMenu();
    }
}
