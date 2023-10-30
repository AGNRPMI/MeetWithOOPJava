package Seminar04.view;

import Seminar04.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}