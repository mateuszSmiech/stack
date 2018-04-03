package pl.dominisz.java8desktop.stack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class Node {

    private Node prev;
    private Node next;
    private String value;


}
