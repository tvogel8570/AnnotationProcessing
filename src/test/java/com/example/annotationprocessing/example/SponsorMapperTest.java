package com.example.annotationprocessing.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SponsorMapperTest {
    SponsorMapper cut = SponsorMapperImpl();

    @Test
    void contextLoads() {
        assertThat(cut).isNotNull();
    }

}