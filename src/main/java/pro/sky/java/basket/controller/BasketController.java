package pro.sky.java.basket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.basket.service.BasketService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> items) {

        return basketService.add(items);
    }

    @GetMapping("/get")
    public List<Integer> get() {

        return basketService.get();
    }
}