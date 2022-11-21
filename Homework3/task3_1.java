package Homework3;

import Homework3.src.Presenter.Presenter;
import Homework3.src.View.ConsoleView;
import Homework3.src.View.View;

public class task3_1 {
    public static void main(String[] args) {
        Presenter<View> prog = new Presenter<View>(new ConsoleView());
        prog.start();
    }
}
