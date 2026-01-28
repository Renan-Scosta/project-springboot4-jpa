package com.renan.course.services;

import com.renan.course.entities.Order;
import com.renan.course.entities.User;
import com.renan.course.repositories.OrderRepository;
import com.renan.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository OrderRepository;

    public List<Order> findAll() {
        return OrderRepository.findAll();
    }

    public Order findById(Long id) {

        Optional<Order> obj = OrderRepository.findById(id);

        return obj.get();
    }

}
