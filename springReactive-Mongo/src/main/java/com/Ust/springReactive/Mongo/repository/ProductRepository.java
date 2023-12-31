package com.Ust.springReactive.Mongo.repository;

import com.Ust.springReactive.Mongo.dto.ProductDto;
import com.Ust.springReactive.Mongo.entity.Product;
import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository

public interface ProductRepository extends ReactiveMongoRepository<Product,String> {
    Flux<ProductDto> findByPriceBetween(Range<Double> closed);

//    Flux<ProductDto> findByPriceBetween(Range<Double> priceRange);
}
