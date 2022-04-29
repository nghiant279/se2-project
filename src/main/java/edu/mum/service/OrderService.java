package edu.mum.service;

import edu.mum.model.Buyer;
import edu.mum.model.Order;
import edu.mum.model.OrderItem;
import edu.mum.model.view.OrderInfo;

import java.io.File;
import java.util.List;

public interface OrderService {
    Order getOrderById(Long id);
    Order saveOrder(Buyer buyer, Order order);
    Order updateOrder(Order order);
    void deleteOrder(Long id);
    OrderItem saveOrderItem(OrderItem orderItem);
    void completeOrder(Order order);
    void cancelOrder(Order order);
    File downloadReceipt(OrderInfo orderInfo) throws Exception;
    OrderItem getOrderItemById(Long itemId);
    List<OrderItem> getOrderItemsBySeller(Long sellerId);
    List<Order> getAll();
    List<OrderItem> getDeliveredOrderItemsByOrder(Long orderId);
}
