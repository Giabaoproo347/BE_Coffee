package com.codegym.repositories;

import com.codegym.models.ProductPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPictureRepository extends JpaRepository<ProductPicture, Long> {
}
