package com.test.abc.controller;

import com.test.abc.model.domain.Promotion;
import com.test.abc.model.dto.PromotionDTO;
import com.test.abc.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promotion")
public class PromotionController {

    @Autowired
    private PromotionRepository promotionRepository;

    @PostMapping("/savePromotion")
    public ResponseEntity<Promotion> savePromotion(@RequestBody PromotionDTO promotionDTO) {
        Promotion promotion = new Promotion();

        promotion.setPromotion(promotionDTO.getPromotion());
        promotion.setDate(promotionDTO.getDate());

        promotion = promotionRepository.saveAndFlush(promotion);

        return new ResponseEntity<>(promotion, HttpStatus.OK);
    }
}





