package com.batch.working.BatchProcessing.config;

import com.batch.working.BatchProcessing.model.Product;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Product, Product> {

    @Override
    public Product process(Product item) throws Exception {
        //transform logic
        //calculate discounted price
//        int discountedPrice = Integer.parseInt(item.getDiscount().trim());
//        double originalPrice = Double.parseDouble(item.getPrice().trim());
//        double discount = (discountedPrice/100)+originalPrice;
//        double finalPrice = originalPrice - discount;
//        item.setDiscountedPrice(String.valueOf(finalPrice));
        return item;
    }
}
