package pro.sky.java.basket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.basket.repository.Basket;

import java.util.Collection;
import java.util.List;

@SessionScope
@Service
public class BasketServiceImpl implements BasketService {

    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> add(List<Integer> items) {
        return basket.addStore(items);
    }

    @Override
    public List<Integer> get() {
        return basket.get();

    }
}