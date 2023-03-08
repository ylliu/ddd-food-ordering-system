package com.food.ordering.system.service.domain.ports.output.repository;

import com.food.ordering.system.order.service.domain.entity.Order;

import java.util.Optional;

public interface OrderRepository {
    Order save(Order order);

    Optional<Order> findByTrackingId(String trackingId);

}
