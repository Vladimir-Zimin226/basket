package pro.sky.java.basket.repository;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


@Component
@SessionScope
public class Basket {

    private final List<Integer> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public List<Integer> addStore(List<Integer> idList) {
       items.addAll(idList);
        return idList;
    }

    public List<Integer> get() {

        return Collections.unmodifiableList(items);
    }
}
